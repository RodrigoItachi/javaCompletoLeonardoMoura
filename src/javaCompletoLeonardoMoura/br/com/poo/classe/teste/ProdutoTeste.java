package javaCompletoLeonardoMoura.br.com.poo.classe.teste;

import javaCompletoLeonardoMoura.br.com.poo.classe.Produto;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto produto1 = new Produto();
		produto1.nome = "Tênis";
		produto1.preco = 100.0;
		produto1.desconto = .12;

		var produto2 = new Produto();
		produto2.nome = "Sandália";
		produto2.preco = 80.0;
		produto2.desconto = .05;

		System.out.println("-------------------------------------");
		System.out.println("Produto1 nome:" + produto1.nome);
		System.out.println("Produto2 nome:" + produto2.nome);
		System.out.println("-------------------------------------");

		System.out.printf("Preço final 1: R$%.2f", produto1.precoComDesconto());
		System.out.println();
		System.out.printf("Preço final 2: R$%.2f", produto2.precoComDesconto());
		var mediaPrecoFinal = ((produto1.precoComDesconto() + produto2.precoComDesconto()) / 2);
		
		System.out.println();
		System.out.printf("Média de preços: R$%.2f\n", mediaPrecoFinal);
		System.out.println("-------------------------------------");
	}

}
