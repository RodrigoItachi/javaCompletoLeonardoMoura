package javaCompletoLeonardoMoura.br.com.poo.classe.heranca.desafio.teste;

import javaCompletoLeonardoMoura.br.com.poo.classe.heranca.desafio.Carro;
import javaCompletoLeonardoMoura.br.com.poo.classe.heranca.desafio.Ferrari;

public class TesteCarro {

	public static void main(String[] args) {
		Carro carro = new Ferrari(340);
//		carro.velocidadeAtual = 50;

		System.out.println("Ferrari: " + (carro.acelerar() * 15) + " Km/h");
//		System.out.println("Ferrari: " + carro.velocidadeAtual + " Km/h");

	}

}