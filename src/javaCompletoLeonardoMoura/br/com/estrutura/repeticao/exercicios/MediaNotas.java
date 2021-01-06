package javaCompletoLeonardoMoura.br.com.estrutura.repeticao.exercicios;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {

		/**
		 * 3. Criar um programa que receba duas notas parciais, calcular a média final.
		 * Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se
		 * a nota for menor que 7.0 e maior do que 4.0 imprime no console
		 * "Recuperação", caso contrário imprime no console "Reprovado".
		 */

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite a 1ª nota do aluno: ");
		double nota1 = leia.nextDouble();

		System.out.print("Digite a 2ª nota do aluno: ");
		double nota2 = leia.nextDouble();

		System.out.print("Digite a 3ª nota do aluno: ");
		double nota3 = leia.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;

		boolean aprovado = (media >= 7.0);
		boolean recuperacao = (media > 4.0 && media < 7.0);
		boolean reprovado = (media >= 0 && media <= 4.0);

		if (aprovado) {
			System.out.println("Aprovado");
		} else if (recuperacao) {
			System.out.println("Recuperação");
		} else if (reprovado) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Média inválida");
		}
		leia.close();

	}

}
