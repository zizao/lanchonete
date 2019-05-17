package br.com.lanchonete.dao;

import br.com.lanchonete.Lanche;
import java.util.*;

public class LancheDAO {
	
	private final static Map<Integer, Lanche> LANCHES = new HashMap<>();

	public Collection<Lanche> retornaPedidos() {
		return LANCHES.values();
	}
	
	public void limparPedidos() {
		LANCHES.clear();
	}
	
	public void adiciona(Lanche lanche) {
		geraIdEAdiciona(lanche);
	}

	private static void geraIdEAdiciona(Lanche lanche) {
		int id = LANCHES.size() + 1;
		lanche.setId(id);
		LANCHES.put(id, lanche);
	}
}
