package lista4LacosDeRepeticaoJava;
//10)Fa�a um programa que mostre uma contagem na tela de 233 a 456, 
//s� que contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando n�o estiver. (DO...WHILE)
public class lista4Exercicio10 {
	public static void main(String[] args) {
		//variaveis
		int numero=233;
		//enunciado
		System.out.println("Este programa ir� contar de 5 em 5, e quando chegar a 300 de 3 em 3 at� 400");
		//la�o
		do 
		{
			System.out.printf("\n %d ", numero);
			numero= numero+5;
			if(numero>=300 && numero<=400) {
				while(numero<=400) {
					numero = numero+3;
					System.out.printf("\n %d ", numero);
				}
			}
		} 
		while(numero>=233 && numero<=456);
	}

}
