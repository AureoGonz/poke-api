package com.triceracode.pokeapi.imp;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.triceracode.pokeapi.PokeAPIResourceService;
import com.triceracode.pokeapi.endpoint.ResourceEndpoint;
import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.Endpointable;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class PokeAPIResourceServiceImp implements PokeAPIResourceService {

    private final String baseUrl;
    private final Gson gson;

    public PokeAPIResourceServiceImp() {
        this.baseUrl = Objects.requireNonNullElse(System.getenv("POKE_API_URL"), "https://pokeapi.co/api/v2/");
        this.gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
    }

    public Retrofit retrofit(String resource) {
        return new Retrofit.Builder()
                .baseUrl(this.baseUrl + resource)
                .addConverterFactory(GsonConverterFactory.create(this.gson))
                .build();
    }

    @Override
    public ResourceBatch list(Class<? extends Endpointable> clazz) throws IOException {
        return list(clazz, Long.MAX_VALUE, 0L);
    }

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
                upperCamelToLowerHiphen(clazz.getSimpleName()) + "/")
                .create(ResourceEndpoint.class);
    }

    private static String upperCamelToLowerHiphen(String conv) {
        String hyphen = Arrays.stream(conv.split("")).map(c -> {
            if(c.matches("[A-Z]")){
                return "-" + c.toLowerCase();
            }
            return c;
        }).collect(Collectors.joining());
        return hyphen.startsWith("-") ? hyphen.substring(1) : hyphen;
    }

}
