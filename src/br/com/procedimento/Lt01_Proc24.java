package br.com.procedimento;

/*
 * Objetivo     : 24. Receba um valor inteiro. Verifique e mostre se � divis�vel por 2 e 3.
 * 
 * Programador  : Victor Neves
 * Data Cria��o : 7 de mar de 2019
 */

import javax.swing.JOptionPane;

public class Lt01_Proc24 {

	public static void main(String[] args) {

		int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um inteiro: ", "Divis�vel por 2 e 3",
				JOptionPane.QUESTION_MESSAGE));

		divisible(number);

	}

	static void divisible(int number) {
		if (number % 2 == 0 && number % 3 == 0)
			JOptionPane.showMessageDialog(null, String.format("%d � divis�vel por 2 e 3.", number),
					"Divis�vel por 2 e 3", JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, String.format("%d n�o � divis�vel por 2 e 3.", number),
					"Divis�vel por 2 e 3", JOptionPane.INFORMATION_MESSAGE);

	}

}
