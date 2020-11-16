package Lista3Condicionais;
//2) Elabore um sistema que leia as variáveis C e N, respectivamente código 
//e número de horas trabalhadas de um operário. E calcule o salário 
//sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder 
//a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário 
//zerar tal variável. A hora excedente de trabalho vale R$ 20,00. No final do 
//processamento imprimir o salário total e o salário excedente.

import java.util.Scanner;
public class Exercicio2 { 
	public static void main(String[] args) {
	//Declaração de variaveis
	String C;
	float N, E=0, S, calculo;
	Scanner ler = new Scanner(System.in);
	
	//entradas de dados
	System.out.printf("Qual o nome do operário? ");
	C = ler.nextLine();
	System.out.printf("\nDigite a quantidade de horas trabalhadas:");
	N = ler.nextFloat();
	
	//condicionais
	if(N<50) {
		S=10*N;
		System.out.printf("\nO salário do operário %s ", C);
		System.out.printf("é de R$ %f", S);
	}
	else {
		E=(N-50)*20;
		S=10*50;
		calculo = E+S;
		System.out.printf("\nO salario do operario %s", C);
		System.out.printf(" é R$ %f ", calculo);
		System.out.printf(" O salario excedente é R$ %f ", E);
	}	
	}

}
