package javaCompletoLeonardoMoura.br.com.poo.classe.construtores;

public class Data {
	private String dia;
	private String mes;
	private String ano;

	public Data() {
		dia = "01";
		mes = "01";
		ano = "1970";
	}

	public Data(String dia, String mes, String ano) {
//		super();
		this.dia = dia.substring(0, 2);
		this.mes = mes.substring(0, 2);
		this.ano = ano.substring(0, 4);
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String padraoData() {
		final String padrao = "%s/%s/%s";
		return String.format(padrao, dia,mes,ano);
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}

}