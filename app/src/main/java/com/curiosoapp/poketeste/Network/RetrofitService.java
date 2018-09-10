package com.curiosoapp.poketeste.Network;

import com.curiosoapp.poketeste.Modelos.PokePojo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface RetrofitService {

    @GET("api/v2/pokemon/{id}")
    Call<PokePojo> getPokemon(@Path("id")int pokemonId);

}
