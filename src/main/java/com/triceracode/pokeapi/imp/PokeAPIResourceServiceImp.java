package com.triceracode.pokeapi.imp;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.triceracode.pokeapi.config.PokeAPIConfig;
import com.triceracode.pokeapi.PokeAPIResourceService;
import com.triceracode.pokeapi.endpoint.ResourceEndpoint;
import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.Endpointable;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PokeAPIResourceServiceImp implements PokeAPIResourceService {

    private final String baseUrl;
    private final Gson gson;
    private final OkHttpClient okHttpClient;

    public PokeAPIResourceServiceImp(PokeAPIConfig config) {
        this.baseUrl = config.urlBase;
        this.gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
        Cache cache = null;
        if(config.cacheSize != null) {
            File cacheDir = new File(config.cacheDir);
            int cacheSize = config.cacheSize > 0 ? config.cacheSize : 10;
            if(!cacheDir.exists() && cacheDir.mkdir())
                cache = new Cache(cacheDir, (long) cacheSize * 1024 * 1024);
        }
        okHttpClient = new OkHttpClient.Builder()
                .cache(cache).build();
    }

    public PokeAPIResourceServiceImp() {
        this(new PokeAPIConfig());
    }

    public Retrofit retrofit(String resource) {
        return new Retrofit.Builder()
                .baseUrl(this.baseUrl + resource)
                .addConverterFactory(GsonConverterFactory.create(this.gson))
                .client(okHttpClient)
                .build();
    }

    @Override
    public ResourceBatch list(Class<? extends Endpointable> clazz) throws IOException {
        ResourceEndpoint resourceEndpoint = getResourceEndpoint(clazz);
        Response<ResourceBatch> resourceBatchResponse = resourceEndpoint.list().execute();
        if(resourceBatchResponse.isSuccessful()) {
            return resourceBatchResponse.body();
        } return null;    }

    @Override
    public ResourceBatch list(Class<? extends Endpointable> clazz, Long limit, Long offset) throws IOException {
        ResourceEndpoint resourceEndpoint = getResourceEndpoint(clazz);
        Response<ResourceBatch> resourceBatchResponse = resourceEndpoint.list(limit, offset).execute();
        if(resourceBatchResponse.isSuccessful()) {
            return resourceBatchResponse.body();
        } return null;
    }

    @Override
    public <T extends Endpointable> T get(Class<T> clazz, Long id) throws IOException {
        ResourceEndpoint resourceEndpoint = getResourceEndpoint(clazz);
        Response<ResponseBody> resourceResponse = resourceEndpoint.byId(id).execute();
        if(resourceResponse.isSuccessful() && resourceResponse.body() != null) {
            return this.gson.fromJson(resourceResponse.body().string(), clazz);
        } return null;
    }

    @Override
    public <T extends Endpointable> T get(Class<T> clazz, String name) throws IOException {
        ResourceEndpoint resourceEndpoint = getResourceEndpoint(clazz);
        Response<ResponseBody> resourceResponse = resourceEndpoint.byName(name).execute();
        if(resourceResponse.isSuccessful() && resourceResponse.body() != null) {
            return this.gson.fromJson(resourceResponse.body().string(), clazz);
        } return null;
    }

    private ResourceEndpoint getResourceEndpoint(Class<? extends Endpointable> clazz) {
        return retrofit(
                upperCamelToLowerHyphen(clazz.getSimpleName()) + "/")
                .create(ResourceEndpoint.class);
    }

    private static String upperCamelToLowerHyphen(String conv) {
        String hyphen = Arrays.stream(conv.split("")).map(c -> {
            if(c.matches("[A-Z]")){
                return "-" + c.toLowerCase();
            }
            return c;
        }).collect(Collectors.joining());
        return hyphen.startsWith("-") ? hyphen.substring(1) : hyphen;
    }

}
