package br.com.sequencial;


/*
 * Calcule a quantidade de litros gastos em uma viagem, sabendo que o autom�vel faz 12 km/l. 
 * Receber o tempo de percurso e a velocidade m�dia.
 * 
 * 
 * Obs: Desta forma, ser� poss�vel obter a dist�ncia percorrida com a f�rmula DIST�NCIA = TEMPO * VELOCIDADE.
 * Tendo o valor da dist�ncia, basta calcular a quantidade de litros de combust�vel utilizada na viagem com 
 * a f�rmula: LITROS_GASTOS = DIST�NCIA / 12
 */

/* Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que o autom�vel faz 12 km/l. 
 * Receber o tempo de percurso e a velocidade m�dia.
 * 
 * Obs: Desta forma, ser� poss�vel obter a dist�ncia percorrida com a f�rmula DIST�NCIA = TEMPO * VELOCIDADE.
 * Tendo o valor da dist�ncia, basta calcular a quantidade de litros de combust�vel utilizada na viagem com 
 * a f�rmula: LITROS_GASTOS = DIST�NCIA / 12
 * 
 * Autor Victor Neves
 * Data 10 de fev de 2019
 */

import java.util.Scanner;

public class Lt01_EstSeqEx17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double tempoPercurso;
		double velocidadeMedia;
		double litrosGastos;

		System.out.printf("Tempo de percurso (em horas): ");
		tempoPercurso = scanner.nextDouble();

		System.out.printf("Velocidade m�dia (em km/h): ");
		velocidadeMedia = scanner.nextDouble();
		scanner.close();

		litrosGastos = tempoPercurso * velocidadeMedia / 12;

		System.out.printf("Consumo foi de %,.2f litros.", litrosGastos);

	}

}
