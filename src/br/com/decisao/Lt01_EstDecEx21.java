package br.com.decisao;


/*
 * Objetivo: Receba 4 notas bimestrais de um aluno. Calcule e mostre a m�dia aritm�tica. 
 * Mostre a mensagem de acordo com a m�dia:
 * 
 * a. Se a m�dia for >= 6,0 exibir �APROVADO�;
 * b. Se a m�dia for >= 3,0 ou < 6,0 exibir �EXAME�;
 * c. Se a m�dia for < 3,0 exibir �RETIDO�.
 * 
 * @author Victor Neves
 * @date 14 de fev de 2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstDecEx21 {

	public static void main(String[] args) {

		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1� nota: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2� nota: "));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3� nota: "));
		double n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 4� nota: "));

		double media = (n1 + n2 + n3 + n4) / 4;

		if (media >= 6.0)
			JOptionPane.showMessageDialog(null, String.format("  APROVADO!%nM�dia = %,.2f", media), "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
		else if (media >= 3.0 && media < 6.0)
			JOptionPane.showMessageDialog(null, String.format("  EXAME!%nM�dia = %,.2f", media), "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
		else if (media < 3.0)
			JOptionPane.showMessageDialog(null, String.format("  RETIDO!%nM�dia = %,.2f", media), "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
	}

}
