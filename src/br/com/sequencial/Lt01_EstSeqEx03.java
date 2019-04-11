package br.com.sequencial;


/*
 * Objetivo: Receba a base e a altura de um tri�ngulo. Calcule e mostre a sua �rea.
 * 
 * Autor: Victor Neves
 * Data: 9 de fev de 2019
 */

import java.util.Scanner;

public class Lt01_EstSeqEx03 {

	public static void main(String[] args) {

		// cria Scanner para obter entrada a partir da janela de comando
		Scanner scanner = new Scanner(System.in);

		// solicita a base
		System.out.print("Digite a base: ");
		double base = scanner.nextDouble();

		// solicita a altura
		System.out.print("Digite a altura: ");
		double altura = scanner.nextDouble();
		scanner.close();

		// calcula �rea do tri�ngulo
		double areaTriangulo = (base * altura) / 2;

		// exibe a �rea
		System.out.printf("%n�rea do tri�ngulo � %,.1f cm�", areaTriangulo);

	}

}
