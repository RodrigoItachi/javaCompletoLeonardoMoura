package javaCompletoLeonardoMoura.br.com.estrutura.repeticao.desafios;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int qtdNotas = 0;
		double nota = 0.0;
		double total = 0.0;
//		boolean condicao = nota != -1 && nota <=0;
		boolean notaValida = (nota >= 0 && nota <= 10);

		while (nota != -1) {
			System.out.print("Informe a nota: ");
			nota = leia.nextDouble();

			if (notaValida) {
				total += nota;
				qtdNotas++;
			} else {
				System.out.println("Nota inválida!!!");
			}
		}
		if (total > 0) {
			double media = total / qtdNotas;
			System.out.println("Média: " + media);
		} else {
			System.out.println("Nota inválida!!!");
		}
		leia.close();
	}
}
