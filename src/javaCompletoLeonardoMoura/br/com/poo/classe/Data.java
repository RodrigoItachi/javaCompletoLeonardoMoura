package javaCompletoLeonardoMoura.br.com.poo.classe;

public class Data {
	public String dia;
	public String mes;
	public String ano;

	private String padraoData() {
		return dia + "/" + mes + "/" + ano;
	}

	public void retornaData() {
		System.out.println(padraoData());
	}
	
	public String mostraData() {
		return padraoData();
	}
}