package br.com.recursividade;

/*
 * Objetivo: Receba um n�mero inteiro. Calcule e mostre o seu fatorial.
 * 
 * Autor: Victor Neves
 * Data: 15/03/2019
 */

import javax.swing.JOptionPane;

public class RecursividadeEx0 {

	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero inteiro: ", "Fatorial",
				JOptionPane.QUESTION_MESSAGE));

		JOptionPane.showMessageDialog(null, String.format("%d! = %d", number, fatorial(number)), "Fatorial",
				JOptionPane.INFORMATION_MESSAGE);

	}

	public static int fatorial(int number) throws IllegalArgumentException {
		if (number < 0)
			throw new IllegalArgumentException("N�o existe fatorial de n�mero negativo");

		return number == 0 ? 1 : number * fatorial(number - 1);

	}

}
