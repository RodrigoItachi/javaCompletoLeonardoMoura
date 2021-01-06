package javaCompletoLeonardoMoura.br.com.desafios;

public class Desafio02 {

	public static void main(String[] args) {
		boolean trabalhoTerca = true , trabalhoQuinta = true;
		
		if(trabalhoTerca && trabalhoQuinta) {
			System.out.println("Vai ao shopping comprar uma TV de 50\" no fim de semana e vai tomar sorvete.");
		}else if (trabalhoTerca ^ trabalhoQuinta) {
			System.out.println("Vai ao shopping comprar uma TV de 32\" no fim de semana e vai tomar sorvete.");
		}else {
			System.out.println("Vai ficar em casa pois não conseguiu nenhum trabalho.");
		}
		
	}

}