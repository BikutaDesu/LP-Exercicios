package br.com.sequencial;

/*
 * Objetivo: Coletar o valor do lado de um quadrado, calcular sua ï¿½rea e apresentar o resultado.
 * 
 * Autor: Victor Neves
 * Data: 9 de fev de 2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstSeqEx01 {

	public static void main(String[] args) {
		double lado;
		double areaQuadrado;

		// solicita para o usuï¿½rio valor do lado do quadrado
		lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado do quadrado"));

		// calcula ï¿½rea
		areaQuadrado = Math.pow(lado, 2);

		// exibe o resultado
		JOptionPane.showMessageDialog(null, "área do quadrado é de " + areaQuadrado + " cm²");

	}

}
