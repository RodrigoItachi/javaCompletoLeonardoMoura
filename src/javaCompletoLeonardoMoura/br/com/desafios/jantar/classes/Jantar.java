package javaCompletoLeonardoMoura.br.com.desafios.jantar.classes;

public class Jantar {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Sandra", 55);
		Comida c1 = new Comida();
		Comida c2 = new Comida();
		
		c1.Prato = "Estrogonofe";
		c1.pesoPrato = 0.32;
		c2.Prato = "Lasanha";
		c2.pesoPrato = 0.41;
		
		System.out.println("Peso inicial");
		System.out.println(p.pesoPessoa);
		
		
		System.out.println("Peso após 1ª refeição");
		System.out.println(p.Comer(p.pesoPessoa, c1.pesoPrato ));
		
		
		System.out.println("Peso após 2ª refeição");
		System.out.println(p.Comer(p.pesoPessoa, c2.pesoPrato ));
	}

}