package lista4LacosDeRepeticaoJava;
//8) Elaborar um programa que efetue a leitura sucessiva de valores numéricos e 
//apresente no final o total do somatório, a média e o total de valores lidos. 
//O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo 
//valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo. (WHILE)
import java.util.Scanner;
public class lista4Exercicio8 {
	public static void main(String[] args) {
		//declaração de variaveis
		Scanner ler = new Scanner(System.in);
		int numero=0, contador=0;
		float media=0, somatoria=0;
		//Laço
		while(numero>=0) {
			System.out.printf("Olá usuario, digite um número: ");
			numero = ler.nextInt();
			contador++;
			somatoria += numero; 
		}
		contador--;
		somatoria++;
		media = somatoria/contador;
		System.out.printf("\nO total de valores lidos foi de: %d.", contador);
		System.out.printf(" A somatoria total foi de: %f.", somatoria);
		System.out.printf(" Com uma média de: %f.", media);
	}
}

//ate agora to sem entender pq ele não funciona sem diminuir 1 no contador e aumentar 1 na somatoria quando sai do while
