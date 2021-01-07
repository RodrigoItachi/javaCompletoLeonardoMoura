package javaCompletoLeonardoMoura.br.com.poo.classe.composicao;

public class Carro {
	Motor motor = new Motor();

	void acelerar() {
		motor.fatorInjecao += 0.4;
	}
	
	void frear() {
		motor.fatorInjecao -= 0.4;
	}
	
	void motorLigado() {
		motor.ligado = true;
	}
	
	void motorDeligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}