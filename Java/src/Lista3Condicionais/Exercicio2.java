package Lista3Condicionais;
//2) Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo 
//e n�mero de horas trabalhadas de um oper�rio. E calcule o sal�rio 
//sabendo-se que ele ganha R$ 10,00 por hora. Quando o n�mero de horas exceder 
//a 50 calcule o excesso de pagamento armazenando-o na vari�vel E, caso contr�rio 
//zerar tal vari�vel. A hora excedente de trabalho vale R$ 20,00. No final do 
//processamento imprimir o sal�rio total e o sal�rio excedente.

import java.util.Scanner;
public class Exercicio2 { 
	public static void main(String[] args) {
	//Declara��o de variaveis
	String C;
	float N, E=0, S, calculo;
	Scanner ler = new Scanner(System.in);
	
	//entradas de dados
	System.out.printf("Qual o nome do oper�rio? ");
	C = ler.nextLine();
	System.out.printf("\nDigite a quantidade de horas trabalhadas:");
	N = ler.nextFloat();
	
	//condicionais
	if(N<50) {
		S=10*N;
		System.out.printf("\nO sal�rio do oper�rio %s ", C);
		System.out.printf("� de R$ %f", S);
	}
	else {
		E=(N-50)*20;
		S=10*50;
		calculo = E+S;
		System.out.printf("\nO salario do operario %s", C);
		System.out.printf(" � R$ %f ", calculo);
		System.out.printf(" O salario excedente � R$ %f ", E);
	}	
	}

}
