/* 
 * Autor: Victor Neves
 * 
 * Enunciado: Criar um procedimento que receba um numero inteiro e mostre a
 * sequ�ncia Fibonacci no pr�prio m�todo
 * 
 */

package br.com.exp1;

public class P1_Ex02 {
	
	public static void mostrarSequenciaFibonacci(int pos) {
		if (pos < 0) {
			System.out.println("N�mero Inv�lido, por favor informe um n�mero maior que 0");
		}else if(pos == 0) {
			System.out.println("Sequ�ncia: 0");
		}else if(pos == 1) {
			System.out.println("Sequ�ncia: 0 - 1");
		}else {
			String strSequencia = "0 - 1";
			int ant = 0;
			int prox = 1;
			for(int i = 2; i <= pos; i++) {
				int r = ant + prox;
				ant = prox;
				prox = r;
				strSequencia += " - " + r ;
			}
			strSequencia += ".";
			System.out.printf("Sequ�ncia: %s \n", strSequencia);
		}
	}
	
}
