programa
{
	//Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (Para)

	funcao inicio()
	{
		//Declaração de variaveis
		inteiro resto
		//Laço para (for) com (inicio;condição lógica;incremento)
		para (inteiro cont = 1000; cont < 2000; cont++){
			resto = cont % 11
			//condição para parar o laço
			se (resto ==5) {
				escreva("\n", cont)
			}
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 337; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */