package javaCompletoLeonardoMoura.br.com.poo.classe.heranca.desafio;

public class Ferrari extends Carro {

	public Ferrari() {
		super(320);
	}
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		aceleracao = 15;
	}

//	@Override
//	public int acelerar() {
//		if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 320) {
//			return velocidadeAtual += 15;
//		} else {
//			return 0;
//		}
//	}
}