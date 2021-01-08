package javaCompletoLeonardoMoura.br.com.poo.classe.composicao.desafio;

public class Item {
	Integer quantidade;
	Produto produto;

	public Item() {

	}

	public Item(Integer quantidade) {
		this.quantidade = quantidade;
		this.produto = new Produto();
	}

}