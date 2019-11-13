package br.unifor.uniflix.controller;

import org.json.JSONObject;

import br.unifor.uniflix.model.Filme;

public interface JsonAdapter <T>{ //T é genérico
	 T adapter (JSONObject json); //vai chamar o outro json lá do pegafilmeadapter
}
