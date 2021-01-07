package javaCompletoLeonardoMoura.br.com.poo.classe.composicao;

public class Motor {

	Double fatorInjecao = 1.0;
	boolean ligado = false;

	int giros() {
		if (ligado) {
			return (int) Math.round(fatorInjecao * 3000);
		} else {
			return 0;
		}
	}
}