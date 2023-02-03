package com.triceracode.pokeapi.config;

import java.util.Objects;

import static java.lang.System.*;

public class PokeAPIConfig {

    public final String urlBase;
    public final Integer cacheSize;
    public final String cacheDir;

    public PokeAPIConfig() {
        urlBase = Objects.requireNonNullElse(getenv("POKE_API_URL"), "https://pokeapi.co/api/v2/");
        String sCacheSize = getenv("POKE_API_CACHE_SIZE");
        cacheSize = sCacheSize != null ? Integer.valueOf(getenv("POKE_API_CACHE_SIZE")) : null;
        cacheDir = Objects.requireNonNullElse(getenv("POKE_API_CACHE_DIR"), "./.pokeCache");
    }

    public PokeAPIConfig(String urlBase, Integer cacheSize, String cacheDir) {
        this.urlBase = urlBase;
        this.cacheSize = cacheSize;
        this.cacheDir = cacheDir;
    }

}
