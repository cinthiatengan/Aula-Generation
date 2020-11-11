programa
{
	//1) Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e 
	//o escreva em seguida. Encontre após a maior pontuação e a apresente.
	funcao inicio()
	{
		//declaração de variaveis 
		inteiro vet[5], x, maior=vet[0]

		//laço para percorrer o vetor
		para (x=0;x<5;x++){
			escreva("\nEntre com um valor: ")
			leia(vet[x])
			escreva("\nValor Posição ", x+1, ": ", vet[x], "\n")
		
		}
		para (x=0; x<5; x++){
			se (vet[x]>maior){
				maior=vet[x]
			}
		}
		escreva("\nMaior valor inserido: ", maior)
		
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