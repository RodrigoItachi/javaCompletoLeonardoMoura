package javaCompletoLeonardoMoura.br.com.poo.classe.teste;

import javaCompletoLeonardoMoura.br.com.poo.classe.Data;

public class DataTeste {
	public static void main(String[] args) {
		Data data1 = new Data();
		data1.dia = "30";
		data1.mes = "09";
		data1.ano = "1902";

		Data data2 = new Data();
		data2.dia = "15";
		data2.mes = "08";
		data2.ano = "1956";

		System.out.printf("Data1: %s\n", data1.mostraData());
		System.out.printf("Data2: %s\n", data2.mostraData());
	}
}
