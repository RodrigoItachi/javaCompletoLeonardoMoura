package javaCompletoLeonardoMoura.br.com.poo.classe.heranca;

public class Jogador {
	int vida = 100;
	int x;
	int y;

	boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x--;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x++;
			break;
		}
		return true;
	}

	boolean atacar(Jogador oponente) {

		int posicaoX = Math.abs(x - oponente.x);
		int posicaoY = Math.abs(y - oponente.y);

		if (posicaoX == 0 && posicaoY == 1) {
			oponente.vida -= 10;
			return true;
		} else if (posicaoX == 1 && posicaoY == 0) {
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}

	}
}