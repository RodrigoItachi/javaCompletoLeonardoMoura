package javaCompletoLeonardoMoura.br.com.poo.classe.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setIdade(-10);
		System.out.println("Idade: " + pessoa.getIdade());
		
	}

}