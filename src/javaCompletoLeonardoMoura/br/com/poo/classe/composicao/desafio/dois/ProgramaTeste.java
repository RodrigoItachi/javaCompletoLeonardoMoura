package javaCompletoLeonardoMoura.br.com.poo.classe.composicao.desafio.dois;

public class ProgramaTeste {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Rodrigo");
		Compra compra1 = new Compra();
		compra1.addItem("TV Semp Toshiba 40\"", 5, 1500.0);
		compra1.addItem(new Produto("Painel Colibri Turqueza", 500.0), 3);

		Compra compra2 = new Compra();
		compra2.addItem("Notebook HP Pavillion G10", 2, 5000.0);
		
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println("Cliente: " + cliente.nome + "\nTotal: " + cliente.obterValorCompra());
	}

}