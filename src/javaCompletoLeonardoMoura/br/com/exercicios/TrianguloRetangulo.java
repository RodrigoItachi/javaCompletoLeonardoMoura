package javaCompletoLeonardoMoura.br.com.exercicios;

import java.util.Scanner;

public class TrianguloRetangulo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o valor da altura do tri�ngulo: ");
		double altura = leia.nextDouble();

		System.out.print("Digite o valor da base do tri�ngulo: ");
		double base = leia.nextDouble();

		double area = (base * altura) / 2;
		
		System.out.println(area);

		leia.close();
	}

}
