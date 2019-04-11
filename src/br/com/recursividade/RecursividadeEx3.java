package br.com.recursividade;

import javax.swing.JOptionPane;

/*
 * Objetivo: Serie3 = (1/1) + (1/2) + (1/3) + ....+ (1/N)
 * 
 * Autor: Victor Neves
 * Data: 16/03/2019
 */

public class RecursividadeEx3 {

	public static void main(String[] args) {

		int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero inteiro: ",
				"Serie = (1/1) + (1/2) + (1/3) + ....+ (1/N)", JOptionPane.QUESTION_MESSAGE));

		JOptionPane.showMessageDialog(null, String.format("Resutado da s�rie � de %,.2f", calculaSerie3(number)),
				"Serie = (1/1) + (1/2) + (1/3) + ....+ (1/N)", JOptionPane.INFORMATION_MESSAGE);
	}

	public static double calculaSerie3(int number) {
		return number == 1 ? 1 : ((double) 1 / number) + (1 / calculaSerie3(number - 1));

	}

}
