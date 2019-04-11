package br.com.sequencial;


/*
 * Objetivo: Receba 2 �ngulos de um tri�ngulo. Calcule e mostre o valor do 3� �ngulo.
 * 
 * Autor: Victor Neves
 * Data: 10 de fev de 2019
 */

import java.util.Scanner;

public class Lt01_EstSeqEx14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("1� �ngulo: ");
		int angulo1 = input.nextInt();

		System.out.print("2� �ngulo: ");
		int angulo2 = input.nextInt();

		int angulo3 = 180 - (angulo1 + angulo2);

		System.out.printf("3� �ngulo = %d", angulo3);

		input.close();

	}

}
