package lista4LacosDeRepeticaoJava;
//6) A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
//coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
//a) média do salário da população; 
//b) média do número de filhos; 
//c) maior salário; 
//d) percentual de pessoas com salário até R$100,00.  (FOR)
import java.util.Scanner;
public class lista4Exercicio6 {
	public static void main(String[] args) {
		//variaveis
		Scanner ler = new Scanner(System.in);
		float mediasal=0, medianum=0, percentual;
		int salario, numfilhos=0, contador, totalfilhos=0, totalsalario=0, renda=0, maiorsalario=0;
		//Laço
		for (contador=1;contador<=20;contador++) {
			System.out.printf("\nDigite o seu salario R$: ");
			salario = ler.nextInt();
			System.out.printf("\nDigite o seu número de filhos: ");
			numfilhos = ler.nextInt();
			totalfilhos += numfilhos;
			totalsalario += salario;
			//condicional
				if(salario<=100) {
					renda++;
				}
				if(salario>maiorsalario) {
					maiorsalario = 0;
					maiorsalario +=salario;
				}
		}
		//calculo das medias
		mediasal = totalsalario/20;
		medianum = totalfilhos/20;
		//percentual
		percentual = (renda*100)/20;
		//saidas
		System.out.printf("\nMédia do salário da população: %f", mediasal);
		System.out.printf("\nMédia do número de filhos: %f", medianum);
		System.out.printf("\nMaior salário R$: %d", maiorsalario);
		System.out.printf("\nPercentual de pessoas com salário até R$100,00 é de: %f", percentual);		
	}
}
