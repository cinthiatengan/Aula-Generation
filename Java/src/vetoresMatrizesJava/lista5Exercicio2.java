package vetoresMatrizesJava;
//Lista 5 de vetores e matrizes
//Escreve um programa que l� duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos ser�o as somas dos elementos de mesma posi��o das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos ser�o as diferen�as dos elementos de mesma posi��o das matrizes N1 e N2.
import java.util.Scanner;
public class lista5Exercicio2 {
	public static void main(String[] args) {
		//declara��o de variaveis
		int[][] N1 = new int[2][2];
		int[][] N2 = new int[2][2];
		int[][] M1 = new int[2][2];
		int[][] M2 = new int[2][2];
		Scanner ler = new Scanner(System.in);
		//matriz N1 e N2
			for(int linha=0;linha<2;linha++) {
				for(int coluna=0; coluna<2; coluna++) {
					System.out.printf("Entre com o valor para a matriz N1: ");
					N1[linha][coluna] = ler.nextInt();
				}
			}
			System.out.println();
			for(int linha=0;linha<2;linha++) {
				for(int coluna=0; coluna<2; coluna++) {
					System.out.printf("Entre com o valor para a matriz N2: ");
					N2[linha][coluna] = ler.nextInt();
				}
			}
			//impress�o das matrizes N1 e N2
			System.out.println("\nMatriz N1:\n");
			for(int linha=0;linha<2;linha++) {
				System.out.println();
				for(int coluna=0; coluna<2; coluna++) {				
					System.out.printf(" [ "+N1[linha][coluna] +" ] ");					
				} System.out.println();
			}
			System.out.println("\nMatriz N2:\n");
			for(int linha=0;linha<2;linha++) {
				System.out.println();
				for(int coluna=0; coluna<2; coluna++) {
					System.out.printf(" [ "+N2[linha][coluna] +" ] ");					
				} System.out.println();
			}
			//soma e subtra��o 
			for(int linha=0;linha<2;linha++) {
				for(int coluna=0;coluna<2;coluna++) {
					M1[linha][coluna] = N1[linha][coluna]+N2[linha][coluna];
					M2[linha][coluna] = N1[linha][coluna]-N2[linha][coluna];
				}
			}
			//impress�o das matrizes M1 e M2
				System.out.println("\nMatriz M1:\n");
				for(int linha=0;linha<2;linha++) {
					System.out.println();
					for(int coluna=0; coluna<2; coluna++) {				
						System.out.printf(" [ "+M1[linha][coluna] +" ] ");					
					} System.out.println();
				}
				System.out.println("\nMatriz M2:\n");
				for(int linha=0;linha<2;linha++) {
					System.out.println();
					for(int coluna=0; coluna<2; coluna++) {
						System.out.printf(" [ "+M2[linha][coluna] +" ] ");					
					} System.out.println();
				}		
				
			}
}


