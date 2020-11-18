package javaControlFlow;
//Aula do prof de DO WHILE
import java.util.Scanner;
public class AulaRepeticaoWhile {
	public static void main(String[] args) {
		int idade;
		Scanner entrada = new Scanner(System.in);
		//executa 1x depois testa a condição
		do
		 {
			System.out.printf("\nEntre com a sua idade:");
			idade = entrada.nextInt();
			System.out.printf("\nSua idade: %d", idade);
			if(idade>=18) {
				System.out.printf("\nVocê é de maior");
			}
			else {
				System.out.printf("\nVocê é de menor...");
			}
			
		} while (idade >=1);
	}
}
