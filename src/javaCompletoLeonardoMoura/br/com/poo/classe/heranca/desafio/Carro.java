package javaCompletoLeonardoMoura.br.com.poo.classe.heranca.desafio;

public class Carro {
	int velocidadeAtual;

	public Carro() {
	}

	public Carro(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int acelerar() {
		
		return this.velocidadeAtual += 5;
	}

	public int frear() {
		if (this.velocidadeAtual >= 0) {
			return this.velocidadeAtual -= 5;
		} else {
			return 0;
		}
	}
}