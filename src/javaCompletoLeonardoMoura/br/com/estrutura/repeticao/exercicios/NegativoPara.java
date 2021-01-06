package javaCompletoLeonardoMoura.br.com.estrutura.repeticao.exercicios;

import java.util.Scanner;

public class NegativoPara {

	public static void main(String[] args) {
		/**
		 * 7. Criar um programa que enquanto estiver recebendo números positivos,
		 * imprime no console a soma dos números inseridos, caso receba um número
		 * negativo, encerre o programa. Tente utilizar a estrutura do while.
		 */

		Scanner leia = new Scanner(System.in);
		int num = 0;
		int total = 0;

		while (num >= 0) {
			System.out.print("Digite um número para a soma: ");
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
