package javaCompletoLeonardoMoura.br.com.poo.classe.composicao.desafio.dois;

import java.util.ArrayList;

public class Cliente {
	String nome;
	ArrayList<Compra> compras = new ArrayList<>();

	public Cliente() {
	}

	public Cliente(String nome) {
		this.nome = nome;
	}
	
	void addCompra(Compra compra) {
		this.compras.add(compra);
	}

	Double obterValorCompra() {
		Double total = 0.0;
		for (Compra compra : compras) {
			total += compra.obterValorTotal();
		}
		return total;
	}
}