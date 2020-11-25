package calculatorJava;
import java.util.Scanner;
/*                                     PROJETO CALCULADORA EM JAVA                               	*/
/*                    	GRUPO: LUCAS GATO, BEATRIZ, VITOR BORELLA, CINTHIA, SERGIO                 */
	
	public class MainCalc {
		public static void main(String[] args) {
		
			//variables
			int opcao;
			double a, b,memoria =0 ;
			Scanner ler = new Scanner(System.in);
			
		do {
			//outputs
			System.out.println("Bem vindo a calculadora , escolha uma opção para realizar uma operação: \n");
			System.out.println("1- Somar dois números \n");
			System.out.println("2- Subtrair dois números \n");
			System.out.println("3- Multiplicar dois números  \n");
			System.out.println("4- Dividir dois números \n");
			System.out.println("5- Potência de dois números \n");
			System.out.println("6- Raiz enésima (número e fator) \n"); // raiz quadrada ou enesima
			System.out.println("7- % de dois números \n");
			System.out.println("8- Inversão de sinal \n");
			System.out.println("-99 -> Para sair \n");
		
			opcao = ler.nextInt();
			if(opcao != -99){
				break;
			}
		switch (opcao) {
		
		case 1: { 
			//addition
			System.out.println("Opção 1: Soma.");
			System.out.println("Digite o primeiro número A:");
			a = ler.nextDouble();
			System.out.println("Digite o segundo número B:");
			b = ler.nextDouble();
			System.out.println(a + " + " + b + " = " + (a + b));
			System.out.println();
			memoria=a+b;
			break;
		}

		case 2: {
			//subtraction
			System.out.println("Opção 2: Subtração.");
			System.out.println("Digite o primeiro número A:");
			a = ler.nextDouble();
			System.out.println("Digite o segundo número B:");
			b = ler.nextDouble();
			System.out.println(a + " - " + b + " = " + (a - b));
			System.out.println();
			memoria=a-b;
			break;
		}

		case 3: {
			//multiplication
			System.out.println("Opção 3: Multiplicação.");
			System.out.println("Digite o primeiro número A:");
			a = ler.nextDouble();
			System.out.println("Digite o segundo número B:");
			b = ler.nextDouble();
			System.out.println(a + " * " + b + " = " + (a * b));
			System.out.println();
			memoria=a*b;
			break;
		}

		case 4: {
			//division
			System.out.println("Opção 4: Divisão.");
			System.out.println("Digite o primeiro número A:");
			a = ler.nextDouble();
			System.out.println("digite o segundo numero B ");
			b = ler.nextDouble();
			System.out.println(a + " / " + b + " = " + (a / b));
			System.out.println();
			memoria=a/b;
			break;
		}

		case 5: {
			//elevated
			System.out.println("Opção 5: Potência.");
			System.out.println("Digite o primeiro número A:");
			a = ler.nextDouble();
			System.out.println("Digite o segundo número B:");
			b = ler.nextDouble();
			System.out.println(a + " ^ " + b + " = " + Math.pow(a, b));
			System.out.println();
			memoria=Math.pow(a, b);
			break;
		}

		case 6: { 
			//root
			System.out.println("Opção 6: Raiz enésima.");
			System.out.println("Digite o primeiro número A dentro da raiz");
			a = ler.nextDouble();
			System.out.println("Digite o segundo número B (raiz enésima)");
			b = ler.nextDouble();
			Math.pow(a, 1.0 / b);
			System.out.println(a + " raiz " + b + " = " + (Math.pow(a, 1.0 / b)));
			System.out.println();
			memoria = Math.pow(a, 1.0 / b);
			break;
		}

		case 7: {
			//Percent
			System.out.println("Opção 7: Porcentagem.");
			System.out.println("Digite o primeiro número A:");
			a = ler.nextDouble();
			System.out.println("Digite o segundo número B:");
			b = ler.nextDouble();
			System.out.println(a + " % " + b + " = " + ((a / 100) * b));
			System.out.println();
			memoria=(a / 100) * b;
			break;
		}
		case 8: {
			//change signal
			System.out.println("Opção 8: Inversão de sinal.");
			memoria=memoria*(-1);
			System.out.println(memoria);
			System.out.println();
			break;
		}
		default:
			System.out.println("Opcao inválida.");

		} 
		

		} while (opcao != -99);
	}
}
