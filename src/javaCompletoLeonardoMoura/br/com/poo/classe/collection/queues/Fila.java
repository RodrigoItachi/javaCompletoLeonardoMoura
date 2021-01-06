package javaCompletoLeonardoMoura.br.com.poo.classe.collection.queues;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		fila.add("Ana");// retorna uma Exception se exceder o tamanho da fila
		fila.offer("Bia");// retorna verdadeiro ou falso se exceder o tamanho da fila;

		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Karina");

		// Ocorre quando a fila está vazia.
		System.out.println("-------------------------");
		System.out.println(fila.peek());// retorna null
		System.out.println(fila.peek());// retorna null
		System.out.println("-------------------------");
		System.out.println(fila.element());// retorna exception
		System.out.println(fila.element());// retorna exception
		System.out.println("-------------------------");

		for (String individuo : fila) {
			System.out.println(individuo);
		}

		System.out.println("-------------------------");

//		System.out.println(fila.size());
//		fila.clear();

		for (String individuo : fila) {
			System.out.println(individuo);
		}
		System.out.println("-------------------------");
		if (fila.isEmpty()) {
			System.out.println("A fila está vazia.");
		} else {
			System.out.println("A vila não está vazia.");
		}
		System.out.println("-------------------------");
		System.out.println();

		System.out.println("-------------------------");
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println("-------------------------");
		if (fila.isEmpty()) {
			System.out.println("A fila está vazia.");
		} else {
			System.out.println("A vila não está vazia.");
		}
		System.out.println("-------------------------");

		//poll e remove obtem o próximo elemento e remove da fila.
		
		System.out.println(fila.poll());// retorna null 
		System.out.println(fila.remove());// retorna uma Excepiton

		System.out.println("-------------------------");
		if (fila.isEmpty()) {
			System.out.println("A fila está vazia.");
		} else {
			System.out.println("A vila não está vazia.");
		}

	}
}