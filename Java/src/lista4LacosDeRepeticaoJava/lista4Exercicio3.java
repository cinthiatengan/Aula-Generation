package lista4LacosDeRepeticaoJava;
//Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
//Total de pessoas com mais de 50 anos. 
//O programa termina quando idade for =-99. (WHILE)
import java.util.Scanner;
public class lista4Exercicio3 {
	public static void main(String[] args) {
		//declara��o de variaveis
		int idade=0, jovem=0, idoso=0;
		Scanner ler = new Scanner(System.in);
		//la�o
		while(idade != -99) {
			System.out.printf("\nDigite uma idade:");
			idade = ler.nextInt();
			if (idade<21) {
				jovem++;
			}
			else if (idade>50) {
				idoso++;
			}
		}
		//essa daqui � uma corre��o pq o programa ainda l� o -99 como 'jovem'
		jovem--;
		System.out.printf("O total de pessoas com menos de 21 anos � de: %d", jovem);
		System.out.printf("\nO total de pessoas com mais de 50 anos � de: %d", idoso);
	}
}
