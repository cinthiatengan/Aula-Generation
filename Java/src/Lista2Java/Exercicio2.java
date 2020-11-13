package Lista2Java;
//2) O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor 
//e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e 
//os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.
import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		//declaração de variaveis e de classes
		Scanner ler = new Scanner(System.in);
		double novo, fabrica;
		//entradas
		System.out.print("Entre com o valor de custo de fábrica do veículo:");
		fabrica = ler.nextInt();
		//calculos
		novo = fabrica + (fabrica*0.28) + (fabrica*0.45);
		//saida
		System.out.printf("\nO valor de custo ao consumidor será de: %2f", novo);
	}
}

