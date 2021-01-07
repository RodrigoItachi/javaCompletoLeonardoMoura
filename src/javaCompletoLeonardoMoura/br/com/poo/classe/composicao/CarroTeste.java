package javaCompletoLeonardoMoura.br.com.poo.classe.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		Carro carro = new Carro();

		System.out.println(carro.estaLigado());
		carro.motorLigado();
		System.out.println(carro.estaLigado());
	}

}