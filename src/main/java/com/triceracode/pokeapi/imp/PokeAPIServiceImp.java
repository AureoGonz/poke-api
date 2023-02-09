package com.triceracode.pokeapi.imp;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.triceracode.pokeapi.config.PokeAPIConfig;
import com.triceracode.pokeapi.PokeAPIService;
import com.triceracode.pokeapi.endpoint.berry.*;
import com.triceracode.pokeapi.endpoint.contest.*;
import com.triceracode.pokeapi.endpoint.encounter.*;
import com.triceracode.pokeapi.endpoint.evolution.*;
import com.triceracode.pokeapi.endpoint.game.*;
import com.triceracode.pokeapi.endpoint.item.*;
import com.triceracode.pokeapi.endpoint.language.*;
import com.triceracode.pokeapi.endpoint.location.*;
import com.triceracode.pokeapi.endpoint.machine.MachineEndpoint;
import com.triceracode.pokeapi.endpoint.move.*;
import com.triceracode.pokeapi.endpoint.pokemon.*;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.File;
import java.util.*;

/**
 * The PokeAPIService implementation.
 */
public class PokeAPIServiceImp implements PokeAPIService {

    private final PokemonEndpoint pokemonEndpoint;
    private final AbilityEndpoint abilityEndpoint;
    private final BerryEndpoint berryEndpoint;
    private final BerryFirmnessEndpoint berryFirmnessEndpoint;
    private final BerryFlavorEndpoint berryFlavorEndpoint;
    private final ContestTypeEndpoint contestTypeEndpoint;
    private final ContestEffectEndpoint contestEffectEndpoint;
    private final SuperContestEffectEndpoint superContestEffectEndpoint;
    private final LanguageEndpoint languageEndpoint;
    private final EncounterMethodEndpoint encounterMethodEndpoint;
    private final EncounterConditionEndpoint encounterConditionEndpoint;
    private final EncounterConditionValueEndpoint encounterConditionValueEndpoint;
    private final EvolutionChainEndpoint evolutionChainEndpoint;
    private final EvolutionTriggerEndpoint evolutionTriggerEndpoint;
    private final GenerationEndpoint generationEndpoint;
    private final PokedexEndpoint pokedexEndpoint;
    private final VersionEndpoint versionEndpoint;
    private final VersionGroupEndpoint versionGroupEndpoint;
    private final ItemEndpoint itemEndpoint;
    private final ItemAttributeEndpoint itemAttributeEndpoint;
    private final ItemCategoryEndpoint itemCategoryEndpoint;
    private final ItemPocketEndpoint itemPocketEndpoint;
    private final LocationEndpoint locationEndpoint;
    private final LocationAreaEndpoint locationAreaEndpoint;
    private final PalParkAreaEndpoint palParkAreaEndpoint;
    private final RegionEndpoint regionEndpoint;
    private final MachineEndpoint machineEndpoint;
    private final MoveEndpoint moveEndpoint;
    private final MoveAilmentEndpoint moveAilmentEndpoint;
    private final MoveBattleStyleEndpoint moveBattleStyleEndpoint;
    private final MoveDamageClassEndpoint moveDamageClassEndpoint;
    private final MoveLearnMethodEndpoint moveLearnMethodEndpoint;
    private final MoveTargetEndpoint moveTargetEndpoint;
    private final CharacteristicEndpoint characteristicEndpoint;
    private final EggGroupEndpoint eggGroupEndpoint;
    private final GenderEndpoint genderEndpoint;
    private final GrowthRateEndpoint growthRateEndpoint;
    private final NatureEndpoint natureEndpoint;
    private final PokeathlonStatEndpoint pokeathlonStatEndpoint;
    private final StatEndpoint statEndpoint;
    private final TypeEndpoint typeEndpoint;
    private final PokemonColorEndpoint pokemonColorEndpoint;
    private final PokemonFormEndpoint pokemonFormEndpoint;
    private final PokemonHabitatEndpoint pokemonHabitatEndpoint;
    private final PokemonShapeEndpoint pokemonShapeEndpoint;
    private final PokemonSpeciesEndpoint pokemonSpeciesEndpoint;

    /**
     * Instantiates a new Poke api service imp.
     *
     * @param config where indicate the url to request the PokeApi endpoints
     * @see com.triceracode.pokeapi.config.PokeAPIConfig
     */
    public PokeAPIServiceImp(PokeAPIConfig config) {
        String urlBase = Objects.requireNonNull(config.urlBase);
        Cache cache = null;
        if(config.cacheSize != null) {
            File cacheDir = new File(config.cacheDir);
            int cacheSize = config.cacheSize > 0 ? config.cacheSize : 10;
            if(cacheDir.exists() || cacheDir.mkdir())
                cache = new Cache(cacheDir, (long) cacheSize * 1024 * 1024);
        }
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .cache(cache).build();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(urlBase)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        this.pokemonEndpoint = retrofit.create(PokemonEndpoint.class);
        this.abilityEndpoint = retrofit.create(AbilityEndpoint.class);
        this.berryEndpoint = retrofit.create(BerryEndpoint.class);
        this.berryFirmnessEndpoint = retrofit.create(BerryFirmnessEndpoint.class);
        this.berryFlavorEndpoint = retrofit.create(BerryFlavorEndpoint.class);
        this.contestTypeEndpoint = retrofit.create(ContestTypeEndpoint.class);
        this.contestEffectEndpoint = retrofit.create(ContestEffectEndpoint.class);
        this.superContestEffectEndpoint = retrofit.create(SuperContestEffectEndpoint.class);
        this.languageEndpoint = retrofit.create(LanguageEndpoint.class);
        this.encounterMethodEndpoint = retrofit.create(EncounterMethodEndpoint.class);
        this.encounterConditionEndpoint = retrofit.create(EncounterConditionEndpoint.class);
        this.encounterConditionValueEndpoint = retrofit.create(EncounterConditionValueEndpoint.class);
        this.evolutionChainEndpoint = retrofit.create(EvolutionChainEndpoint.class);
        this.evolutionTriggerEndpoint = retrofit.create(EvolutionTriggerEndpoint.class);
        this.generationEndpoint = retrofit.create(GenerationEndpoint.class);
        this.pokedexEndpoint = retrofit.create(PokedexEndpoint.class);
        this.versionEndpoint = retrofit.create(VersionEndpoint.class);
        this.versionGroupEndpoint = retrofit.create(VersionGroupEndpoint.class);
        this.itemEndpoint = retrofit.create(ItemEndpoint.class);
        this.itemAttributeEndpoint = retrofit.create(ItemAttributeEndpoint.class);
        this.itemCategoryEndpoint = retrofit.create(ItemCategoryEndpoint.class);
        this.itemPocketEndpoint = retrofit.create(ItemPocketEndpoint.class);
        this.locationEndpoint = retrofit.create(LocationEndpoint.class);
        this.locationAreaEndpoint = retrofit.create(LocationAreaEndpoint.class);
        this.palParkAreaEndpoint = retrofit.create(PalParkAreaEndpoint.class);
        this.regionEndpoint = retrofit.create(RegionEndpoint.class);
        this.machineEndpoint = retrofit.create(MachineEndpoint.class);
        this.moveEndpoint = retrofit.create(MoveEndpoint.class);
        this.moveAilmentEndpoint = retrofit.create(MoveAilmentEndpoint.class);
        this.moveBattleStyleEndpoint = retrofit.create(MoveBattleStyleEndpoint.class);
        this.moveDamageClassEndpoint = retrofit.create(MoveDamageClassEndpoint.class);
        this.moveLearnMethodEndpoint = retrofit.create(MoveLearnMethodEndpoint.class);
        this.moveTargetEndpoint = retrofit.create(MoveTargetEndpoint.class);
        this.characteristicEndpoint = retrofit.create(CharacteristicEndpoint.class);
        this.eggGroupEndpoint = retrofit.create(EggGroupEndpoint.class);
        this.genderEndpoint = retrofit.create(GenderEndpoint.class);
        this.growthRateEndpoint = retrofit.create(GrowthRateEndpoint.class);
        this.natureEndpoint = retrofit.create(NatureEndpoint.class);
        this.pokeathlonStatEndpoint = retrofit.create(PokeathlonStatEndpoint.class);
        this.statEndpoint = retrofit.create(StatEndpoint.class);
        this.typeEndpoint = retrofit.create(TypeEndpoint.class);
        this.pokemonColorEndpoint = retrofit.create(PokemonColorEndpoint.class);
        this.pokemonFormEndpoint = retrofit.create(PokemonFormEndpoint.class);
        this.pokemonHabitatEndpoint = retrofit.create(PokemonHabitatEndpoint.class);
        this.pokemonShapeEndpoint = retrofit.create(PokemonShapeEndpoint.class);
        this.pokemonSpeciesEndpoint = retrofit.create(PokemonSpeciesEndpoint.class);
    }

    /**
     * Instantiates a new Poke api service imp.
     */
    public PokeAPIServiceImp() {
        this(new PokeAPIConfig());
    }

    @Override
    public PokemonEndpoint pokemon() {
        return this.pokemonEndpoint;
    }

    @Override
    public AbilityEndpoint ability() {
        return this.abilityEndpoint;
    }

    @Override
    public BerryEndpoint berry() {
        return this.berryEndpoint;
    }

    @Override
    public BerryFirmnessEndpoint berryFirmness() {
        return this.berryFirmnessEndpoint;
    }

    @Override
    public BerryFlavorEndpoint berryFlavor() {
        return this.berryFlavorEndpoint;
    }

    @Override
    public ContestTypeEndpoint contestType() {
        return this.contestTypeEndpoint;
    }

    @Override
    public ContestEffectEndpoint contestEffect() {
        return this.contestEffectEndpoint;
    }

    @Override
    public SuperContestEffectEndpoint superContestEffect() {
        return this.superContestEffectEndpoint;
    }

    @Override
    public LanguageEndpoint language() {
        return this.languageEndpoint;
    }

    @Override
    public EncounterMethodEndpoint encounterMethod() {
        return this.encounterMethodEndpoint;
    }

    @Override
    public EncounterConditionEndpoint encounterCondition() {
        return this.encounterConditionEndpoint;
    }

    @Override
    public EncounterConditionValueEndpoint encounterConditionValue() {
        return this.encounterConditionValueEndpoint;
    }

    @Override
    public EvolutionChainEndpoint evolutionChain() {
        return this.evolutionChainEndpoint;
    }

    @Override
    public EvolutionTriggerEndpoint evolutionTrigger() {
        return this.evolutionTriggerEndpoint;
    }

    @Override
    public GenerationEndpoint generation() {
        return this.generationEndpoint;
    }

    @Override
    public PokedexEndpoint pokedex() {
        return this.pokedexEndpoint;
    }

    @Override
    public VersionEndpoint version() {
        return this.versionEndpoint;
    }

    @Override
    public VersionGroupEndpoint versionGroup() {
        return this.versionGroupEndpoint;
    }

    @Override
    public ItemEndpoint item() {
        return this.itemEndpoint;
    }

    @Override
    public ItemAttributeEndpoint itemAttribute() {
        return this.itemAttributeEndpoint;
    }

    @Override
    public ItemCategoryEndpoint itemCategory() {
        return this.itemCategoryEndpoint;
    }

    @Override
    public ItemPocketEndpoint itemPocket() {
        return this.itemPocketEndpoint;
    }

    @Override
    public LocationEndpoint location() {
        return this.locationEndpoint;
    }

    @Override
    public LocationAreaEndpoint locationArea() {
        return this.locationAreaEndpoint;
    }

    @Override
    public PalParkAreaEndpoint palParkArea() {
        return this.palParkAreaEndpoint;
    }

    @Override
    public RegionEndpoint region() {
        return this.regionEndpoint;
    }

    @Override
    public MachineEndpoint machine() {
        return this.machineEndpoint;
    }

    @Override
    public MoveEndpoint move() {
        return this.moveEndpoint;
    }

    @Override
    public MoveAilmentEndpoint moveAilment() {
        return this.moveAilmentEndpoint;
    }

    @Override
    public MoveBattleStyleEndpoint moveBattleStyle() {
        return this.moveBattleStyleEndpoint;
    }

    @Override
    public MoveDamageClassEndpoint moveDamageClass() {
        return this.moveDamageClassEndpoint;
    }

    @Override
    public MoveLearnMethodEndpoint moveLearnMethod() {
        return this.moveLearnMethodEndpoint;
    }

    @Override
    public MoveTargetEndpoint moveTarget() {
        return this.moveTargetEndpoint;
    }

    @Override
    public CharacteristicEndpoint characteristic() {
        return this.characteristicEndpoint;
    }

    @Override
    public EggGroupEndpoint eggGroup() {
        return this.eggGroupEndpoint;
    }

    @Override
    public GenderEndpoint gender() {
        return this.genderEndpoint;
    }

    @Override
    public GrowthRateEndpoint growthRate() {
        return this.growthRateEndpoint;
    }

    @Override
    public NatureEndpoint nature() {
        return this.natureEndpoint;
    }

    @Override
    public PokeathlonStatEndpoint pokeathlonStat() {
        return this.pokeathlonStatEndpoint;
    }

    @Override
    public StatEndpoint stat() {
        return this.statEndpoint;
    }

    @Override
    public TypeEndpoint type() {
        return this.typeEndpoint;
    }

    @Override
    public PokemonColorEndpoint pokemonColor() {
        return this.pokemonColorEndpoint;
    }

    @Override
    public PokemonFormEndpoint pokemonForm() {
        return this.pokemonFormEndpoint;
    }

    @Override
    public PokemonHabitatEndpoint pokemonHabitat() {
        return this.pokemonHabitatEndpoint;
    }

    @Override
    public PokemonShapeEndpoint pokemonShape() {
        return this.pokemonShapeEndpoint;
    }

    @Override
    public PokemonSpeciesEndpoint pokemonSpecies() {
        return this.pokemonSpeciesEndpoint;
    }

}
