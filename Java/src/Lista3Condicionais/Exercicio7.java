package Lista3Condicionais;
//7) Receber valores de base e altura de um triângulo e verificar se são valores válidos 
//(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
import java.util.Scanner;
public class Exercicio7 {
	public static void main(String[] args) {
		//declaração de variaveis
		Scanner ler = new Scanner(System.in);
		float base, altura, area;
		//entrada
		System.out.println("Olá, vamos calcular a area de um triangulo, \nforneça os dados: ");
		System.out.printf("\nBase do triângulo: ");
		base = ler.nextFloat();
		System.out.printf("\nAltura do triângulo: ");
		altura = ler.nextFloat();
		//condicional
		if (altura != 0 && base != 0) {
			area = (altura*2*base)/2;
			System.out.printf("\nA área do seu triângulo é: %f", area);
		}
		else {
			System.out.printf("\nNão tem como calcular a área do triângulo com valores iguais a zero!");
		}
	}

}
