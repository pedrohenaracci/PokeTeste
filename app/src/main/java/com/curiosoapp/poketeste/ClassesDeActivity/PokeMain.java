package com.curiosoapp.poketeste.ClassesDeActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.curiosoapp.poketeste.Modelos.PokePojo;
import com.curiosoapp.poketeste.Network.RetrofitInstance;
import com.curiosoapp.poketeste.Network.RetrofitService;
import com.curiosoapp.poketeste.R;
import com.curiosoapp.poketeste.SharedPreference.SharedPreferenceAuxiliador;

import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class PokeMain extends AppCompatActivity {

    RetrofitInstance retrofit;
    RetrofitService service ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poke_main);
    }

    public void gerarDados(){
        Random r = new Random();
        int idRndm = r.nextInt(300 - 1)+1;
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
