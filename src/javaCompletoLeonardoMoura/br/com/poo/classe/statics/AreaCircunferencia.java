package javaCompletoLeonardoMoura.br.com.poo.classe.statics;

public class AreaCircunferencia {
	double raio;
	final static double pi = 3.14;
	
	public AreaCircunferencia() {
	}
	
	public AreaCircunferencia(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return (raio * raio) * pi;  
	}
}