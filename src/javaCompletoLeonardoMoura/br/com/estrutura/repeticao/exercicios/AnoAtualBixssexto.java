package javaCompletoLeonardoMoura.br.com.estrutura.repeticao.exercicios;

import java.util.Scanner;

public class AnoAtualBixssexto {

	public static void main(String[] args) {
//		2. Criar um programa informa se o ano atual é um ano bissexto; 

//		Para determinar se um ano é bissexto, execute estas etapas:
//
//		   1º Se o ano for uniformemente divisível por 4, vá para a etapa 2. Caso contrário, vá para a etapa 5.
//		   2º Se o ano for uniformemente divisível por 100, vá para a etapa 3. Caso contrário, vá para a etapa 4.
//		   3º Se o ano for uniformemente divisível por 400, vá para a etapa 4. Caso contrário, vá para a etapa 5.
//		   4º O ano é bissexto (tem 366 dias).
//		   5º O ano não é um ano bissexto (tem 365 dias).

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite um ano para saber se ele é bissexto: ");
		int ano = leia.nextInt();
		boolean divisivel4 = (ano % 4 == 0);
		boolean divisivel100 = (ano % 100 == 0);
		boolean divisivel400 = (ano % 400 == 0);

		if (divisivel4) {
			if (divisivel100) {
				if (divisivel400) {
					System.out.println("O ano é bissexto (tem 366 dias).");
				}
			}
		} else {
			System.out.println("O ano não é um ano bissexto (tem 365 dias).");
		}

		leia.close();

	}

}
