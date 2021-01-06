package javaCompletoLeonardoMoura.br.com.estrutura.repeticao.exercicios;

import java.util.Scanner;

public class ZeroADezPar {

	public static void main(String[] args) {
//		1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite um número entre 0 e 10: ");
		int num = leia.nextInt();
		boolean condicao = ((num % 2 == 0) && (num >= 0) && (num <= 10));

		if (condicao) {
			System.out.println("O número " + num + " é par e está entre 0 e 10.");
		} else {
			System.out.println("Número fora do padrão!");
		}

		leia.close();
	}

}
