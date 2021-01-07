package javaCompletoLeonardoMoura.br.com.poo.classe.composicao.onetomany;

public class CompraTeste {

	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.nomeCliente = "Suelma Lucio";
		compra1.produtos.add(new Produto("Notebook", 2, 3000.0));
		compra1.produtos.add(new Produto("Monitor LG", 3, 1200.0));
		compra1.produtos.add(new Produto("Cadeira concha", 2, 1400.0));

		System.out.println("Valor total: " + compra1.obterValorTotal());
	}

}