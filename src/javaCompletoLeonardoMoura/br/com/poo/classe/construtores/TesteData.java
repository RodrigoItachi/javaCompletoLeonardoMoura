package javaCompletoLeonardoMoura.br.com.poo.classe.construtores;

public class TesteData {

	public static void main(String[] args) {
		Data data = new Data();
		System.out.println(data);
		System.out.println();
		data = new Data("11", "12", "2020");
		System.out.println(data);
	}

}