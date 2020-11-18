package lista4LacosDeRepeticaoJava;
//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
//Total de pessoas com mais de 50 anos. 
//O programa termina quando idade for =-99. (WHILE)
import java.util.Scanner;
public class lista4Exercicio3 {
	public static void main(String[] args) {
		//declaração de variaveis
		int idade=0, jovem=0, idoso=0;
		Scanner ler = new Scanner(System.in);
		//laço
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
		//essa daqui é uma correção pq o programa ainda lê o -99 como 'jovem'
		jovem--;
		System.out.printf("O total de pessoas com menos de 21 anos é de: %d", jovem);
		System.out.printf("\nO total de pessoas com mais de 50 anos é de: %d", idoso);
	}
}
