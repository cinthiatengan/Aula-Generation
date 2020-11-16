package Lista3Condicionais;
//1) João TOMATEIRO, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
//Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo 
//(50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. 
//João precisa que você faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso. 
//Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. 
//Caso contrário mostrar tais variáveis com o conteúdo ZERO.
import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		//declaração de variaveis
		Scanner ler = new Scanner(System.in);
		int P;
		float E=0, M=0;
		//entrada de dados
		System.out.printf("Olá João, entre com o peso da quantidade de tomate (kg): ");
		P = ler.nextInt();
		
		//condicionais
		if (P>50) {
			E = P-50;
			M = E*4;
			System.out.printf("\nJoão, sua quantidade de tomates excedeu o peso de 50 kg em %f", E);
			System.out.printf("\nPortanto, o valor da multa será de: %f ", M);
		}
		else {
			System.out.printf("\nJoão, sua quantidade de tomates não excedeu o peso de 50kg");
			System.out.printf("\nPortanto, seu excesso é %f", E, " e sua multa é %f", M);
			System.out.printf(" e sua multa é %f", M);
		}
	}

}
