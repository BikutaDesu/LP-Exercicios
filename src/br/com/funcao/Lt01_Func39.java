package br.com.funcao;
/*
 * Objetivo     : Calcule a quantidade de gr�os contidos em um tabuleiro de xadrez onde:
 * Casa: 1 2 3 4 ... 64
 * Qte:  1 2 4 8 ... N
 *
 * Programador  : Victor Neves
 * Data Cria��o : 9 de mar de 2019
 */

public class Lt01_Func39 {

	public static void main(String[] args) {

		System.out.println(graosTabuleiroXadrez());

	}

	// Calcule a quantidade de gr�os contidos em um tabuleiro de xadrez
	public static String graosTabuleiroXadrez() {
		String tabela = String.format(" %4s%14s%n", "Casa", "N. gr�os");

		for (int i = 0; i < 64; i++)
			tabela += String.format("  %02d        %,.0f%n", i + 1, Math.pow(2, i));

		return tabela;
	}

}
