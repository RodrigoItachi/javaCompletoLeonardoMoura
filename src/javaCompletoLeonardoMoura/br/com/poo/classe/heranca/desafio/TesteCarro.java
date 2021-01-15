package javaCompletoLeonardoMoura.br.com.poo.classe.heranca.desafio;

public class TesteCarro {

	public static void main(String[] args) {
		Ferrari carro = new Ferrari();
//		carro.velocidadeAtual = 50;
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();

		System.out.println("Ferrari: " + carro.velocidadeAtual + " Km/h");

		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();

		System.out.println("Ferrari: " + carro.velocidadeAtual + " Km/h");

		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();

		System.out.println("Ferrari: " + carro.velocidadeAtual + " Km/h");

		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();

		System.out.println("Ferrari: " + carro.velocidadeAtual + " Km/h");
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();

		System.out.println("Ferrari: " + carro.velocidadeAtual + " Km/h");
	}

}