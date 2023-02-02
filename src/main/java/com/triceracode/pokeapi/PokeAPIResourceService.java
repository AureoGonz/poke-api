package com.triceracode.pokeapi;

import com.triceracode.pokeapi.model.ResourceBatch;
import com.triceracode.pokeapi.model.resource.Endpointable;

import java.io.IOException;

public interface PokeAPIResourceService {

    ResourceBatch list(Class<? extends Endpointable> clazz) throws IOException;

    ResourceBatch list(Class<? extends Endpointable> clazz, Long limit, Long offset) throws IOException;

    <T extends Endpointable> T get(Class<T> clazz, Long id) throws IOException;

    <T extends Endpointable> T get(Class<T> clazz, String name) throws IOException;

}
