package br.com.decisao;


/*
 * Objetivo: Receba o pre�o atual e a m�dia mensal de um produto. Calcule e mostre o
 * novo pre�o sabendo que:
 *  Venda Mensal        Pre�o Atual          Pre�o Novo
 *   < 500                < 30                  + 10%
 *   >= 500 e < 1000      >= 30 e < 80          + 15%
 *   >= 1000              >= 80                 - 5%
 * Obs.: para outras condi��es, pre�o novo ser� igual ao pre�o atual.
 * 
 * Autor: Victor Neves
 * Data: 15 de fev de 2019
 */

import java.util.Scanner;

public class Lt01_EstDecEx28 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double precoAtual;
		double mediaMensal;
		double precoNovo = 0;

		System.out.print("Digite o Pre�o Atual: ");
		precoAtual = scanner.nextDouble();

		System.out.print("Digite a M�dia/Venda Mensal: ");
		mediaMensal = scanner.nextDouble();
		scanner.close();

		// caso nenhuma condi��o seja correspondente; pre�o novo ser� igual ao pre�o
		// atual
		precoNovo = precoAtual;

		// calculando novo pre�o
		if (mediaMensal < 500.0 && precoAtual < 30.0)
			precoNovo = precoAtual * 1.10;
		else if (mediaMensal >= 500.0 && mediaMensal < 1000 && precoAtual >= 30 && precoAtual < 80)
			precoNovo = precoAtual * 1.15;
		else if (mediaMensal >= 1000 && precoAtual >= 80)
			precoNovo = precoAtual * 0.95;

		System.out.printf("Novo pre�o � R$ %,.2f", precoNovo);

	}

}
