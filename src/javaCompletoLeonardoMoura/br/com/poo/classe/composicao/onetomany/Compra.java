package javaCompletoLeonardoMoura.br.com.poo.classe.composicao.onetomany;

import java.util.ArrayList;

public class Compra {
	String nomeCliente;
	ArrayList<Produto> produtos = new ArrayList<>();

	public double obterValorTotal() {
		double total = 0.0;
		for (Produto produto : produtos) {
			total += (produto.quantidade * produto.preco);
		}
		return total;
	}
}