programa
{
	//Faça um programa que pegue um número do teclado e calcule a soma de todos os números  de 1 até ele. 
	//Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28. (Faça... Enquanto)
	funcao inicio()
	{
		//declaração de variaveis
		inteiro num, soma=0
		//entrada
		escreva("Olá digite um número que deseja saber a soma de seus fatores: ")
		leia(num)

		//laço faça/enquanto
		faca {
			soma+=num
			num--
		}
			enquanto(num!=0) {
				//saida
		escreva("\nA soma de todos os fatores é:", soma)	
			}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 436; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */