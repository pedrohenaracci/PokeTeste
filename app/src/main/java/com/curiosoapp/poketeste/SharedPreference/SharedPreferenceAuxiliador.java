package com.curiosoapp.poketeste.SharedPreference;

import android.content.SharedPreferences;
import android.content.Context;
import android.util.Log;

public class SharedPreferenceAuxiliador {
    private static final String PREF_NAME = "PREFRENCIAS";

    private SharedPreferences.OnSharedPreferenceChangeListener callback = new SharedPreferences.OnSharedPreferenceChangeListener() {
        @Override
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
            Log.i("AAAAAAAAAAAAAAAAAAA",key + " atualizado");
        }
    };

    public void adicionarChaveValorSP(Context c, String chave, String valor){
        SharedPreferences prefs = (SharedPreferences) c.getSharedPreferences(PREF_NAME,c.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(chave,valor);
        editor.apply();
        prefs.registerOnSharedPreferenceChangeListener(callback);


    }

    public String pegaChaveValorSP(Context c, String chave){
        SharedPreferences prefs = (SharedPreferences) c.getSharedPreferences(PREF_NAME,c.MODE_PRIVATE);

        return prefs.getString(chave,"Chave inexistente");
    }
}
