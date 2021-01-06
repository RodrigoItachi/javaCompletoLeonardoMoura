package javaCompletoLeonardoMoura.br.com.poo.classe;

public class Produto {
	public String nome;
	public double preco;
	public double desconto;

	public double precoComDesconto() {
		return preco * (1 - desconto);
	}

//	public double precoComDescontoGerente(double descontoDoGerente) {
	public double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
