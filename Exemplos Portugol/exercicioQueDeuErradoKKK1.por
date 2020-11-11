programa
{
	inclua biblioteca Matematica -->mat
	inteiro diaA,mesA,anoA, diaN, mesN, anoN, diaR, mesR, anoR, modulodia, modulomes, resfinal
	funcao inicio()
	{
		diaA = 5
		mesA = 11
		anoA = 2020
		
		escreva("Olá, a data atual é 5/11/2020, baseado nesta data, insira os itens pedidos a seguir: ")
		escreva("\nDigite seu dia de nascimento: ")
		leia(diaN)
		escreva("\nDigite seu mês de nascimento: ")
		leia (mesN)
		escreva("\nDigite seu ano de nascimento: ")
		leia(anoN)
		
		diaR = diaA-diaN
		modulodia = mat.valor_absoluto(diaR)
		escreva("\nNúmero de dias vividos até a data atual : ", modulodia)
		mesR = mesA-mesN
		modulomes = mat.valor_absoluto(mesR)
		escreva("\nNúmero de meses vividos até a data atual: ", modulomes)
		anoR = anoA-anoN
		escreva("\nNúmero de anos vividos até a data atual: ", anoR)
		resfinal = modulodia+modulomes*30+anoR*365
		escreva("\nO número total de dias que você possui vivo, segundo o calendário gregoriano é : ", resfinal, " dias")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 889; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */