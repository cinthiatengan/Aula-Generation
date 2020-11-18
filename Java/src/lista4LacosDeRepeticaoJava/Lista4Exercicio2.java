package lista4LacosDeRepeticaoJava;
//2) Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
import java.util.Scanner;
public class Lista4Exercicio2 {
	public static void main(String[] args) {
		//declaração de variaveis
		int numero, contador, par=0, impar=0;
		Scanner ler = new Scanner(System.in);
		for(contador=1; contador<=10; contador++) {
			System.out.println("Olá usuario, digite um número:");
			numero = ler.nextInt();
			if(numero%2==0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.printf("Quantidade de números pares: %d", par);
		System.out.printf("\nQuantidade de númneros impares: %d", impar);
	}

}
