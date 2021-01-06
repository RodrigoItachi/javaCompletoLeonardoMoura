package javaCompletoLeonardoMoura.br.com.poo.classe;

public class Pessoa {
	public String nome;
	public double peso;

	public Pessoa() {
	}

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public Pessoa(double peso) {
		this.peso = peso;
	}

	public Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	public double comer(Comida comida) {
		if (comida == null) {
			return 0.0;
		}else {			
			return this.peso += comida.peso;
		}
	}

	public void aumentarPesoComendo(Comida comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}
	}

	@Override
	public String toString() {
		return "Pessoa\nNome: " + nome + "\nPeso: " + String.format("%.3f", peso) + "\n";
	}
}