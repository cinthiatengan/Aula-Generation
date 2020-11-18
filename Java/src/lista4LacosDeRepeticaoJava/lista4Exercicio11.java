package lista4LacosDeRepeticaoJava;
//11) Faça um programa que pegue um número do teclado e calcule a soma de todos os números  
//de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28. .(DO...WHILE)
import java.util.Scanner;
public class lista4Exercicio11 {
	public static void main(String[] args) {
		//variaveis
		int numero, soma=0;
		Scanner ler = new Scanner(System.in);
		//entrada
		System.out.printf("Olá digite um número para somar seus fatores:");
		numero = ler.nextInt();
		do 
		{
			soma+=numero;
			numero--;
		
			
		}while(numero!=0);
		//saida
		System.out.printf("\nSeu a soma do seu número é: %d ",  soma);
	}

}
