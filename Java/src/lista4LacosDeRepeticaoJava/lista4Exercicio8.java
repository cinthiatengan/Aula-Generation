package lista4LacosDeRepeticaoJava;
//8) Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e 
//apresente no final o total do somat�rio, a m�dia e o total de valores lidos. 
//O programa deve fazer as leituras dos valores enquanto o usu�rio estiver fornecendo 
//valores positivos. Ou seja, o programa deve parar quando o usu�rio fornecer um valor negativo. (WHILE)
import java.util.Scanner;
public class lista4Exercicio8 {
	public static void main(String[] args) {
		//declara��o de variaveis
		Scanner ler = new Scanner(System.in);
		int numero=0, contador=0;
		float media=0, somatoria=0;
		//La�o
		while(numero>=0) {
			System.out.printf("Ol� usuario, digite um n�mero: ");
			numero = ler.nextInt();
			contador++;
			somatoria += numero; 
		}
		contador--;
		somatoria++;
		media = somatoria/contador;
		System.out.printf("\nO total de valores lidos foi de: %d.", contador);
		System.out.printf(" A somatoria total foi de: %f.", somatoria);
		System.out.printf(" Com uma m�dia de: %f.", media);
	}
}

//ate agora to sem entender pq ele n�o funciona sem diminuir 1 no contador e aumentar 1 na somatoria quando sai do while
