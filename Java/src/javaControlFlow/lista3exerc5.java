package javaControlFlow;
//Lista 3 Java flow control
//na verdade o 5) era pra incluir algumas sa�das no exercicio 4!!!
//6) Escreva um programa para ler 3 valores inteiros e escrever o maior deles. 
//Considere que o usu�rio n�o informar� valores iguais.
import java.util.Scanner;
public class lista3exerc5 {
	public static void main(String[] args) {
		//declara��o de variaveis
		Scanner ler = new Scanner(System.in);
		int a, b, c, maior;
		//entrada
		System.out.println("Ol� usu�rio, digite 3 n�meros a seguir para serem comparados.");
		System.out.printf("\nPrimeiro n�mero:");
		a = ler.nextInt();
		System.out.printf("\nSegundo n�mero:");
		b= ler.nextInt();
		System.out.printf("\nTerceiro n�mero:");
		c = ler.nextInt();
		//condicionais
		if(a>b && a>c) {
			System.out.printf("\nO maior valor � o primeiro digitado: %d", a);
		}
		else if (b>a && b>c) {
			System.out.printf("\nO maior valor � o segundo digitado: %d", b);
		}
		else if (c>a && c>b) {
			System.out.printf("\nO maior valor � o terceiro digitado: %d", c);
		}
	}

}
