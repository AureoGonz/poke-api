package com.triceracode.pokeapi.endpoint.move;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.move.MoveAilment;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MoveAilmentEndpoint {

    @GET("move-ailment/")
    Call<ResourceBatch> list(@Query("limit") Long limit, @Query("offset") Long offset);

    @GET("move-ailment/?limit=" + Long.MAX_VALUE + "&offset=0")
    Call<ResourceBatch> list();

    @GET("move-ailment/{id}")
    Call<MoveAilment> byId(@Path("id") Long id);

    @GET("move-ailment/{name}")
    Call<MoveAilment> byName(@Path("name") String name);

}
