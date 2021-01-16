package javaCompletoLeonardoMoura.br.com.poo.classe.heranca.teste;

import javaCompletoLeonardoMoura.br.com.poo.classe.heranca.Heroi;
import javaCompletoLeonardoMoura.br.com.poo.classe.heranca.Jogador;
import javaCompletoLeonardoMoura.br.com.poo.classe.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		Jogador player1 = new Monstro();
		player1.x = 10;
		player1.y = 11;

		Jogador player2 = new Heroi();
		player2.x = 10;
		player2.y = 10;

		System.out.println("Monstro: " + player1.mostraVida());
		System.out.println("Héroi: " + player2.mostraVida());

		player1.atacar(player2);
		player2.atacar(player1);
		player2.atacar(player1);

		System.out.println("Monstro: " + player1.mostraVida());
		System.out.println("Héroi: " + player2.mostraVida());
	}

}