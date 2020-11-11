programa
{
	//variaveis
	real duracao, horas, minutos
	funcao inicio()
	{
		//entrada e saida
		escreva("Olá, digite o número de segundos de duração do evento: ")
		leia(duracao)
		minutos = duracao/60
		escreva("\nSeu evento possui: ", minutos, " minutos")
		horas = minutos/60
		escreva("\nSeu evento possui: ", horas, " horas")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 93; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */