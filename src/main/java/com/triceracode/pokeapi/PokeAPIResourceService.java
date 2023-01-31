package com.triceracode.pokeapi;

import com.triceracode.pokeapi.model.ResourceBatch;

import java.io.IOException;

public interface PokeAPIResourceService {

    ResourceBatch list(Class<?> clazz) throws IOException;

    <T> T get(Class<T> clazz, Long id) throws IOException;

}
