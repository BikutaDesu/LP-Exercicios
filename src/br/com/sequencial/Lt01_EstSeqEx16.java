package br.com.sequencial;


/*
 * Objetivo: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o 
 * n�mero de descendentes. Calcule o sal�rio que ser�o as horas trabalhadas x o valor por hora. 
 * Calcule o sal�rio l�quido (= Sal�rio Bruto � desconto). A cada dependente ser� acrescido R$ 100 no
 * Sal�rio L�quido. Exiba o sal�rio a receber.
 * 
 * Autor: Victor Neves
 * Data: 10 de fev de 2019
 */

import java.util.Scanner;

public class Lt01_EstSeqEx16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double horas; 
		double valorHora; 
		double percentualDesconto;
		int numeroDescendentes; 
		double salarioBruto;
		double salarioLiquido;

		System.out.print("Quantidade de horas trabalhadas: ");
		horas = input.nextDouble();

		System.out.print("Valor por hora: ");
		valorHora = input.nextDouble();

		System.out.print("Percentual de desconto: ");
		percentualDesconto = input.nextDouble();

		System.out.print("N�mero de descendentes: ");
		numeroDescendentes = input.nextInt();
		input.close();

		salarioBruto = valorHora * horas;

		percentualDesconto = 1 - (percentualDesconto / 100);
		salarioLiquido = (salarioBruto * percentualDesconto) + numeroDescendentes * 100;

		System.out.printf("Sal�rio a receber = R$ %,.2f", salarioLiquido);

	}

}
