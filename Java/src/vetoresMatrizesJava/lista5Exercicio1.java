package vetoresMatrizesJava;
//Lista 5 - vetores e matrizes em Java
//1) Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
//Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
//A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, 
//contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
import java.util.Scanner;
public class lista5Exercicio1 {
	public static void main(String[] args) {
		//declara�ao de variaveis
		Scanner ler = new Scanner(System.in);
		int[] dado = new int[10];
		int soma=0, ocorrencia=0;
		float media=0;
		//fazendo o la�o do vetor para preencher cada posi��o
		for (int contador=0; contador<10;contador++) {
			System.out.printf("\nEntre com um valor de 1 a 6: ");
			dado[contador] = ler.nextInt();
			soma+=dado[contador];
			System.out.printf("valor da soma: %d", soma);
			if(dado[contador]==6) {
				ocorrencia++;
			}
		}
		//saida de cada posi��o do vetor
		for (int contador=0;contador<10;contador++) {			
			System.out.println("Valor: "+dado[contador]);
		}
		media = soma/10;
		System.out.printf("\nValor da m�dia dos lan�amentos �: %f", media);
		System.out.printf("\nN�mero de ocorr�ncias do n�6 foi de: %d", ocorrencia);	
	}
}
