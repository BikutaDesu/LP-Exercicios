package br.com.procedimento;
/*
 * Objetivo     : 21. Receba 4 notas bimestrais de um aluno. Calcule e mostre a m�dia aritm�tica.
 * Mostre a mensagem de acordo com a m�dia:
 * 
 * a. Se a m�dia for >= 6,0 exibir �APROVADO�;
 * b. Se a m�dia for >= 3,0 ou < 6,0 exibir �EXAME�;
 * c. Se a m�dia for < 3,0 exibir �RETIDO�.
 * 
 * Programador  : Victor Neves
 * Data Cria��o : 7 de mar de 2019
 */

import javax.swing.JOptionPane;

public class Lt01_Proc21 {

	public static void main(String[] args) {

		double grade1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1� nota: "));
		double grade2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2� nota: "));
		double grade3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3� nota: "));
		double grade4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 4� nota: "));

		arithmeticAverage(grade1, grade2, grade3, grade4);

	}

	public static void arithmeticAverage(double grade1, double grade2, double grade3, double grade4) {
		double average = (grade1 + grade2 + grade3 + grade4) / 4; 

		if (average >= 6.0)
			JOptionPane.showMessageDialog(null, String.format("M�dia = %,.2f APROVADO!", average), "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
		else if (average >= 3.0 && average < 6.0)
			JOptionPane.showMessageDialog(null, String.format("M�dia = %,.2f EXAME!", average), "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
		else if (average < 3.0)
			JOptionPane.showMessageDialog(null, String.format("M�dia = %,.2f RETIDO!", average), "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
	}

}
