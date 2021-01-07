package javaCompletoLeonardoMoura.br.com.poo.classe.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		Carro carro = new Carro();

		System.out.println(carro.estaLigado());
		carro.motorLigado();
		System.out.println(carro.estaLigado());

//		System.out.println(carro.motor.giros());
		System.out.println(carro.motor);// o gito vai ser mostrado pelo toString implicito
		
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		
		System.out.println(carro.motor);

		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();		
		
		System.out.println(carro.motor);
	}

}