package javaCompletoLeonardoMoura.br.com.estrutura.repeticao.exercicios;

import java.util.Scanner;

public class NegativoPara {

	public static void main(String[] args) {
		/**
		 * 7. Criar um programa que enquanto estiver recebendo n�meros positivos,
		 * imprime no console a soma dos n�meros inseridos, caso receba um n�mero
		 * negativo, encerre o programa. Tente utilizar a estrutura do while.
		 */

		Scanner leia = new Scanner(System.in);
		int num = 0;
		int total = 0;

		while (num >= 0) {
			System.out.print("Digite um n�mero para a soma: ");
			num = leia.nextInt();
			if (num >= 0) {
				total = num + total;
				System.out.printf("%d\n", total);
			}
		}
		System.out.printf("Total: %d\n", total);

		leia.close();
	}

}
