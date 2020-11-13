package Lista2Java;
//3)Escreva um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
//D= (R+S)/2 onde R=(A+B)^2 e S=(B+C)^2
import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		//declaração de variaveis
		int A, B, C;
		float R, S, D, soma;
		Scanner ler = new Scanner(System.in);
		//entradas de dados do usuario
		System.out.println("Olá entre com o valor de A: ");
		A = ler.nextInt();
		System.out.println("Valor de B: ");
		B = ler.nextInt();
		System.out.println("Valor de C: ");
		C = ler.nextInt();
		//calculo 
		R = (A+B)*(A+B);
		S = (B+C)*(B+C);
		soma = R+S;
		D = soma/2;
		//saida
		System.out.printf("O valor de D é: %f", D);
	}
}
