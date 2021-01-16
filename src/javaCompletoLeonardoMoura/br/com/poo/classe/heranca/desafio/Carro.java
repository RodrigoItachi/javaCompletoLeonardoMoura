package javaCompletoLeonardoMoura.br.com.poo.classe.heranca.desafio;

public class Carro {
	protected final int VELOCIDADE_MAXIMA;
	protected int aceleracao = 5;
	protected int velocidadeAtual;

	public Carro(int velocidadeMaxima) {
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public int acelerar() {
		if (velocidadeAtual + aceleracao > VELOCIDADE_MAXIMA) {
			return velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			return this.velocidadeAtual += aceleracao;
		}
	}

	public int frear() {
		if (this.velocidadeAtual >= aceleracao) {
			return this.velocidadeAtual -= aceleracao;
		} else {
			return 0;
		}
	}
}