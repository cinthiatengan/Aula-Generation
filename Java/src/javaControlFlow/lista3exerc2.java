package javaControlFlow;
//Lista 3 Java flow control
//Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. 
//A senha válida é o número 1234. Devem ser impressas as seguintes mensagens: ACESSO PERMITIDO 
//caso a senha seja válida. ACESSO NEGADO caso a senha seja inválida.
import java.util.Scanner;
public class lista3exerc2 {
	public static void main(String[] args) {
		//declaração de variaveis
		Scanner ler = new Scanner(System.in);
		int senha=1234, tentativa;
		//entrada
		System.out.printf("Olá, digite sua senha: ");
		tentativa = ler.nextInt();
		//condicional
		if (tentativa == senha) {
			System.out.println("Acesso Permitido!");
		}
		else {
			System.out.println("Acesso Negado");
		}
	}
}
