package Lista2Java;
//1) Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
//Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		//declara��o de variaveis
		int n1, n2, n3, soma;
		double media;
		
		//leitura das entradas dos dados do usuario
		Scanner ler = new Scanner(System.in);
		System.out.println("Ol� entre com sua primeira nota de peso 2: ");
		n1 = ler.nextInt();
		System.out.println("entre com sua segunda nota de peso 3: ");
		n2 = ler.nextInt();
		System.out.println("entre com sua terceira nota de peso 5: ");
		n3 = ler.nextInt();
		
		//c�lculo das notas
		n1 = n1*2;
		n2 = n2*3;
		n3 = n3*5;
		soma = n1+n2+n3;
		media = soma/10;
		
		//saida
		System.out.println("sua m�dia � de: ");
		System.out.println(media);
		
	}
	

}
