package Lista2Java;
//4)Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos 
//e mostre-o expresso em horas, minutos e segundos
import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
		//declara��o de variaveis e classe
		Scanner ler = new Scanner(System.in);
		float horas, duracao, minutos;
		//entradas de dados
		System.out.print("Digite o n�mero de segundos de dura��o do seu evento:");
		duracao = ler.nextInt();
		//calculo
		minutos = duracao/60;
		horas = minutos/60;
		//saidas
		System.out.printf("\nSeu evento possui: %f minutos\n", minutos);
		System.out.printf("Seu evento possui: %f horas", horas);		
	}

}
