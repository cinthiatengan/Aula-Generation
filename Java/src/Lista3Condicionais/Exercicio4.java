package Lista3Condicionais;
//Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem 
//indicando se este n�mero � par ou �mpar, e se � positivo ou negativo.

import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
		//Declara��o de variaveis
		Scanner ler = new Scanner(System.in);
		int numero;
		
		//entrada
		System.out.println("Ol� usu�rio, digite um n�mero para verificar: ");
		numero = ler.nextInt();
		
		//condicionais
		if (numero%2 == 0 && numero>0) {
			System.out.printf("O n�mero %d � par e positivo.", numero);
		}
		else if (numero%2 == 0 && numero<0) {
			System.out.printf("\nO n�mero %d � par e negativo.", numero);
		}
		else if(numero%2 != 0 && numero>0) {
			System.out.printf("\nO n�mero %d � impar e positivo.", numero);
		}
		else if (numero%2 != 0 && numero<0) {
			System.out.printf("\nO n�mero %d � impar e negativo", numero);
		}
	}

}
