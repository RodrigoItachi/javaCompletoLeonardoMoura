package javaCompletoLeonardoMoura.br.com.poo.classe.collection.lists;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Usuario> usuarios = new ArrayList<>();
		Usuario usuario = new Usuario("Ana");

		usuarios.add(usuario);
		usuarios.add(new Usuario("Carlos"));
		usuarios.add(new Usuario("Lia"));
		usuarios.add(new Usuario("Bia"));
		usuarios.add(new Usuario("Manu"));

		for (Usuario user : usuarios) {
			System.out.println(user);
		}
		System.out.println("----------------------------------------------");

		System.out.println("Resultado da busca: " + usuarios.get(3));// Acessando pelo indice da lista.
		System.out.println("----------------------------------------------");

//		System.out.println(usuarios.remove(1));
//		System.out.println(usuarios.remove(new Usuario("Manu")));
		System.out.println("Achou o usúario? " + (usuarios.contains(new Usuario("Pedro")) ? "SIM" : "NÃO"));
		System.out.println("----------------------------------------------");
		for (Usuario user : usuarios) {
			System.out.println(user);
		}
		System.out.println("----------------------------------------------");

	}

}