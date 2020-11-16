package Lista3Condicionais;
//3) Desenvolva um sistema em que:
//Leia 4 (quatro) números;
//Calcule o quadrado de cada um;
//Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
//Caso contrário, imprima os valores lidos e seus respectivos quadrados.

import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		//Declaração de variaveis
		Scanner ler = new Scanner(System.in);
		int a, b, c, d;
		//Entrada de dados
		System.out.printf("Digite o primeiro número: ");
		a =ler.nextInt();
		System.out.printf("\nDigite o segundo número: ");
		b = ler.nextInt();
		System.out.printf("\nDigite o terceiro número: ");
		c = ler.nextInt();
		System.out.printf("\nDigite o quarto número: ");
		d = ler.nextInt();
		//Laço
		a = a*a;
		b = b*b;
		c = c*c;
		d = d*d;
		
		if (c >= 1000) {
			System.out.printf("\nO valor do terceiro número é %d", c);
		}
		else {
			System.out.printf("\nO quadrado do primeiro número é: %d", a);
			System.out.printf("\nO quadrado do segundo número é: %d", b);
			System.out.printf("\nO quadrado do terceiro número é: %d", c);
			System.out.printf("\nO quadrado do quarto número é: %d", d);
		}
	}
}
