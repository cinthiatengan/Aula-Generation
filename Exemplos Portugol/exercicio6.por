programa
{
	inclua biblioteca Matematica -->mat
	//variaveis
	real x1, y1, x2, y2, soma, distancia
	funcao inicio()
	{
		//entradas
		escreva("Vamos calcular a distância entre 2 pontos!")
		escreva("\nDigite o X do primeiro ponto:")
		leia(x1)
		escreva("\nDigite o Y do primeiro ponto:")
		leia(y1)
		escreva("\nDigite o X do segundo ponto:")
		leia(x2)
		escreva("\nDigite o Y do segundo ponto:")
		leia(y2)
		//calculo
		soma = (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)
		distancia = mat.raiz(soma, 2)
		//saida
		escreva("\nA distância entre os pontos fornecidos é de: ", distancia)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 550; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */