package javaControlFlow;
//Lista 3 Java flow control
//na verdade o 5) era pra incluir algumas saídas no exercicio 4!!!
//6) Escreva um programa para ler 3 valores inteiros e escrever o maior deles. 
//Considere que o usuário não informará valores iguais.
import java.util.Scanner;
public class lista3exerc5 {
	public static void main(String[] args) {
		//declaração de variaveis
		Scanner ler = new Scanner(System.in);
		int a, b, c, maior;
		//entrada
		System.out.println("Olá usuário, digite 3 números a seguir para serem comparados.");
		System.out.printf("\nPrimeiro número:");
		a = ler.nextInt();
		System.out.printf("\nSegundo número:");
		b= ler.nextInt();
		System.out.printf("\nTerceiro número:");
		c = ler.nextInt();
		//condicionais
		if(a>b && a>c) {
			System.out.printf("\nO maior valor é o primeiro digitado: %d", a);
		}
		else if (b>a && b>c) {
			System.out.printf("\nO maior valor é o segundo digitado: %d", b);
		}
		else if (c>a && c>b) {
			System.out.printf("\nO maior valor é o terceiro digitado: %d", c);
		}
	}

}
