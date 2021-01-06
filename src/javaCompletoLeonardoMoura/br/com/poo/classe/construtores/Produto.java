package javaCompletoLeonardoMoura.br.com.poo.classe.construtores;

public class Produto {
	public String nome;
	public double preco;
	public double desconto;

	// Inicio aula de construtores
	public Produto() {
	}

	public Produto(String nomeInicial) {
		nome = nomeInicial;
	}

	public Produto(String nomeInicial, double precoInicio) {
		nome = nomeInicial;
		preco = precoInicio;
	}

	public Produto(String nomeInicial, double precoInicio, double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicio;
		desconto = descontoInicial;
	}
	// Fim aula construtores

	public double precoComDesconto() {
		return preco * (1 - desconto);
	}

//	public double precoComDescontoGerente(double descontoDoGerente) {
	public double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nPreço: " + preco + "\nDesconto: " + desconto+"\n";
	}
}