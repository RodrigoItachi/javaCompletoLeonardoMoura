package javaCompletoLeonardoMoura.br.com.poo.classe.construtores;

public class TesteProduto {

	public static void main(String[] args) {
		Produto produto1 = new Produto();
		produto1.nome = "Tênis";
		produto1.preco = 100.0;
		produto1.desconto = .12;

		var produto2 = new Produto("Sandália");
//		produto2.nome = "Sandália";
		produto2.preco = 80.0;
		produto2.desconto = .05;

		var produto3 = new Produto("Vestido", 125);
		produto3.desconto = .4;

		var produto4 = new Produto("Notebook", 4125.0, .12);

		System.out.println("-------------------------------------");
		System.out.println("Produto1:" + produto1);
		System.out.println("Produto2:" + produto2);
		System.out.println("Produto3:" + produto3);
		System.out.println("Produto4:" + produto4);
		System.out.println("-------------------------------------");

		System.out.printf("Preço final 1: R$%.2f", produto1.precoComDesconto());
		System.out.println();
		System.out.printf("Preço final 2: R$%.2f", produto2.precoComDesconto());
		System.out.println();
		System.out.printf("Preço final 3: R$%.2f", produto3.precoComDesconto());
		System.out.println();
		System.out.printf("Preço final 4: R$%.2f", produto4.precoComDesconto());
		System.out.println();
		var mediaPrecoFinal = ((produto1.precoComDesconto() + produto2.precoComDesconto() + produto3.precoComDesconto()
				+ produto4.precoComDesconto()) / 4);

		System.out.println();
		System.out.printf("Média de preços: R$%.2f\n", mediaPrecoFinal);
		System.out.println("-------------------------------------");
	}

}
