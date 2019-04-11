package br.com.recursividade;

/*
 * Objetivo: Serie5 = (N)! + (N-1)! + (N-2)! + ... + (1)!
 * 
 * Autor: Victor Neves
 * Data: 16/03/2019
 */

import javax.swing.JOptionPane;

public class RecursividadeEx5 {

	public static void main(String[] args) {

		int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero inteiro: ",
				"Serie = (N)! + (N-1)! + (N-2)! + ... + (1)!", JOptionPane.QUESTION_MESSAGE));

		JOptionPane.showMessageDialog(null, String.format("Resutado da s�rie = %d", calculaSerie5(number)),
				"Serie = (N)! + (N-1)! + (N-2)! + ... + (1)!", JOptionPane.INFORMATION_MESSAGE);

	}

	public static int calculaSerie5(int number) {
		return number == 1 ? 1 : fatorial(number) + calculaSerie5(number - 1);

	}

	public static int fatorial(int number) throws IllegalArgumentException {
		if (number < 0)
			throw new IllegalArgumentException("N�o existe fatorial de n�mero negativo");

		return number == 0 ? 1 : number * fatorial(number - 1);
	}

}
