package Lista3Condicionais;
//7) Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos 
//(positivos maiores que zero). Em caso afirmativo, calcular a �rea do tri�ngulo.
import java.util.Scanner;
public class Exercicio7 {
	public static void main(String[] args) {
		//declara��o de variaveis
		Scanner ler = new Scanner(System.in);
		float base, altura, area;
		//entrada
		System.out.println("Ol�, vamos calcular a area de um triangulo, \nforne�a os dados: ");
		System.out.printf("\nBase do tri�ngulo: ");
		base = ler.nextFloat();
		System.out.printf("\nAltura do tri�ngulo: ");
		altura = ler.nextFloat();
		//condicional
		if (altura != 0 && base != 0) {
			area = (altura*2*base)/2;
			System.out.printf("\nA �rea do seu tri�ngulo �: %f", area);
		}
		else {
			System.out.printf("\nN�o tem como calcular a �rea do tri�ngulo com valores iguais a zero!");
		}
	}

}
