package Lista2Java;
//1) Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
//Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		//declaração de variaveis
		int n1, n2, n3, soma;
		double media;
		
		//leitura das entradas dos dados do usuario
		Scanner ler = new Scanner(System.in);
		System.out.println("Olá entre com sua primeira nota de peso 2: ");
		n1 = ler.nextInt();
		System.out.println("entre com sua segunda nota de peso 3: ");
		n2 = ler.nextInt();
		System.out.println("entre com sua terceira nota de peso 5: ");
		n3 = ler.nextInt();
		
		//cálculo das notas
		n1 = n1*2;
		n2 = n2*3;
		n3 = n3*5;
		soma = n1+n2+n3;
		media = soma/10;
		
		//saida
		System.out.println("sua média é de: ");
		System.out.println(media);
		
	}
	

}
