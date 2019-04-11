package br.com.sequencial;


/*
 * Objetivo: Receba o sal�rio de um funcion�rio e mostre o novo sal�rio com reajuste de 15%.
 * 
 * Autor: Victor Neves
 * Data: 9 de fev de 2019
 */

import java.util.Scanner;

public class Lt01_EstSeqEx02 {

	public static void main(String[] args) {

		// cria um Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);

		double salarioAtual; // sal�rio atual
		double salarioReajuste; // sal�rio com reajuste

		// solicitando e coletando o sal�rio atual
		System.out.print("Digite o sal�rio atual: "); // prompt
		salarioAtual = input.nextDouble();
		input.close();

		// calculando reajuste de 15%
		salarioReajuste = salarioAtual * 1.15;

		// exibindo novo sal�rio com reajuste
		System.out.printf("Novo sal�rio com reajuste de 15%% = R$ %.2f", salarioReajuste);

	}

}
