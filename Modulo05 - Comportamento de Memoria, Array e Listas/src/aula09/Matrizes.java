package aula09;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		/* 
		 * Aula 09 - Matrizes - Em programa��o, "matriz" � um nome dado a arranjos bidimensionais
		 * 	ATEN��O: "Vetor de Vetores"
		 * 
		 * Arranjo (Array) � uma estrutura de dados:
		 * 	Homog�nea (dados do mesmo tipo)
		 * 	Ordenada (Elementos acessados por meio de posi��es)
		 * 	Alocada de uma vez s�, em um bloco contiguo de memoria
		 * 
		 * VANTAGENS:
		 * 	Acesso imediato aos elementos pela sua posi��o
		 * 
		 * DESVANTAGENS:
		 * 	Tamanho fixo
		 * 	Dificuldade para se realizar inser��es e dele��es
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];// Declarando a matriz, os Colchetes que mostram que � um arranjo bidemensional
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		// Verificando a diagonal Principal
		System.out.println("Main diagonal: ");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		// Verificando quantidade de numeros negativos
		int count = 0;
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0 ) {
					count ++;
				}
			}
		}
		System.out.println("Negative numbers: " + count);
		sc.close();
	}

}
