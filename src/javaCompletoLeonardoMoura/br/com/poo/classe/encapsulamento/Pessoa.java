package javaCompletoLeonardoMoura.br.com.poo.classe.encapsulamento;

public class Pessoa {
	private int idade;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade < 0) {
			this.idade = 0;
		} else {
			this.idade = idade;
		}
	}
}