package lista4LacosDeRepeticaoJava;
//6) A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
//coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:   
//a) m�dia do sal�rio da popula��o; 
//b) m�dia do n�mero de filhos; 
//c) maior sal�rio; 
//d) percentual de pessoas com sal�rio at� R$100,00.  (FOR)
import java.util.Scanner;
public class lista4Exercicio6 {
	public static void main(String[] args) {
		//variaveis
		Scanner ler = new Scanner(System.in);
		float mediasal=0, medianum=0, percentual;
		int salario, numfilhos=0, contador, totalfilhos=0, totalsalario=0, renda=0, maiorsalario=0;
		//La�o
		for (contador=1;contador<=20;contador++) {
			System.out.printf("\nDigite o seu salario R$: ");
			salario = ler.nextInt();
			System.out.printf("\nDigite o seu n�mero de filhos: ");
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
		System.out.printf("\nM�dia do sal�rio da popula��o: %f", mediasal);
		System.out.printf("\nM�dia do n�mero de filhos: %f", medianum);
		System.out.printf("\nMaior sal�rio R$: %d", maiorsalario);
		System.out.printf("\nPercentual de pessoas com sal�rio at� R$100,00 � de: %f", percentual);		
	}
}
