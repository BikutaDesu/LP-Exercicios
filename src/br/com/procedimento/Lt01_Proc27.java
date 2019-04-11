package br.com.procedimento;

/*
 * Objetivo     : 27. Receba o n�mero de voltas, a extens�o do circuito (em metros) e o tempo de dura��o (minutos). 
 * Calcule e mostre a velocidade m�dia em km/h.
 * 
 * Programador  : Victor Neves
 * Data Cria��o : 7 de mar de 2019
 */

import javax.swing.JOptionPane;

public class Lt01_Proc27 {

	public static void main(String[] args) {
		int numVoltas = Integer.parseInt(JOptionPane.showInputDialog("Digite n�mero de voltas"));
		double extensaoMetros = Double
				.parseDouble(JOptionPane.showInputDialog("Digite a extens�o do circuito (em metros)"));
		int tempoMinutos = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de dura��o(minutos)"));

		calculaVelocidadeMedia(numVoltas, extensaoMetros, tempoMinutos);

	}

	public static void calculaVelocidadeMedia(int numVoltas, double extensaoMetros, int tempoMinutos) {

		extensaoMetros /= 1000; 
		tempoMinutos /= 60; 
		double velocidadeMedia = (extensaoMetros * numVoltas) / tempoMinutos;

		JOptionPane.showMessageDialog(null, String.format("Velocidade m�dia = %,.1f km/h", velocidadeMedia));

	}

}
