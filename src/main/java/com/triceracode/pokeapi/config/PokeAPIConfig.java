package com.triceracode.pokeapi.config;

import java.net.URI;
import java.net.URL;
import java.util.Objects;

import static java.lang.System.*;

/**
 * The PokeAPI config object for url base, cache size and directory.
 */
public class PokeAPIConfig {

    /**
     * The URL base where the request for pokemon data will request.
     */
    public final String urlBase;

    /**
     * The Cache size.
     */
    public final Integer cacheSize;

    /**
     * The Cache directory.
     */
    public final String cacheDir;

    /**
     * Default configuration; this read the environment variables:
     * <ul>
     *     <li>POKE_API_URL: for the urlBase</li>
     *     <li>POKE_API_CACHE_SIZE: for cacheSize</li>
     *     <li>POKE_API_CACHE_DIR: for cacheDir</li>
     * </ul><
     */
    public PokeAPIConfig() {
        urlBase = Objects.requireNonNullElse(getenv("POKE_API_URL"), "https://pokeapi.co/api/v2/");
        String sCacheSize = getenv("POKE_API_CACHE_SIZE");
        cacheSize = sCacheSize != null ? Integer.valueOf(getenv("POKE_API_CACHE_SIZE")) : null;
        cacheDir = Objects.requireNonNullElse(getenv("POKE_API_CACHE_DIR"), "./.pokeCache");
    }

    /**
     * Instantiates a new PokeAPI configuration.
     *
     * @param urlBase   the url base
     * @param cacheSize the cache size
     * @param cacheDir  the cache dir
     */
    public PokeAPIConfig(String urlBase, Integer cacheSize, String cacheDir) {
        this.urlBase = urlBase;
        this.cacheSize = cacheSize;
        this.cacheDir = cacheDir;
    }

}
