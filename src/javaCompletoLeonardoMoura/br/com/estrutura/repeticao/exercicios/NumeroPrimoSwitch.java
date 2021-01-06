package javaCompletoLeonardoMoura.br.com.estrutura.repeticao.exercicios;

import java.util.Scanner;

public class NumeroPrimoSwitch {

	public static void main(String[] args) {
		/**
		 * 5. Refatorar o exercício 04, utilizando a estrutura switch.
		 */

		Scanner leia = new Scanner(System.in);
		int naoPrimo;
		do {
			System.out.print("Digite um número qualquer positivo para saber se ele é primo: ");
			int numero = leia.nextInt();

			naoPrimo = (numero % 2);

			switch (naoPrimo) {
			case 0:
				System.out.println("Não é número primo!");
				break;
			case 1:
				System.out.println("É número primo!");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while (naoPrimo != 1);
		leia.close();
	}

}
