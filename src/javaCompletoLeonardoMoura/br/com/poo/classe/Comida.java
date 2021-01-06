package javaCompletoLeonardoMoura.br.com.poo.classe;

public class Comida {
	public String nome;
	public double peso;

	public Comida() {
		// TODO Auto-generated constructor stub
	}

	public Comida(String nome) {
		this.nome = nome;
	}

	public Comida(double peso) {
		this.peso = peso;
	}

	public Comida(String nome, double peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}
}