package br.com.decisao;


/*
 * Objetivo: Receba 2 valores inteiros. Calcule e mostre o resultado da diferen�a do maior pelo menor valor.
 * 
 * Autor: Victor Neves
 * Data: 14 de fev de 2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstDecEx18 {

	public static void main(String[] args) {

		int number1, number2, difference;

		// solicita valores inteiros
		number1 = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Digite um inteiro", "N�mero 1", JOptionPane.PLAIN_MESSAGE));
		number2 = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Digite outro inteiro", "N�mero 2", JOptionPane.PLAIN_MESSAGE));

		// determina o maior valor e faz subtra��o pelo menor
		if (number1 <= number2)
			difference = number2 - number1;
		else
			difference = number1 - number2;

		// exibe diferen�a
		JOptionPane.showMessageDialog(null, String.format("A diferen�a dos n�meros � %d", difference),
				"Resultado da Diferen�a", JOptionPane.INFORMATION_MESSAGE);

	}

}
