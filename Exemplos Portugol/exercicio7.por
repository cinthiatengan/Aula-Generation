programa
{
	//variaveis
	real letraA, letraB, letraC, letraD, letraE, letraF, xresult, yresult
	funcao inicio()
	{
		//entrada
		escreva("Olá vamos resolver um sistema linear do tipo ax+by=c, dx+ey=f que devolva o valor de x e y")
		escreva("\nDigite um valor para a: ")
		leia(letraA)
		escreva("\nDigite um valor para b: ")
		leia(letraB)
		escreva("\nDigite um valor para c: ")
		leia(letraC)
		escreva("\nDigite um valor para d: ")
		leia(letraD)
		escreva("\nDigite um valor para e: ")
		leia(letraE)
		escreva("\nDigite um valor para f: ")
		leia(letraF)

		//calculo de x e y
		xresult = (letraC*letraE-letraB*letraF)/(letraA*letraE-letraB*letraD)
		yresult = (letraA*letraF-letraC*letraD)/(letraA*letraE-letraB*letraD)

		//saida
		escreva("\nO valor de x é: ", xresult)
		escreva("\nO valor de y é: ", yresult)

		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 582; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */