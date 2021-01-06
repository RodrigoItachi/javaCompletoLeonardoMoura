package javaCompletoLeonardoMoura.br.com.poo.classe.statics;

public class Produto {
	public String nome;
	public double preco;
	public static double desconto = 0.25;

	public Produto() {
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public double precoDesconto() {
		return preco * (1.0 - desconto);
	}

	public double precoDesconto(double descontoGerente) {
		return preco * (1.0 - desconto + descontoGerente);
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nPreço: " + String.format("%.2f", preco) + "\nDesconto: "
				+ String.format("%.2f", desconto) + "\n";
	}
}
