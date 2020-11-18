package lista4LacosDeRepeticaoJava;
//9) Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  
//(imprimindo o novo valor) até que ele seja maior do que 100. 
//Ex.: se o usuário digita 5,  deveremos observar na tela a seguinte sequência: 5 15 45 135.(WHILE)
import java.util.Scanner;
public class lista4Exercicio9 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, mult=0;
		//entrada 
		System.out.printf("Digite um número:");
		numero = ler.nextInt();
		System.out.printf("\n%d ", numero);
		mult = numero*3;
		//Laço
		while(mult<200) {
			System.out.printf("%d ", mult);
			mult = mult*3;
		}
	}
}
