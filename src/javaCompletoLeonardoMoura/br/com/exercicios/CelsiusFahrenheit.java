package javaCompletoLeonardoMoura.br.com.exercicios;

import java.util.Scanner;

public class CelsiusFahrenheit {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em °C: ");
		double celsius = leia.nextDouble();
		
		double fahreinheit = (celsius * 9 / 5) + 32;
		System.out.printf("%.2f °C = %.2f °F ", celsius, fahreinheit);
		
		leia.close();
	}

}
