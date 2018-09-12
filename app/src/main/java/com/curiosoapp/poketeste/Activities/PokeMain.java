package com.curiosoapp.poketeste.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.curiosoapp.poketeste.Models.PokePojo;
import com.curiosoapp.poketeste.Network.RetrofitInstance;
import com.curiosoapp.poketeste.Network.RetrofitService;
import com.curiosoapp.poketeste.R;

import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PokeMain extends AppCompatActivity {

    RetrofitInstance retrofit;
    RetrofitService service ;
    private int idRndm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poke_main);
    }

    public void gerarDados(){
        Random r = new Random();
        idRndm = r.nextInt(300 - 1)+1;
        service = retrofit.getRetrofit().create(RetrofitService.class);
        Call<PokePojo> PokePojoCall = service.getPokemon(idRndm);
        PokePojoCall.enqueue(new Callback<PokePojo>() {
            @Override
            public void onResponse(Call<PokePojo> call, Response<PokePojo> response) {

            }

            @Override
            public void onFailure(Call<PokePojo> call, Throwable t) {

            }
        });
    }
}
