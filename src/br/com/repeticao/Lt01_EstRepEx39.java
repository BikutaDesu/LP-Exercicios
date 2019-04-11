package br.com.repeticao;
/*
 * Objetivo   : Calcule a quantidade de gr�os contidos em um tabuleiro de xadrez onde:
 * Casa: 1 2 3 4 ... 64
 * Qte:  1 2 4 8 ... N
 *
 * Programador: Victor Neves
 * Data       : 21 de fev de 2019
 */

public class Lt01_EstRepEx39 {

	public static void main(String[] args) {

		// cabe�alho
		System.out.printf(" %4s%14s%n", "Casa", "N. gr�os");

		// Calcule a quantidade de gr�os contidos em um tabuleiro de xadrez
		for (int i = 0; i < 64; i++) 
			System.out.printf("  %02d        %,.0f%n", i + 1, Math.pow(2, i));
		

	}

}
