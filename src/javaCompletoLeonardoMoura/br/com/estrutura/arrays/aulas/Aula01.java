package javaCompletoLeonardoMoura.br.com.estrutura.arrays.aulas;

import java.util.Arrays;
import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.print("Informe o tamanho a quantidade de notas: ");
		int tamanhoArray = leia.nextInt();

		Double[] notasAlunos = new Double[tamanhoArray];

//			notasAlunos[0] = 8.0;
//			notasAlunos[1] = 7.5;
//			notasAlunos[2] = 6.5;
//			notasAlunos[3] = 6.0; //Aqui dá erro por exceder o a capacidade do vetor
		for (int i = 0; i < notasAlunos.length; i++) {
			System.out.print("Digite o valor da " + (i + 1) + ": ");
			notasAlunos[i] = leia.nextDouble();
		}
//			System.out.println("Ponteiro: " + notasAlunos);
		System.out.println("Notas: " + Arrays.toString(notasAlunos));

		double total = 0;
		for (int i = 0; i < notasAlunos.length; i++) {
			total += notasAlunos[i];
		}

		System.out.println("Média: " + String.format("%.2f", total / notasAlunos.length));

		leia.close();
	}

}