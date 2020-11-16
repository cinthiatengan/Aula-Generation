package Lista3Condicionais;
//6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
//Infantil A = 5 a 7 anos
//Infantil B = 8 a 11 anos
//Juvenil A = 12 a 13 anos
//Juvenil B = 14 a 17 anos
//Adultos = Maiores de 18 anos
import java.util.Scanner;
public class Exercicio6 {
	public static void main(String[] args) {
		//declaração de variaveis
		int idade;
		Scanner ler = new Scanner(System.in);
		//entradas
		System.out.println("Classificação da categoria de nado por idade");
		System.out.println("Digite a idade(de 5 pra cima):");
		idade = ler.nextInt();
		//condicionais
		if (idade >= 5 && idade <=7) {
			System.out.println("O nadador pertence a categoria Infantil A");
		}
		else if (idade >= 8 && idade <= 11) {
			System.out.println("O nadador pertence a categoria Infantil B");
		}
		else if (idade >= 12 && idade <= 13) {
			System.out.println("O nadador pertence a categoria Juvenil A");
		}
		else if (idade >= 14 && idade <= 17) {
			System.out.println("O nadador pertence a categoria Juvenil B");
		} 
		else {
			System.out.println("O nadador pertence a categoria Adulto"); 
		}
		
	}
}
