programa
{
	
	funcao inicio()
	{
		//variaveis
		real C, N, E=0.0, salarioN=0.0, salarioTotal
		//entrada do usuario
		escreva("Olá usuário, digite seu código: ")
		leia(C)
		escreva("Agora entre com o número de horas de trabalho realizados: ")
		leia(N)
			//condicional
			se (N<=5){
				//calculo do valor da hora de trabalho normal (RS10.00)
				salarioN = N*10
				escreva("Você receberá: ", salarioN, " ", "por hora trabalhada")
			}
				senao se(N>5){
					//para evitar calcular o valor ja existente de N;
					N = N-5
					//calculo do valor da hora extra (RS20.00)
					E = N*20
					//calculo do salario total
					salarioTotal = E+salarioN
					//saida com hora de trabalho extra
					escreva("Você receberá um sálario total de: ", salarioN)
					escreva("\nCom o valor de: ", E," ", "por hora extra trabalhada") 
				}
					senao {
						//saida sem hora de trabalho extra
						escreva("Voce receberá um total de: ", salarioN)
					}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 554; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */