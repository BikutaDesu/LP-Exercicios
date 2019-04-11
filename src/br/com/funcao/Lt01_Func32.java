package br.com.funcao;

/*
 * Objetivo     : 32. Receba um n�mero inteiro. Calcule e mostre o seu fatorial.
 *
 * Programador  : Victor Neves
 * Data Cria��o : 8 de mar de 2019
 */

import javax.swing.JOptionPane;

public class Lt01_Func32 {

	public static void main(String[] args) {

		// Recebe um n�mero inteiro
		int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero inteiro: ", "Fatorial",
				JOptionPane.QUESTION_MESSAGE));

		// exibe o fatorial do n�mero
		JOptionPane.showMessageDialog(null, String.format("%,d ! = %,d", number, factorial(number)), "Fatorial",
				JOptionPane.INFORMATION_MESSAGE);

	}

	// recebe um int, calcula e retorna o fatorial do n�mero
	public static int factorial(int number) {
		int fat = 1;

		for (int i = 1; i <= number; i++)
			fat *= i;

		return fat;

	}

}
