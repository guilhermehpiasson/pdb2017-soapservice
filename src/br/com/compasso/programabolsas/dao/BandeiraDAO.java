package br.com.compasso.programabolsas.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.com.compasso.programabolsas.model.Bandeira;

public class BandeiraDAO {

	private final static Map<Long, Bandeira> BANDEIRAS = new HashMap<>();
	static {
		geraIdEAdiciona(new Bandeira("Mastercard"));
		geraIdEAdiciona(new Bandeira("Visa"));
		geraIdEAdiciona(new Bandeira("Amex"));
		geraIdEAdiciona(new Bandeira("Dinners"));
		geraIdEAdiciona(new Bandeira("Banri"));
	}

	public Collection<Bandeira> buscaTodasAsBandeiras() {
		return BANDEIRAS.values();
	}

	public void adiciona(Bandeira bandeira) {
		geraIdEAdiciona(bandeira);
	}

	private static void geraIdEAdiciona(Bandeira bandeira) {
		long id = BANDEIRAS.size()+1l;
		bandeira.setId(id);
		BANDEIRAS.put(id, bandeira);
	}
}
