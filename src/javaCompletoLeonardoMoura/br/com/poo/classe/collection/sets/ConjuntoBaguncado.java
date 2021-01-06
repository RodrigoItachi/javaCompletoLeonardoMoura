package javaCompletoLeonardoMoura.br.com.poo.classe.collection.sets;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');

//		System.out.println("Tamanho do conjunto: " + conjunto.size());// ver o tamanho do set
//		conjunto.add("Teste");
//
//		System.out.println("Tamanho do conjunto: " + conjunto.size());// ver o tamanho do set
//		System.out.println(conjunto.remove("teste"));
//		System.out.println(conjunto.remove("Teste"));
//
//		System.out.println("Tamanho do conjunto: " + conjunto.size());// ver o tamanho do set
//
//		System.out.println(conjunto.contains("Teste"));// verifica se o valor está no conjunto
//		System.out.println(conjunto.contains(1));
//		System.out.println(conjunto.contains(false));
//		System.out.println(conjunto.contains(true));

		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
//		conjunto.addAll(nums);// faz a junção dos elementos dos conjuntos
//		System.out.println(conjunto);
		conjunto.retainAll(nums);// faz a intercecção entre os elementos dos conjuntos
		System.out.println(conjunto);
	}
}