package br.com.funcao;
/*
 * Objetivo     : 43. Calcule e mostre quantos anos ser�o necess�rios para que Ana seja maior que
 * Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m
 * e cresce 2 cm ao ano.
 *
 * Programador  : Victor Neves
 * Data Cria��o : 9 de mar de 2019
 */

public class Lt01_Func43 {

	public static void main(String[] args) {

		System.out.print(anosNecessarios());

	}

	public static int anosNecessarios() {
		double ana = 1.10;
		double maria = 1.50;
		int ano = 0;

		// calcule e mostre quantos anos ser�o necess�rios para que Ana seja maior que
		// Maria
		while (ana < maria) {
			ano++;
			ana += 0.03;
			maria += 0.02;
		}

		return ano;
	}

}
