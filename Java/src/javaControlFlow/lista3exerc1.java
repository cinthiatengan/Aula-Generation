package javaControlFlow;
//lista 3 control flow no java
//1) Escreva um programa para ler 2 valores (considere que n�o ser�o informados valores iguais) 
//e escrever o maior deles.
import java.util.Scanner;
public class lista3exerc1 {
	public static void main(String[] args) {
		//declara��o de variaveis
		Scanner ler = new Scanner(System.in);
		int a, b;
		//entradas 
		System.out.printf("Ol� usu�rio, digite o primeiro valor que deseja comparar: ");
		a = ler.nextInt();
		System.out.printf("\nDigite agora o segundo valor para ser comparado: ");
		b = ler.nextInt();
		//condicionais
		if (a > b) {
			System.out.printf("\nO maior valor � o primeiro valor digitado: %d", a);
		}
		else {
			System.out.printf("\nO maior valor � o segundo valor digitado: %d", b);
		}
	}
}
