package lista4LacosDeRepeticaoJava;
//5) Escrever um programa que receba vários números inteiros no teclado. 
//E no final imprimir a média dos números múltiplos de 3. 
//Para sair digitar 0(zero).(DO...WHILE)
import java.util.Scanner;
public class lista4Exercicio5 {
	public static void main(String[] args) {
		//variaveis
		Scanner ler = new Scanner(System.in);
		int contador=0, numero, soma=0;
		float media=0;
		//laço
		do {
			System.out.println("Entre com um valor inteiro: ");
			numero = ler.nextInt();
			//condicional para verificar se o numero é multiplo de 3
			if(numero%3==0) {
				contador++;
				soma+=numero;
				//verificação de calculos (posteriormente serao apagados)
				System.out.printf("\ncontador: %d", contador);
				System.out.printf("\nsoma: %d \n", soma);
			}			
		}
		while(numero !=0);
		contador--;
		media = soma/contador;
		System.out.printf("Média dos números multiplos de 3: %f", media);
	}
}
