package br.com.sequencial;

/*
 * Objetivo: Coletar o valor do lado de um quadrado, calcular sua �rea e apresentar o resultado.
 * 
 * Autor: Victor Neves
 * Data: 9 de fev de 2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstSeqEx01 {

	public static void main(String[] args) {
		double lado;
		double areaQuadrado;

		// solicita para o usu�rio valor do lado do quadrado
		lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado do quadrado"));

		// calcula �rea
		areaQuadrado = Math.pow(lado, 2);

		// exibe o resultado
		JOptionPane.showMessageDialog(null, "�rea do quadrado � de " + areaQuadrado + " cm�");

	}

}
