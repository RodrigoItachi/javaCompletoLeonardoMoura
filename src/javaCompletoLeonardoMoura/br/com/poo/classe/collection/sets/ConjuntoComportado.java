package javaCompletoLeonardoMoura.br.com.poo.classe.collection.sets;

import java.util.HashSet;
//import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
//		Set<String> lista = new HashSet<>();// HashSet: um conjunto que não tem ordenação
//		Set<String> lista = new TreeSet<>();// TreeSet: um conjunto que aceita ordenação
		SortedSet<String> lista = new TreeSet<>();// SortedSet: um conjunto que aceita ordenação
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Luiza");
		lista.add("Pedro");

		for (String nomes : lista) {
			System.out.println(nomes);
		}

		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);

		for (Integer num : nums) {
			System.out.println(num);
		}
		
	}

}