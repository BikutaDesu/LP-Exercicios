package br.com.sequencial;


/*
 * Objetivo: Receba o ano de nascimento e o ano atual. Calcule e mostre 
 * a sua idade e quantos anos ter� daqui a 17 anos.
 * 
 * Autor: Victor Neves
 * Data: 9 de fev de 2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstSeqEx12 {

	public static void main(String[] args) {

		// coletando ano de nascimento
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento: "));

		// coletando ano atual
		int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));

		JOptionPane.showMessageDialog(null, String.format("Sua idade � %d anos%nDaqui a 17 anos voc� ter� %d",
				(anoAtual - anoNascimento), (anoAtual - anoNascimento) + 17));
	}

}
