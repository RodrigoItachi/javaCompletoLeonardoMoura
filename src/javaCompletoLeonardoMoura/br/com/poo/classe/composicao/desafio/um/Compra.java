package javaCompletoLeonardoMoura.br.com.poo.classe.composicao.desafio.um;

import java.util.ArrayList;

public class Compra {
	final ArrayList<Item> items = new ArrayList<>();

	public Compra() {
	}

	void addItem(Produto produto, Integer quantidade) {
		this.items.add(new Item(produto, quantidade));
	}

	void addItem(String nome, Double preco, Integer quantidade) {
		this.items.add(
				new Item(
						new Produto(nome, preco), 
						quantidade)
				);
	}

	Double obterValorTotal() {
		Double total = 0.0;
		for (Item item : items) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}

}