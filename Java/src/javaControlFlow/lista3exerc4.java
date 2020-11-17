package javaControlFlow;
//Lista 3 Java flow control
//. Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm). Calcular e imprimir o seguinte:
//− Se o número de lados for igual a 3 escrever TRIANGULO e o valor da área 
//− Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área. 
//− Se o número de lados for igual a 5 escrever PENTÁGONO.

import java.util.Scanner;
public class lista3exerc4 {
	public static void main(String[] args) {
		//declaração de variaveis
		Scanner ler = new Scanner(System.in);
		int lados;
		double h, rquad=1.732, area;
		//entrada
		System.out.printf("Olá usuário, digite o número de lados do seu polígono:");
		lados = ler.nextInt();
		//condicionais
		if (lados == 3) {
			h = (lados*rquad)/2;
			area = (2*lados*h)/2;
			System.out.printf("\nÉ um TRIANGULO equilátero de area: %2f", area);
		}
		else if (lados == 4) {
			area = lados*lados;
			System.out.printf("\nÉ um QUADRADO de area: %2f", area);
		}
		else if (lados == 5) {
			System.out.printf("\nÉ um PENTAGONO.");
		}
		else if (lados < 3) {
			System.out.printf("\nNão é um polígono!");
		}
		else {
			System.out.printf("\nPoligono não identificado!");
		}
	
}
}
