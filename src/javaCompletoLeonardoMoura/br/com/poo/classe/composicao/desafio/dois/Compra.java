package javaCompletoLeonardoMoura.br.com.poo.classe.composicao.desafio.dois;

import java.util.ArrayList;

public class Compra {
	ArrayList<Item> items = new ArrayList<>();

	void addItem(Produto produto, Integer quantidade) {
		this.items.add(new Item(quantidade, produto));
	}

	void addItem(String nome, Integer quantidade, Double preco) {
		this.items.add(new Item(quantidade, new Produto(nome, preco)));
	}

	Double obterValorTotal() {
		Double total = 0.0;
		for (Item item : items) {
			total += (item.produto.preco * item.quantidade);
		}
		return total;
	}
}
