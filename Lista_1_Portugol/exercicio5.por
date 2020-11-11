programa
{
	//variaveis
	real nota1, nota2, nota3, mediapond, p1, p2, p3, ptotal
	funcao inicio()
	{
		//entrada
		escreva("Olá aluno, vamos calcular a média ponderada das suas notas?\nvamos la, siga as instruções a seguir")
		escreva("\nOs pesos das notas são 2, 3 e 5")
		p1 = 2
		p2 = 3
		p3 = 5
		ptotal = 10
		escreva("\nDigite sua nota de peso 2: ")
		leia(nota1)
		escreva("\nDigite sua nota de peso 3: ")
		leia(nota2)
		escreva("\nDigite sua nota de peso 5: ")
		leia(nota3)
		//calculo
		mediapond = (p1*nota1+p2*nota2+p3*nota3)/ptotal
		//saida
		escreva("\nPelas notas fornecidas e de acordo com os seus respectivos pesos, sua média ponderada é de: ", mediapond)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 379; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */