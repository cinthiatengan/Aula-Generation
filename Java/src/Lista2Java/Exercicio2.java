package Lista2Java;
//2) O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor 
//e dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 28% e 
//os impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor.
import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		//declara��o de variaveis e de classes
		Scanner ler = new Scanner(System.in);
		double novo, fabrica;
		//entradas
		System.out.print("Entre com o valor de custo de f�brica do ve�culo:");
		fabrica = ler.nextInt();
		//calculos
		novo = fabrica + (fabrica*0.28) + (fabrica*0.45);
		//saida
		System.out.printf("\nO valor de custo ao consumidor ser� de: %2f", novo);
	}
}

