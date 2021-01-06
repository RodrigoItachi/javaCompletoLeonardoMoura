package javaCompletoLeonardoMoura.br.com.estrutura.repeticao;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		String condicao = "";
		do {
			System.out.print("Digite as palavras mágicas para sair: ");
			condicao = leia.nextLine();
		} while (!condicao.equalsIgnoreCase("saia por favor!"));

		leia.close();
	}

}
