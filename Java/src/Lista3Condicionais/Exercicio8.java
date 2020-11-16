package Lista3Condicionais;
//Construa um sistema para ler uma variável numérica N e imprimi-la somente se 
//a mesma for maior que 100, caso contrário imprimi-la com o valor zero.
import java.util.*;
public class Exercicio8 {
	public static void main(String[] args) {
		//declaração de variaveis
		Scanner ler = new Scanner(System.in);
		int numero;
		//entradas de dados
		System.out.printf("Entre com um valor: ");
		numero = ler.nextInt();
		//condicionais
		if (numero>100) {
			System.out.printf("Seu número é %d", numero);
		}
		else 
			System.out.printf("\nSeu número é zero.");
	}

}
