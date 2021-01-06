package javaCompletoLeonardoMoura.br.com.estrutura.repeticao;

public class For3 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.printf("[%d]\n", i);
			for (int j = 0; j < 10; j++) {
				System.out.printf("\t[%d_%d]", i, j);
			}
			System.out.println();
		}
	}

}
