package Lista2Java;
//5)Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
import java.util.Scanner;
public class Exercicio5 {
	public static void main(String[] args) {
		//declaração de variaveis
		Scanner ler = new Scanner(System.in);
		int meses, dias, anos, soma;
		//entradas de dados 
		System.out.println("Qual a sua idade em:");
		System.out.println("Meses:");
		meses = ler.nextInt();
		System.out.println("Dias:");
		dias = ler.nextInt();
		System.out.println("Anos:");
		anos = ler.nextInt();
		//calculo
		soma = dias+(meses*30)+(anos*365);
		//saída
		System.out.printf("Sua idade em dias é: %d", soma);
	}
}
