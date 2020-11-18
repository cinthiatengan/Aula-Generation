package javaControlFlow;
//Estrutura de decisão condicional Switch
//permite testar o valor de uma variavel e dependendo do valor contido nessa variavel,
//permite executar uma entre múltiplas escolhas de ações.

//exemplo de prog com essa condicional, pergunta o ponto da carne ao usuario:
import java.util.Scanner;
public class javaSwitchExemplo {
	public static void main(String[] args) {
		//declaração de variaveis
		Scanner ler = new Scanner(System.in);
		int ponto;
		//entrada
		System.out.printf("Digite o ponto da carne que deseja verificar:");
		ponto = ler.nextInt();
		//uso da condicional switch
		switch (ponto) {
		case 1:
			System.out.println("Mal passada");
			break;
		case 2:
			System.out.println("Ao ponto para mal passada");
			break;
		case 3:
			System.out.println("Ao ponto");
			break;
		case 4:
			System.out.println("Ao ponto para bem passada");
			break;
		case 5:
			System.out.println("Bem passada");
			break;
		case 6:
			System.out.println("Carvão");
			break;
		default:
			System.out.println("Escolha somente de 1 a 5!");
		}
	}

}
