package Lista3Condicionais;
//Faça um sistema que leia um número inteiro e mostre uma mensagem 
//indicando se este número é par ou ímpar, e se é positivo ou negativo.

import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
		//Declaração de variaveis
		Scanner ler = new Scanner(System.in);
		int numero;
		
		//entrada
		System.out.println("Olá usuário, digite um número para verificar: ");
		numero = ler.nextInt();
		
		//condicionais
		if (numero%2 == 0 && numero>0) {
			System.out.printf("O número %d é par e positivo.", numero);
		}
		else if (numero%2 == 0 && numero<0) {
			System.out.printf("\nO número %d é par e negativo.", numero);
		}
		else if(numero%2 != 0 && numero>0) {
			System.out.printf("\nO número %d é impar e positivo.", numero);
		}
		else if (numero%2 != 0 && numero<0) {
			System.out.printf("\nO número %d é impar e negativo", numero);
		}
	}

}
