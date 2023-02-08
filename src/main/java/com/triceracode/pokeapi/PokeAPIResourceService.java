package com.triceracode.pokeapi;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.Endpointable;

import java.io.IOException;

/**
 * Help to retrieve the information from PokeApi v2 through declarative programming.
 */
public interface PokeAPIResourceService {

    /**
     * List resource batch of any object declared in the documentation of PokeApi.
     *
     * @param clazz a Class of any Endpointable resource that describe an object of PokeApi
     * @return the resource batch with the id, name and url of all resources
     * @throws IOException in case the PokeApi request or transformation to Java Objects fail
     * @see com.triceracode.pokeapi.model.resource.Endpointable
     */
    ResourceBatch list(Class<? extends Endpointable> clazz) throws IOException;

    /**
     * List resource batch of any object declared in the documentation of PokeApi.
     *
     * @param clazz a Class of any Endpointable resource that describe an object of PokeApi
     * @param limit  the limit of the requested page to PokeApi endpoint
     * @param offset the offset of the requested page to PokeApi endpoint
     * @return the resource batch with the id, name and url of all resources
     * @throws IOException in case the PokeApi request or transformation to Java Objects fail
     * @see com.triceracode.pokeapi.model.resource.Endpointable
     */
    ResourceBatch list(Class<? extends Endpointable> clazz, Long limit, Long offset) throws IOException;

    /**
     * Get a resource from PokeApi by id specified by the Class in the parameters.
     *
     * @param <T> any extend of Endpointable to retrieve all its data
     * @param clazz Class that extends of Endpointable to retrieve
     * @param id    the id of the resource to retrieve from PokeApi
     * @return The object with the info of the specified resource class in the parameters
     * @throws IOException in case the PokeApi request or transformation to Java Objects fail
     * @see com.triceracode.pokeapi.model.resource.Endpointable
     */
    <T extends Endpointable> T get(Class<T> clazz, Long id) throws IOException;

    /**
     * Get a resource from PokeApi by id specified by the Class in the parameters.
     *
     * @param <T> any extend of Endpointable to retrieve all its data
     * @param clazz Class that extends of Endpointable to retrieve
     * @param name    the name of the resource to retrieve from PokeApi
     * @return The object with the info of the specified resource class in the parameters
     * @throws IOException in case the PokeApi request or transformation to Java Objects fail
     * @see com.triceracode.pokeapi.model.resource.Endpointable
     */
    <T extends Endpointable> T get(Class<T> clazz, String name) throws IOException;

}
