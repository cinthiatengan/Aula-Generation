package lista4LacosDeRepeticaoJava;
//5) Escrever um programa que receba v�rios n�meros inteiros no teclado. 
//E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
//Para sair digitar 0(zero).(DO...WHILE)
import java.util.Scanner;
public class lista4Exercicio5 {
	public static void main(String[] args) {
		//variaveis
		Scanner ler = new Scanner(System.in);
		int contador=0, numero, soma=0;
		float media=0;
		//la�o
		do {
			System.out.println("Entre com um valor inteiro: ");
			numero = ler.nextInt();
			//condicional para verificar se o numero � multiplo de 3
			if(numero%3==0) {
				contador++;
				soma+=numero;
				//verifica��o de calculos (posteriormente serao apagados)
				System.out.printf("\ncontador: %d", contador);
				System.out.printf("\nsoma: %d \n", soma);
			}			
		}
		while(numero !=0);
		contador--;
		media = soma/contador;
		System.out.printf("M�dia dos n�meros multiplos de 3: %f", media);
	}
}
