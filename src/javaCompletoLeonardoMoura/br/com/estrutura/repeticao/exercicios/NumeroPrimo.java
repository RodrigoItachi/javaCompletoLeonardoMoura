package javaCompletoLeonardoMoura.br.com.estrutura.repeticao.exercicios;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		/**
		 * 4. Criar um programa que receba um número e diga se ele é um número primo.
		 */

		Scanner leia = new Scanner(System.in);
		boolean naoPrimo;

		do {
			System.out.print("\nDigite um número qualquer positivo para saber se ele é primo: ");
			int numero = leia.nextInt();

			naoPrimo = ((numero % 2 == 0));

			if (naoPrimo) {
				System.out.println("Não é número primo!");
			} else {
				System.out.println("É número primo!");
			}
		} while (naoPrimo);
		leia.close();
	}

}
