package javaCompletoLeonardoMoura.br.com.exercicios;

import java.util.Scanner;

public class QuadradoCubo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Informe um número para vermos o quadrado e o cubo desse número: ");
		int numero = leia.nextInt();
		
		System.out.println(Math.pow(numero, 2));
		System.out.println(Math.pow(numero, 3));
		leia.close();
	}

}
