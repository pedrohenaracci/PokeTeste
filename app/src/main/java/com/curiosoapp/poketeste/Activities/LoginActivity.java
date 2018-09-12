package com.curiosoapp.poketeste.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;

import com.curiosoapp.poketeste.R;
import com.curiosoapp.poketeste.SharedPreference.SharedPreferenceAuxiliador;

public class LoginActivity extends AppCompatActivity {

    FrameLayout botao_entrar;
    EditText usuario;
    EditText senha;
    SharedPreferenceAuxiliador sharedPreference = new SharedPreferenceAuxiliador();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usuario = (EditText) findViewById(R.id.usuario_et);
        senha = (EditText) findViewById(R.id.senha_et);
        botao_entrar = (FrameLayout) findViewById(R.id.layout_botao);

        botao_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sharedPreference.adicionarChaveValorSP(LoginActivity.this, "usuario",usuario.getText().toString());
                sharedPreference.adicionarChaveValorSP(LoginActivity.this, "senha",senha.getText().toString());


                Intent intentApp = new Intent(LoginActivity.this,
                        PokeMain.class);

                LoginActivity.this.startActivity(intentApp);
            }
        });
    }
}
