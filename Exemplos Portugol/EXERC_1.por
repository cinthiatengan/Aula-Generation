programa
{
	
	funcao inicio()
	{
		//variaveis
		real N, E=0.0, salarioN=0.0, salarioTotal
		cadeia C
		//entrada do usuario
		escreva("Olá usuário, por favor digite seu nome: ")
		leia(C)
		escreva("Agora entre com o número de horas de trabalho realizados: ")
		leia(N)

		se (N>50){
			salarioN = 500.0
			//para evitar calcular o valor ja existente de N;
			N = N-50
			//calculo do valor da hora extra (RS20.00)
			E = N*20
			//calculo do valor do salario total
			salarioTotal=E+salarioN
			//saida com valor da hora extra
			escreva("\nOlá ", C, ", ", "Você receberá R$ ", E," ", "por hora extra trabalhada")
			escreva("\nEm um total de R$ ",salarioTotal ) 
		 }
		 senao {
		 	//calculo do valor da hora de trabalho normal (RS10.00)
				salarioN = N*10
				escreva("\nOlá ", C, " ", "você receberá um total de: ", salarioN, " ", "por hora trabalhada")
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 174; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */