package javaCompletoLeonardoMoura.br.com.poo.classe.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
	String nome;
	final ArrayList<Compra> compras = new ArrayList<>();

	public Cliente() {
	}

	public Cliente(String nome) {
		this.nome = nome;
	}

	Double obterValorTotalCompras() {
		Double total = 0.0;

		for (Compra compra : compras) {
			total += compra.obterValorTotal();
		}

		return total;
	}
}