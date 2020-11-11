programa
{
	
	funcao inicio()
	{
		//vetor[numero de posiçoes], unidimensional, onde x indica a posição do valor
		inteiro numero[4], x
		//inserir um valor para cada posição do vetor
		para (x=0;x<4;x++){
			escreva("Entre com um número:")
			leia(numero[x])
		}
		para (x=0;x<4;x++){
			escreva("\nValor Posição", x+1, ":", numero[x])
		}
		para (x=3;x>=0;x--){
			escreva("\nValor Posição", x+1, ":", numero[x])
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 112; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */