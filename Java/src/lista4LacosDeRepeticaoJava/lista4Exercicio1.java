package lista4LacosDeRepeticaoJava;
//1) Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
public class lista4Exercicio1 {
	public static void main(String[] args) {
		//declara��o de variaveis
		int contador;
		System.out.println("Este programa mostra todos os n�meros (de 1000 a 1999) que divididos por 11 se obtem resto zero.");
		//La�o For
		for(contador=1000; contador<2000; contador++) {
			if(contador%11==5) {
				System.out.printf("\n%d", contador);
			}
		}
	}
}
