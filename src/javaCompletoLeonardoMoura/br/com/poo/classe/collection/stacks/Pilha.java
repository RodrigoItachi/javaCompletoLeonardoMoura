package javaCompletoLeonardoMoura.br.com.poo.classe.collection.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		/* O primeiro que foi adicionado será o último a ser removido */

		Deque<String> pilha = new ArrayDeque<>();

		pilha.add("1");
		pilha.add("2");
		pilha.add("3");
		pilha.add("4");
		pilha.add("5");// retorna true ou false
//		pilha.push("5");// retona uma null
		System.out.println("#########################");

//		System.out.println(pilha.peek());// retorna null
//		System.out.println("#########################");

//		System.out.println(pilha.element());// retorna uma Exception (NoSuchElementException)
//		System.out.println("#########################");

		for (String nomes : pilha) {
			System.out.println(nomes);
		}
		System.out.println("#########################");
//		System.out.println(pilha.poll());
//		System.out.println(pilha.poll());
		System.out.println(pilha.pop());// retorna uma Exception
		System.out.println(pilha.pop());// retorna uma Exception
		System.out.println(pilha.pop());// retorna uma Exception
//		System.out.println(pilha.poll()); //retorna null
//		System.out.println(pilha.remove());// retorna uma Exception
//		System.out.println("#########################");
//
//		if (pilha.isEmpty()) {
//			System.out.println("A pilha está vazia");
//		} else {
//			System.out.println("a pilha não está vazia");
//		}
	}

}
