package javaControlFlow;
//Lista 3 Java flow control
//As ma��s custam R$ 0,30 cada se forem compradas menos do que uma d�zia, 
//e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia 
//o n�mero de ma��s compradas, calcule e escreva o valor total da compra.

import java.util.Scanner;
public class lista3exerc3 {
	public static void main(String[] args) {
		//declara��o de variaveis
		Scanner ler = new Scanner(System.in);
		float quantidade;
		double total=0;
		//entrada
		System.out.printf("Entre com a quantidade de ma��s que deseja comprar: ");
		quantidade = ler.nextInt();
		//condicionais
		if (quantidade < 12) {
			total = quantidade*0.3;
			System.out.printf("\nO seu total a pagar � de: %2f", total);
		}
		else {
			total = quantidade*0.25;
			System.out.printf("\nO seu total a pagar � de: %2f", total);
			
		}
	}
}
