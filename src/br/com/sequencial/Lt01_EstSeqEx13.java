package br.com.sequencial;


/* 
 * Objetivo:  Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durar� esse alimento sabendo que a pessoa consome 50g ao dia.
 * 
 * Autor: Victor Neves
 * Data: 10 de fev de 2019
 */

import java.util.Scanner;

public class Lt01_EstSeqEx13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite a quantidade de alimento (em quilos): ");
		double qtdeAlimentoKg = input.nextDouble();
		input.close();

		System.out.printf("Esse alimento durar� %d dias.", (int) (qtdeAlimentoKg * 1000) / 50);

	}

}
