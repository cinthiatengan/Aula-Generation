package Lista3Condicionais;
//1) Jo�o TOMATEIRO, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho. 
//Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de S�o Paulo 
//(50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. 
//Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates) e verifique se h� excesso. 
//Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa que Jo�o dever� pagar. 
//Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		//declara��o de variaveis
		Scanner ler = new Scanner(System.in);
		int P;
		float E=0, M=0;
		//entrada de dados
		System.out.printf("Ol� Jo�o, entre com o peso da quantidade de tomate (kg): ");
		P = ler.nextInt();
		
		//condicionais
		if (P>50) {
			E = P-50;
			M = E*4;
			System.out.printf("\nJo�o, sua quantidade de tomates excedeu o peso de 50 kg em %f", E);
			System.out.printf("\nPortanto, o valor da multa ser� de: %f ", M);
		}
		else {
			System.out.printf("\nJo�o, sua quantidade de tomates n�o excedeu o peso de 50kg");
			System.out.printf("\nPortanto, seu excesso � %f", E, " e sua multa � %f", M);
			System.out.printf(" e sua multa � %f", M);
		}
	}

}
