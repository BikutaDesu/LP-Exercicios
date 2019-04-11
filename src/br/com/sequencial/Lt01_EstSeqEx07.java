package br.com.sequencial;


/*
 * Objetivo: Receba os valores do comprimento, largura e altura de um paralelep�pedo. Calcule e mostre seu volume.
 *  
 * Autor Victor Neves
 * Data 9 de fev de 2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstSeqEx07 {

	public static void main(String[] args) {

		// coletando comprimento, largura e altura
		double comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento: "));
		double largura = Integer.parseInt(JOptionPane.showInputDialog("Digite o largura: "));
		double altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o altura: "));

		// calculando volume
		double volume = comprimento * largura * altura;

		JOptionPane.showMessageDialog(null, String.format("Volume = %,.2f cm�", volume), " - VOLUME PARALELEP�PEDO",
				JOptionPane.INFORMATION_MESSAGE);

	}

}
