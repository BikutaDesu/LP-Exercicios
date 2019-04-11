package br.com.funcao;

/*
 * Objetivo     :  Calcule e mostre a s�rie 1 � 2/4 + 3/9 � 4/16 + 5/25 + ... + 15/225
 * 
 * Programador  : Victor Neves
 * Data Cria��o : 8 de mar de 2019
 */

public class Lt01_Func45 {

	public static void main(String[] args) {

		System.out.printf("Resultado da s�rie = %,.2f", calculaSerie());

	}

	public static double calculaSerie() {
		double serie = 0;

		for (int i = 1; i <= 15; i++)
			serie += i / Math.pow(i, 2);

		return serie;
	}

}
