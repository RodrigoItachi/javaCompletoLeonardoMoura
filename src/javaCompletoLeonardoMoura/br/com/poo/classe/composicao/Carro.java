package javaCompletoLeonardoMoura.br.com.poo.classe.composicao;

public class Carro {
	Motor motor = new Motor();

	void acelerar() {
		if (motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;
		}
	}

	void frear() {
		if (motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
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