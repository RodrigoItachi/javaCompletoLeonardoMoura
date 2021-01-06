package javaCompletoLeonardoMoura.br.com.operadores;

public class UnarioBinarioTernario {

	public static void main(String[] args) {
		unario();
		System.out.println("------------------------");
		binario();
		System.out.println("------------------------");
		ternario();
	}

	static void unario() {
		int x = 1;

		System.out.println(x++);
	}

	static void binario() {
		int x = 2;
		int y = 4;

		System.out.println(x + y);
	}

	static void ternario() {
		int x = 3;
		System.out.println(x);
	}

}