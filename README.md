# poke-api

---
A configurable retrofit client for [PokeAPI](https://pokeapi.co/) for any Java project.
### Features
- Single entry point for all client operations to implement declarative programming
- Entry points for all operation to implement imperative programming
- Simple configurable caching or non-caching.
## Getting started
### Project configuration
#### Properties
Through environment variable could be configured
- POKE_API_URL : The PokeAPI url base, default 'https://pokeapi.co/api/v2/'
- POKE_API_CACHE_SIZE : [int] The cache size in MB(if it is set, then the cache will be not configure caching)
- POKE_API_CACHE_DIR : The cache directory, default './.pokeCache'
#### Application
##### Declarative
Only implement the `PokeAPIResourceService`:
```java
public class Application {
    public static void main(String[] args) {
        PokeAPIResourceService pokeAPI = new PokeAPIResourceServiceImp();
    }    
}
```
Or with caching config:
```java
public class Application {
    public static void main(String[] args) {
        PokeAPIResourceService pokeAPI = new PokeAPIResourceServiceImp(
                new PokeAPIConfig("https://pokeapi.co/api/v2/", 10, "/my/cache/dir/path")
        );
    }    
}
```
For SpringBoot, only register the `PokeAPIResourceService` as a `@Bean`:
```java
@SpringBootApplication
@Configuration
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(AureoMarketApplication.class, args);
	}

	@Bean
	public PokeAPIResourceService pokeAPIResourceService() {
		return new PokeAPIResourceServiceImp();
	}
}
```
And use to fetch a resource.
All resource:
```java
public class Application {
    public static void main(String[] args) {
        PokeAPIResourceService pokeAPI = new PokeAPIResourceServiceImp();
        ...
        ResourceBatch allPokemonResourceList = pokeAPI.list(Pokemon.class);
        allPokemonResourceList.getResults().forEach(resource -> {
            System.out.println(resource.getId() + " " + resource.getName());
        });
    }
}
```
One resource by id:
```java
public class Application {
    public static void main(String[] args) {
        PokeAPIResourceService pokeAPI = new PokeAPIResourceServiceImp();
        ...
        Pokemon gengar = pokeAPI.get(Pokemon.class, 94);
        System.out.println(gengar.getName());
    }
}
```
One resource by name:
```java
public class Application {
    public static void main(String[] args) {
        PokeAPIResourceService pokeAPI = new PokeAPIResourceServiceImp();
        ...
        Pokemon gengar = pokeAPI.get(Pokemon.class, "gengar");
        System.out.println(gengar);
    }
}
```
##### Imperative
Only implement the `PokeAPIService`:
```java
public class Application {
    public static void main(String[] args) {
        PokeAPIService pokeAPI = new PokeAPIServiceImp();
    }    
}
```
Or with caching config:
```java
public class Application {
    public static void main(String[] args) {
        PokeAPIService pokeAPI = new PokeAPIServiceImp(
                new PokeAPIConfig("https://pokeapi.co/api/v2/", 10, "/my/cache/dir/path")
        );
    }    
}
```
For SpringBoot, only register the `PokeAPIResourceService` as a `@Bean`:
```java
@SpringBootApplication
@Configuration
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(AureoMarketApplication.class, args);
	}

	@Bean
	public PokeAPIService pokeAPIService() {
		return new PokeAPIServiceImp();
	}
}
```
And use to fetch a resource.
All resource:
```java
public class Application {
    public static void main(String[] args) {
        PokeAPIService pokeAPI = new PokeAPIServiceImp();
        ...
        Response<ResourceBatch> allPokemonResponse = pokeAPI.pokemon().list().execute();
        ...
        allPokemonResponse.body().getResults().forEach(resource -> {
            System.out.println(resource.getId() + " " + resource.getName());
        });
    }
}
```
One resource by id:
```java
public class Application {
    public static void main(String[] args) {
        PokeAPIService pokeAPI = new PokeAPIServiceImp();
        ...
        Response<Pokemon> pokemon = pokeAPI.byId(94).execute();
        ...
        Pokemon gengar = pokemon.body();
        System.out.println(gengar.getName());
    }
}
```
One resource by name:
```java
public class Application {
    public static void main(String[] args) {
        PokeAPIService pokeAPI = new PokeAPIServiceImp();
        ...
        Response<Pokemon> pokemon = pokeAPI.byName("gengar").execute();
        ...
        Pokemon gengar = pokemon.body();
        System.out.println(gengar.getName());
    }
}
```