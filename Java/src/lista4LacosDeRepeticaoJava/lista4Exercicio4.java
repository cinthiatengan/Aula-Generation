package lista4LacosDeRepeticaoJava;
//4) Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
//No final, mostre a soma dos n�meros digitados.(DO...WHILE)
import java.util.Scanner;
public class lista4Exercicio4 {
	public static void main(String[] args) {
	//variaveis
	Scanner ler = new Scanner(System.in);
	int numero=0, soma=0;
	//la�o com entrada
	do 
		{
		System.out.printf("Entre com um valor:");
		numero = ler.nextInt();
		soma += numero;
		}
	while(numero !=0);
	System.out.printf("\nO valor da soma dos n�meros digitados �: %d", soma);
	}
}
