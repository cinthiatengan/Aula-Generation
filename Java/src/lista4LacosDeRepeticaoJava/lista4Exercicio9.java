package lista4LacosDeRepeticaoJava;
//9) Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar ele por tr�s  
//(imprimindo o novo valor) at� que ele seja maior do que 100. 
//Ex.: se o usu�rio digita 5,  deveremos observar na tela a seguinte sequ�ncia: 5 15 45 135.(WHILE)
import java.util.Scanner;
public class lista4Exercicio9 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, mult=0;
		//entrada 
		System.out.printf("Digite um n�mero:");
		numero = ler.nextInt();
		System.out.printf("\n%d ", numero);
		mult = numero*3;
		//La�o
		while(mult<200) {
			System.out.printf("%d ", mult);
			mult = mult*3;
		}
	}
}
