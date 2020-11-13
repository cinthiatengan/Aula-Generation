package Lista2Java;
//4)Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos 
//e mostre-o expresso em horas, minutos e segundos
import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
		//declaração de variaveis e classe
		Scanner ler = new Scanner(System.in);
		float horas, duracao, minutos;
		//entradas de dados
		System.out.print("Digite o número de segundos de duração do seu evento:");
		duracao = ler.nextInt();
		//calculo
		minutos = duracao/60;
		horas = minutos/60;
		//saidas
		System.out.printf("\nSeu evento possui: %f minutos\n", minutos);
		System.out.printf("Seu evento possui: %f horas", horas);		
	}

}
