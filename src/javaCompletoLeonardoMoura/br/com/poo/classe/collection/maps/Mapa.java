package javaCompletoLeonardoMoura.br.com.poo.classe.collection.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> user = new HashMap<>();

		user.put(1, "Carlos");
		user.put(2, "Raimunda");
		user.put(3, "Suelma");
		user.put(4, "Rodrigo");
		System.out.println(user);// mostra chaves e valores, usando toString implicitamente
		System.out.println(user.size());// mostra o tamanho
		System.out.println(user.keySet());// mostra todas as chaves
		System.out.println(user.values());// mostra todos os valores
		System.out.println(user.entrySet());// mostra chaves e valores

		System.out.println(user.containsKey(4));// verifica se a chave está presente na tabela
		System.out.println(user.containsKey(5));// verifica se a chave está presente na tabela

		System.out.println(user.containsValue("Suelma"));// verifica se o valor está presente na tabela | retornará true
		System.out.println(user.containsValue("França"));// verifica se o valor está presente na tabela | retornará
															// false

		System.out.println(user.get(4));// retorna o valor ligado a chave ou null

		for (Integer chave : user.keySet()) {
			System.out.println(chave);
		}
		for (String valor : user.values()) {
			System.out.println(valor);
		}
		
		for (Entry<Integer, String> linha : user.entrySet()) {
			System.out.println(linha);
		}
	}

}