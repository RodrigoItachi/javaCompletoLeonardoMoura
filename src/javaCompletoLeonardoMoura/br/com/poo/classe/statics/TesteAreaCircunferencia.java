package javaCompletoLeonardoMoura.br.com.poo.classe.statics;

public class TesteAreaCircunferencia {

	public static void main(String[] args) {
		AreaCircunferencia c1 = new AreaCircunferencia(10);
//		c1.pi = 10;
		System.out.println(c1.area());

		System.out.println("-----------------------");
		
		AreaCircunferencia c2 = new AreaCircunferencia(5);
//		c2.pi = 5;
		System.out.println(c2.area());
	}

}