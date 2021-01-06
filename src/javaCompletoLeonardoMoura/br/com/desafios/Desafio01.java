package javaCompletoLeonardoMoura.br.com.desafios;

public class Desafio01 {

	public static void main(String[] args) {
		double operacao01, operacao02, operacao03, operacao04;

		operacao01 = Math.pow((6 * (3 + 2)), 2);
		operacao02 = 3 * 2;

		operacao03 = Math.pow(((1 - 5) * (2 - 7) / 2), 2);
		System.out.println(operacao03);

		double resOperacao0102 = operacao01 / operacao02;

		operacao04 = Math.pow(resOperacao0102 - (operacao03), 3) / Math.pow(10, 3);
		
		System.out.println(operacao04);
	}

}
