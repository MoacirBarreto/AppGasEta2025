package devandroid.moacir.appgaseta2025.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.moacir.appgaseta2025.model.Pessoa;

public class PessoaController {

    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;
    public static final String NOME_PREFERENCES = "pref_listavip";
//    public PessoaController(MainActivity mainActivity) {
//        preferences =
//                mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);
//        listaVip = preferences.edit();
//    }

    @NonNull
    @Override
    public String toString() {
        Log.d("MVC_Controller", "Controller iniciado");
        return super.toString();
    }

    public void salvar(Pessoa pessoa) {
        Log.d("MVC_Controller", "Salvo" + pessoa.toString());

        listaVip.putString("primeiroNome", pessoa.getPrimeiroNome());
        listaVip.putString("sobreNome", pessoa.getSobreNome());
        listaVip.putString("nomeCurso", pessoa.getCursoDesejado());
        listaVip.putString("telefone", pessoa.getTelefoneContato());
        listaVip.apply();
    }

    public Pessoa buscar(Pessoa pessoa) {
        pessoa.setPrimeiroNome(preferences.getString("primeiroNome", ""));
        pessoa.setSobreNome(preferences.getString("sobreNome", ""));
        pessoa.setNomeCurso(preferences.getString("nomeCurso", ""));
        pessoa.setTelefoneContato(preferences.getString("telefone", ""));
        return pessoa;
    }

    public void limpar() {

        listaVip.clear();
        listaVip.apply();
    }

}
