package lista4LacosDeRepeticaoJava;
//2) Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
import java.util.Scanner;
public class Lista4Exercicio2 {
	public static void main(String[] args) {
		//declara��o de variaveis
		int numero, contador, par=0, impar=0;
		Scanner ler = new Scanner(System.in);
		for(contador=1; contador<=10; contador++) {
			System.out.println("Ol� usuario, digite um n�mero:");
			numero = ler.nextInt();
			if(numero%2==0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.printf("Quantidade de n�meros pares: %d", par);
		System.out.printf("\nQuantidade de n�mneros impares: %d", impar);
	}

}
