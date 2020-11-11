programa
{
	//variaveis
	inteiro dias, meses, anos, soma
	funcao inicio()
	{
		//entrada de variaveis
		escreva("Qual sua idade em: ")
		escreva("\nMeses:")
		leia(meses)
		escreva("\nDias: ")
		leia(dias)
		escreva("\nAnos: ")
		leia(anos)

		//calculo
		soma = dias+meses*30+anos*365
		//saída
		escreva("\nSua idade em dias é: ", soma, " dias")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 347; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */