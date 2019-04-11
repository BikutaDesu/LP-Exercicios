package br.com.funcao;
/*
 * Objetivo     : 31. Calcule e mostre o quadrado dos n�meros entre 10 e 150.
 * 
 * Programador  : Victor Neves
 * Data Cria��o : 8 de mar de 2019
 */

public class Lt01_Func31 {

	public static void main(String[] args) {

		for (int i = 11; i < 150; i++)
			System.out.printf("%d� = %d%n", i, calculaQuadrado(i));

	}

	public static int calculaQuadrado(int number) {
		return number * number;
	}

}
