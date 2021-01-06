package javaCompletoLeonardoMoura.br.com.desafios.jantar.classes;

public class Pessoa {
	String nomePessoa;
	double pesoAdicional;
	double pesoPessoa;
	
	Pessoa(String nomePessoa, double pesoPessoa){
		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoPessoa;
	}
	
	Double Comer(Double peso, double pesoAdicional) {
		return pesoPessoa = (peso + pesoAdicional);
	}
}