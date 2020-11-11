programa
{
	//variaveis
	real idade, anos, meses
	funcao inicio()
	{
		//entrada de dados
		escreva("Olá, digite sua idade em dias: ")
		leia(idade)
		anos = idade/365
		escreva("\nVocê possui: ", anos, " anos vividos")
		meses = idade/30
		escreva("\nVocê possui: ", meses, " meses vividos")
		//saida final
		escreva("\nNo total você possui: ", idade, " dias vividos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 308; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */