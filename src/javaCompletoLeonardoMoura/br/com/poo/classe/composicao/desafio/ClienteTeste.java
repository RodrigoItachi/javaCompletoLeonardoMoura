package javaCompletoLeonardoMoura.br.com.poo.classe.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Frankleudo Júnior");

		Compra compra1 = new Compra();
		compra1.addItem("Xiaomi mi 10", 2000.0, 1);// item 1
		compra1.addItem(new Produto("Mesa", 350.0), 2);// item 2

		Compra compra2 = new Compra();
		compra2.addItem("Bicicleta Monark Aro 26\"", 580.0, 3);
		compra2.addItem(new Produto("Caneta Office Preta", 0.85), 50);

		cliente.compras.add(compra1);
		cliente.compras.add(compra2);

		System.out.println("Compras feitas por " + cliente.nome);
		System.out.println(": " + cliente.obterValorTotalCompras());
	}

}