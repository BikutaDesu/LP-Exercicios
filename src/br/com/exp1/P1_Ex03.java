/* 
 * Autor: Victor Neves
 * 
 * Enunciado: Criar um menu de opções para chamada das questões 1 e 2, 
 * assim como as respectivas variáveis de envio e retorno. 
 * Na opção 2 enviar cada valor do vetor somente entre 1 a 10
 * 
 *  --     Menu Principal       --
 *  -- 1-Carrega vetor          --
 *  -- 2-Mostrar sequência Fibo --
 *  -- 3-Fim                    --
 *  
 */

package br.com.exp1;

import java.util.Scanner;

public class P1_Ex03 {
	static int[] vetNumeros = new int[400];
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		menuPrincipal();
	}
	
	static void menuPrincipal() {
		int opc = 0;
		System.out.println("--     Menu Principal       --");
		System.out.println("-- 1-Carrega vetor          --");
		System.out.println("-- 2-Mostrar sequência Fibo --");
		System.out.println("-- 3-Fim                    --");
		System.out.print("Opção: ");
		opc = sc.nextInt();
		while(opc != 1 && opc != 2 && opc != 3) {
			System.out.println("\nDigite uma opção válida");
			System.out.print("Opção: ");
			opc = sc.nextInt();
		}
		switch (opc) {
		case 1:
			vetNumeros = P1_Ex01.carregarVetor(vetNumeros.length, 400);
			System.out.println("Vetor carregado!");
			break;
		case 2:
			for(int i = 0; i < vetNumeros.length; i++) {
				if (vetNumeros[i] > 0 && vetNumeros[i] <= 10) {
					P1_Ex02.mostrarSequenciaFibonacci(vetNumeros[i]);
				}
			}
			break;
		case 3:
			System.out.println("Encerrando...");
			break;
		}
		if (opc != 3) {
			String dec = "n";
			System.out.println("Deseja retornar ao menu principal ? s/n");
			System.out.print("Opção: ");
			dec = sc.next().toLowerCase();
			while(!dec.equals("s") && !dec.equals("n")) {
				System.out.println("Digite uma opção válida...");
				System.out.print("Opção: ");
				dec = sc.next();
			}
			if (dec.equals("s")) {
				menuPrincipal();
			}else if(dec.equals("n")) {
				System.out.println("Encerrando...");
			}
		}
	}
	
}
