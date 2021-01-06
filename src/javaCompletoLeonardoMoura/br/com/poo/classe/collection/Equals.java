package javaCompletoLeonardoMoura.br.com.poo.classe.collection;

import java.util.Date;

public class Equals {

	public static void main(String[] args) {
		Usuario usuario1 = new Usuario("Pedro Silva", "pedrosilva@email.com");
		Usuario usuario2 = new Usuario("Pedro Silva", "pedrosilva@email.com");

		System.out.println(usuario1 == usuario2);
		System.out.println(usuario1.equals(usuario2));
		System.out.println(usuario2.equals(usuario1));

		System.out.println(usuario2.equals(new Date()));
	}

}