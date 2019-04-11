package br.com.procedimento;

/*
 * Objetivo     : 16. Receba a quantidade de horas trabalhadas, o valor por hora, o percentual
 * de desconto e o n�mero de descendentes. Calcule o sal�rio que ser�o as
 * horas trabalhadas x o valor por hora. Calcule o sal�rio l�quido (= Sal�rio
 * Bruto � desconto). A cada dependente ser� acrescido R$ 100 no Sal�rio
 * L�quido. Exiba o sal�rio a receber.
 * 
 * Programador  : Victor Neves
 * Data Cria��o : 7 de mar de 2019
 */

import javax.swing.JOptionPane;

public class Lt01_Proc16 {

	public static void main(String[] args) {

		double horasTrabalhadas = Double
				.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
		double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora"));
		double percentualDesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto"));
		double numeroDescendentes = Double.parseDouble(JOptionPane.showInputDialog("Digite o n�mero de descendentes"));

		calculaSalario(horasTrabalhadas, valorHora, percentualDesconto, numeroDescendentes);
	}

	public static void calculaSalario(double horasTrabalhadas, double valorHora, double percentualDesconto,
			double numeroDescendentes) {

		double salario = ((horasTrabalhadas * valorHora) - percentualDesconto) + 100 * numeroDescendentes;

		JOptionPane.showMessageDialog(null, String.format("Sal�rio a receber R$ %,.2f", salario), "Sal�rio",
				JOptionPane.INFORMATION_MESSAGE);

	}

}
