package javaCompletoLeonardoMoura.br.com.exercicios;

import java.util.Scanner;

public class FahrenheitCelsius {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em °F: ");
		double fahrenheit = leia.nextDouble();

		double celsius = (fahrenheit - 32) * 5 / 9;

		System.out.printf("%.2f °F = %.2f °C", fahrenheit, celsius);

		leia.close();
	}

}
