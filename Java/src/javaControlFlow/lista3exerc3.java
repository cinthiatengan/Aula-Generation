package javaControlFlow;
//Lista 3 Java flow control
//As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, 
//e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia 
//o número de maçãs compradas, calcule e escreva o valor total da compra.

import java.util.Scanner;
public class lista3exerc3 {
	public static void main(String[] args) {
		//declaração de variaveis
		Scanner ler = new Scanner(System.in);
		float quantidade;
		double total=0;
		//entrada
		System.out.printf("Entre com a quantidade de maçãs que deseja comprar: ");
		quantidade = ler.nextInt();
		//condicionais
		if (quantidade < 12) {
			total = quantidade*0.3;
			System.out.printf("\nO seu total a pagar é de: %2f", total);
		}
		else {
			total = quantidade*0.25;
			System.out.printf("\nO seu total a pagar é de: %2f", total);
			
		}
	}
}
