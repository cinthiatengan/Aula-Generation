package lista4LacosDeRepeticaoJava;
//7) Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três
//e que se encontram no conjunto dos números de 1 até 500. (FOR)
public class lista4Exercicio7 {
	public static void main(String[] args) {
	//declaração de variaveis
	int numero=0, contador, soma=0;
	//laço de repetição FOR
	for (contador=1; contador<=500; contador++) {
		numero++;
		if(numero%2 != 0) {
			if (numero%3 == 0) {
				   soma += numero;
			}
		}
	}
	System.out.printf("A soma de todos os números impares multiplos de 3 de 1 a 500 é: %d", soma);
	} 
}
//achei esse exercicio tretoso com essa condicional dentro de condicional D:
//nada que um fluxograma no papel não resolva.