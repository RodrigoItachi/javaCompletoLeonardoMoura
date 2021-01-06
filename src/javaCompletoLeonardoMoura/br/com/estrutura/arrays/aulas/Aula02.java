package javaCompletoLeonardoMoura.br.com.estrutura.arrays.aulas;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Aula02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.print("Informe o tamanho a quantidade de notas: ");
		int tamanhoArray = leia.nextInt();

		Double[] notasAlunos = new Double[tamanhoArray];

		for (int i = 0; i < notasAlunos.length; i++) {
			System.out.print("Digite o valor da " + (i + 1) + ": ");
			notasAlunos[i] = leia.nextDouble();
		}

		System.out.println("Notas: " + Arrays.toString(notasAlunos));
		double total = 0;
		for (Double nota : notasAlunos) {
			total += nota;
		}

		Double media = total / notasAlunos.length;
		System.out.println("Média: " + String.format("%.2f", media));
		leia.close();
	}

}