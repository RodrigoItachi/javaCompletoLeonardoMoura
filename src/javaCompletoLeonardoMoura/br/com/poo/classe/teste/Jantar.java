package javaCompletoLeonardoMoura.br.com.poo.classe.teste;

import javaCompletoLeonardoMoura.br.com.poo.classe.Comida;
import javaCompletoLeonardoMoura.br.com.poo.classe.Pessoa;

public class Jantar {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Carlos",60.0);
//		Pessoa pessoa = new Pessoa();
		System.out.println(pessoa);

		Comida comida1 = new Comida("Macarrão", .215);
		pessoa.comer(comida1);
		System.out.println(pessoa);

		Comida comida2 = new Comida("Frango", .255);
		pessoa.comer(comida2);
		System.out.println(pessoa);

//		Comida comida3 = null;
//		pessoa.comer(comida3);
//		System.out.println(pessoa);
//
//		pessoa.aumentarPesoComendo(comida3);
//		System.out.println(pessoa);
	}

}