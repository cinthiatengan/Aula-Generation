package lista4LacosDeRepeticaoJava;
//7) Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que s�o  m�ltiplos de tr�s
//e que se encontram no conjunto dos n�meros de 1 at� 500. (FOR)
public class lista4Exercicio7 {
	public static void main(String[] args) {
	//declara��o de variaveis
	int numero=0, contador, soma=0;
	//la�o de repeti��o FOR
	for (contador=1; contador<=500; contador++) {
		numero++;
		if(numero%2 != 0) {
			if (numero%3 == 0) {
				   soma += numero;
			}
		}
	}
	System.out.printf("A soma de todos os n�meros impares multiplos de 3 de 1 a 500 �: %d", soma);
	} 
}
//achei esse exercicio tretoso com essa condicional dentro de condicional D:
//nada que um fluxograma no papel n�o resolva.