package javaCompletoLeonardoMoura.br.com.exercicios;

import java.util.Scanner;

public class Delta {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Resolva equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara!");
		System.out.print("Digite o valor de A: ");
		int a = leia.nextInt();
		System.out.print("Digite o valor de B: ");
		int b = leia.nextInt();
		System.out.print("Digite o valor de C: ");
		int c = leia.nextInt();

		Double delta = Math.pow(b, 2) - 4 * a * c;
		System.out.println("Valor se delta: " + delta.intValue());
		leia.close();
	}
}
