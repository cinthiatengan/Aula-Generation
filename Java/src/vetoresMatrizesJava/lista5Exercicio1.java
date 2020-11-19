package vetoresMatrizesJava;
//Lista 5 - vetores e matrizes em Java
//1) Um dado é lançado 10 vezes e o valor correspondente é anotado. 
//Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
//A seguir determine e imprima a média aritmética dos lançamentos, 
//contabilize e apresente também quantas foram as ocorrências da maior pontuação.
import java.util.Scanner;
public class lista5Exercicio1 {
	public static void main(String[] args) {
		//declaraçao de variaveis
		Scanner ler = new Scanner(System.in);
		int[] dado = new int[10];
		int soma=0, ocorrencia=0;
		float media=0;
		//fazendo o laço do vetor para preencher cada posição
		for (int contador=0; contador<10;contador++) {
			System.out.printf("\nEntre com um valor de 1 a 6: ");
			dado[contador] = ler.nextInt();
			soma+=dado[contador];
			System.out.printf("valor da soma: %d", soma);
			if(dado[contador]==6) {
				ocorrencia++;
			}
		}
		//saida de cada posição do vetor
		for (int contador=0;contador<10;contador++) {			
			System.out.println("Valor: "+dado[contador]);
		}
		media = soma/10;
		System.out.printf("\nValor da média dos lançamentos é: %f", media);
		System.out.printf("\nNúmero de ocorrências do nº6 foi de: %d", ocorrencia);	
	}
}
