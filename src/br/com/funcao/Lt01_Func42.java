package br.com.funcao;
/*
 * Objetivo     : 42. Calcule e mostre a s�rie 1 + 2/3 + 3/5 + ... + 50/99
 *
 * Programador  : Victor Neves
 * Data Cria��o : 9 de mar de 2019
 */

public class Lt01_Func42 {

	public static void main(String[] args) {

		System.out.printf("Summation of the series is: %,.2f", calculaSerie());

	}

	public static double calculaSerie() {
		double series = 0;
		int odd = 1;
		for (int i = 1; i <= 50; i++) {
			series += (double) i / odd;
			odd += 2;
		}

		return series;
	}

}
