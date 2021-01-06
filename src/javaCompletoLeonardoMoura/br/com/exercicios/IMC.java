package javaCompletoLeonardoMoura.br.com.exercicios;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.print("Informe seu peso: ");
		double peso = leia.nextDouble();

		System.out.print("Informe sua altura: ");
		double altura = leia.nextDouble();

		double imc = peso / (Math.pow(altura, 2));

		System.out.printf("IMC %.3f", imc);
		leia.close();
	}

}
