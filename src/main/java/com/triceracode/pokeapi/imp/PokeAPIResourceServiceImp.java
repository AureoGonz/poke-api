package com.triceracode.pokeapi.imp;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.triceracode.pokeapi.PokeAPIResourceService;
import com.triceracode.pokeapi.endpoint.ResourceEndpoint;
import com.triceracode.pokeapi.model.ResourceBatch;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.Objects;

import static com.google.common.base.CaseFormat.LOWER_HYPHEN;
import static com.google.common.base.CaseFormat.UPPER_CAMEL;

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
    public ResourceBatch list(Class<?> clazz) throws IOException {
        ResourceEndpoint resourceEndpoint = retrofit(
                UPPER_CAMEL.to(LOWER_HYPHEN, clazz.getSimpleName()) + "/")
                .create(ResourceEndpoint.class);
        Response<ResourceBatch> resourceBatchResponse = resourceEndpoint.list().execute();
        if(resourceBatchResponse.isSuccessful()) {
            return resourceBatchResponse.body();
        } return null;
    }

    @Override
    public <T> T get(Class<T> clazz, Long id) throws IOException {
        ResourceEndpoint resourceEndpoint = retrofit(
                UPPER_CAMEL.to(LOWER_HYPHEN, clazz.getSimpleName()) + "/")
                .create(ResourceEndpoint.class);
        Response<ResponseBody> resourceResponse = resourceEndpoint.byId(id).execute();
        if(resourceResponse.isSuccessful() && resourceResponse.body() != null) {
            return this.gson.fromJson(resourceResponse.body().string(), clazz);
        } return null;
    }
}
