package javaCompletoLeonardoMoura.br.com.estrutura.arrays.aulas;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Aula03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.print("Informe a quantidade de alunos: ");
		Integer alunos = leia.nextInt();

		System.out.print("Informe a quantidade de notas: ");
		Integer notas = leia.nextInt();

		Double[][] notasTurma = new Double[alunos][notas];

		Double total = 0.0;
		for (int i = 0; i < notasTurma.length; i++) {
			for (int j = 0; j < notasTurma[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d: ", i + 1, j + 1);
				notasTurma[i][j] = leia.nextDouble();
				total += notasTurma[i][j];
			}
		}

		Double media = total / (alunos + notas);
		System.out.println("Média da turma: " + media);

		for (Double[] notasAluno : notasTurma) {
			System.out.println("Notas do aluno " + Arrays.toString(notasAluno));
		}

		leia.close();
	}

}