package Gerador;

import java.util.*;

public class Gerenciador {
	private List<Comanda> comandas;
	
	public void adcNovaComanda(String[] params) {
		comandas.add(new Comanda(params));
	}
	
	public Comanda encontraComanda(String nome) {
		
	}
}
