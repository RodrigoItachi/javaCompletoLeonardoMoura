package javaCompletoLeonardoMoura.br.com.poo.classe;

import javaCompletoLeonardoMoura.br.com.poo.classe.construtores.Data;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a; // Atribuição por valor (tipos primitivos)

		System.out.printf("Valor a: %.2f \nValor b: %.2f", a, b);
		System.out.println();
		a++;
		b--;

		System.out.printf("Valor a: %.2f \nValor b: %.2f", a, b);

		System.out.println();
		System.out.println();
		System.out.println();

		Data d1 = new Data("01", "02", "2022");
		Data d2 = d1; // Atribuição por referência (Objetos)
		
		System.out.println("- DATAD1 - || - DATAD2 -");
		System.out.println(d1 + " || " + d2);
		
		d1.setDia("31");
		d2.setMes("01");
		
		System.out.println("---------- || ----------");
		System.out.println(d1.padraoData() + " || " + d2.padraoData());
		
		voltarDataParaValorPadrao(d1);

		System.out.println("---------- || ----------");
		System.out.println(d1.padraoData() + " || " + d2.padraoData());
	}

	static void voltarDataParaValorPadrao(Data d) {
		d.setDia("01");
		d.setMes("01");
		d.setAno("1970");
	}
}