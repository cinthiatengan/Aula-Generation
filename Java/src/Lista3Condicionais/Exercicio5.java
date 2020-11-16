package Lista3Condicionais;
//5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 
//3 grupos de indústrias que são altamente poluentes do meio ambiente. 
//O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 
//as indústrias do 1º grupo são intimadas a suspenderem suas atividades, se o índice 
//crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades,
//se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
//Faça um sistema que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.
import java.util.Scanner;
public class Exercicio5 {
	public static void main(String[] args) {
		//declaração de variaveis
		Scanner ler = new Scanner(System.in);
		float indice;
		
		//entrada de dados
		System.out.printf("Olá, digite o índice de poluição: ");
		indice = ler.nextFloat();
		
		//condicionais
		if (indice <= 0.25) {
			System.out.printf("\nSeu indice de poluição %f, está aceitável (entre 0 e 0.25).", indice);
		}
		else if (indice >= 0.3 && indice<0.4) {
			System.out.printf("\nSeu índice de poluição %f, está acima do aceitável. ", indice);
			System.out.println("Portanto, atividades das industrias do 1º grupo estão suspensas.");
		}
		else if (indice >=0.4 && indice<0.5) {
			System.out.printf("\nSeu índice de poluição %f, está acima do aceitável. ", indice);
			System.out.printf("Portanto, atividades das industrias do 1º e 2º estão suspensas.");
		}
		else if(indice >= 0.5) {
			System.out.printf("\nSeu índice de poluição %f, está acima do aceitável. ", indice);
			System.out.printf("Portanto, todas as atividades industriais estão suspensas.");
		}
		else {
			System.out.println("Valor não apropriado");
		}
	}

}
