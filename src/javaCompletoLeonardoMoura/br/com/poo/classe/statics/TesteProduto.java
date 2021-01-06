package javaCompletoLeonardoMoura.br.com.poo.classe.statics;

import java.util.Locale;

public class TesteProduto {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Produto p1 = new Produto();
		
		Produto.desconto = .30;
		p1.nome = "Lenovo Laptop";
		p1.preco = 5000.0;
		
		System.out.print(p1);
		System.out.println("Valor com desconto: " + String.format("%.2f", p1.precoDesconto()));
	}
}