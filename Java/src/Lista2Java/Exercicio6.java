package Lista2Java;
//6)Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
import java.util.Scanner;
public class Exercicio6 {
	public static void main(String[] args) {
		//declara��o de variaveis
		Scanner ler = new Scanner(System.in);
		float idade, anos, meses;
		//entrada de dados
		System.out.print("Ol�, digite sua idade em dias:");
		idade = ler.nextInt();
		//calculo
		anos = idade/365;
		meses = idade/30;
		//saida
		System.out.println("Voc� viveu:");
		System.out.printf("%f anos\n", anos);
		System.out.printf("%f meses\n", meses);
		System.out.printf("%f dias", idade);
	}
}
