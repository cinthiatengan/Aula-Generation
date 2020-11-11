programa
{
	//variaveis
	inteiro A, B, C
	real R, S, resultado
	funcao inicio()
	{
		//entrada
		escreva("Olá, o objetivo desse programa é realizar o cálculo de D = (R+S)/2 , onde R = (A+B)^2 e S= (B+C)^2")
		escreva("\nPortanto, entre com os valores a seguir: ")
		escreva("\nValor de A: ")
		leia (A)
		escreva("\nValor de B: ")
		leia(B)
		escreva("\nValor de C: ")
		leia(C)
		//calculo
		R = (A+B)*(A+B)
		escreva("\nValor de R é: ", R)

		S= (B+C)*(B+C)
		escreva("\nValor de S é: ", S)

		resultado = (R+S)/2
		//saida
		escreva("\nPortanto o valor de D é igual a: ", resultado)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 452; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */