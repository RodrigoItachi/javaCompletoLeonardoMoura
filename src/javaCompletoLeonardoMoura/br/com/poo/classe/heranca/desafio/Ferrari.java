package javaCompletoLeonardoMoura.br.com.poo.classe.heranca.desafio;

public class Ferrari extends Carro {
	@Override
	public int acelerar() {
		if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 349) {
			return super.acelerar() + super.acelerar() + super.acelerar();
		} else {
			return 0;
		}
	}
}