package Lista3Condicionais;
//3) Desenvolva um sistema em que:
//Leia 4 (quatro) n�meros;
//Calcule o quadrado de cada um;
//Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
//Caso contr�rio, imprima os valores lidos e seus respectivos quadrados.

import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		//Declara��o de variaveis
		Scanner ler = new Scanner(System.in);
		int a, b, c, d;
		//Entrada de dados
		System.out.printf("Digite o primeiro n�mero: ");
		a =ler.nextInt();
		System.out.printf("\nDigite o segundo n�mero: ");
		b = ler.nextInt();
		System.out.printf("\nDigite o terceiro n�mero: ");
		c = ler.nextInt();
		System.out.printf("\nDigite o quarto n�mero: ");
		d = ler.nextInt();
		//La�o
		a = a*a;
		b = b*b;
		c = c*c;
		d = d*d;
		
		if (c >= 1000) {
			System.out.printf("\nO valor do terceiro n�mero � %d", c);
		}
		else {
			System.out.printf("\nO quadrado do primeiro n�mero �: %d", a);
			System.out.printf("\nO quadrado do segundo n�mero �: %d", b);
			System.out.printf("\nO quadrado do terceiro n�mero �: %d", c);
			System.out.printf("\nO quadrado do quarto n�mero �: %d", d);
		}
	}
}
