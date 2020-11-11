programa
{
	//2)Um dado é lançado 10 vezes e o valor correspondente é anotado. 
	//Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
	//A seguir determine e imprima a média aritmética dos lançamentos, 
	//contabilize e apresente também quantas foram as ocorrências da maior pontuação.

	funcao inicio()
	{
		//variaveis, lembrando q os valores do dado podem ser 1,2,3,4,5 e 6
		inteiro dado[10], posicao, soma=dado[0], xseis=0
		real media=0.0

		 //entrada de valores para o vetor
		 para (posicao=0;posicao<10;posicao++){
		 	escreva("\nDigite o valor do dado: ")
		 	leia(dado[posicao])
		 }
		 //calculo da média dos valores digitados
		 para(posicao=0;posicao<10;posicao++){
		 	soma = soma+dado[posicao]
		 	media = soma/10
		 }
		 //saída da média
		 escreva("\nA média aritmética dos lançamentos é de: ", media)

		 //contabilização das ocorrencias de maior pontuação (quantas vezes o número 6 aparece)
		 para(posicao=0;posicao<10;posicao++){
		 	se (dado[posicao] == 6){
		 		xseis++
		 	}
		 }
		 //saida das vezes que o 6 aparece
		 escreva("\nO maior número (6) aparece num total de: ", xseis, " vezes.")
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 16; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */