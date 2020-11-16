package Lista3Condicionais;
//5) A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 
//3 grupos de ind�strias que s�o altamente poluentes do meio ambiente. 
//O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 
//as ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades, se o �ndice 
//crescer para 0,4 as industrias do 1� e 2� grupo s�o intimadas a suspenderem suas atividades,
//se o �ndice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
//Fa�a um sistema que leia o �ndice de polui��o medido e emita a notifica��o adequada aos diferentes grupos de empresas.
import java.util.Scanner;
public class Exercicio5 {
	public static void main(String[] args) {
		//declara��o de variaveis
		Scanner ler = new Scanner(System.in);
		float indice;
		
		//entrada de dados
		System.out.printf("Ol�, digite o �ndice de polui��o: ");
		indice = ler.nextFloat();
		
		//condicionais
		if (indice <= 0.25) {
			System.out.printf("\nSeu indice de polui��o %f, est� aceit�vel (entre 0 e 0.25).", indice);
		}
		else if (indice >= 0.3 && indice<0.4) {
			System.out.printf("\nSeu �ndice de polui��o %f, est� acima do aceit�vel. ", indice);
			System.out.println("Portanto, atividades das industrias do 1� grupo est�o suspensas.");
		}
		else if (indice >=0.4 && indice<0.5) {
			System.out.printf("\nSeu �ndice de polui��o %f, est� acima do aceit�vel. ", indice);
			System.out.printf("Portanto, atividades das industrias do 1� e 2� est�o suspensas.");
		}
		else if(indice >= 0.5) {
			System.out.printf("\nSeu �ndice de polui��o %f, est� acima do aceit�vel. ", indice);
			System.out.printf("Portanto, todas as atividades industriais est�o suspensas.");
		}
		else {
			System.out.println("Valor n�o apropriado");
		}
	}

}
