package javaControlFlow;
//Lista 3 Java flow control
//Escreva um programa que verifique a validade de uma senha fornecida pelo usu�rio. 
//A senha v�lida � o n�mero 1234. Devem ser impressas as seguintes mensagens: ACESSO PERMITIDO 
//caso a senha seja v�lida. ACESSO NEGADO caso a senha seja inv�lida.
import java.util.Scanner;
public class lista3exerc2 {
	public static void main(String[] args) {
		//declara��o de variaveis
		Scanner ler = new Scanner(System.in);
		int senha=1234, tentativa;
		//entrada
		System.out.printf("Ol�, digite sua senha: ");
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
