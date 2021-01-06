package javaCompletoLeonardoMoura.br.com.estrutura.controle.desafio;

import javax.swing.JOptionPane;

public class DesafioIfElse {

	public static void main(String[] args) {

		String dia = JOptionPane.showInputDialog("Informe o dia: ");

		if (dia.equalsIgnoreCase("domingo".trim())) {
			JOptionPane.showMessageDialog(null, "1");
		} else if (dia.equalsIgnoreCase("segunda-feira".trim())) {
			JOptionPane.showMessageDialog(null, "2");
		} else if (dia.equalsIgnoreCase("terça-feira".trim())) {
			JOptionPane.showMessageDialog(null, "3");
		} else if (dia.equalsIgnoreCase("quanta-feira".trim())) {
			JOptionPane.showMessageDialog(null, "4");
		} else if (dia.equalsIgnoreCase("quinta-feira".trim())) {
			JOptionPane.showMessageDialog(null, "5");
		} else if (dia.equalsIgnoreCase("sexta-feira".trim())) {
			JOptionPane.showMessageDialog(null, "6");
		} else if (dia.equalsIgnoreCase("sábado".trim())) {
			JOptionPane.showMessageDialog(null, "7");
		} else {
			JOptionPane.showMessageDialog(null, "Dia errado");
		}

	}

}
