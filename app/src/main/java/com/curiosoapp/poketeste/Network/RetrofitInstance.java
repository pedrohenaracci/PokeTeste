package com.curiosoapp.poketeste.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static final String BASE_URL = "https://pokeapi.co/";

    private Retrofit retrofit;

    public Retrofit getRetrofit(){
        if(retrofit == null){
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            }
            return retrofit;
    }
}
