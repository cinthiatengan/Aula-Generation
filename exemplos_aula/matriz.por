programa
{
	
	funcao inicio()
	{
		//const é uma constante cujo valor nao vai ser alterado
		const inteiro TAMANHO =3
		//matriz 
		inteiro mat[TAMANHO][2], l, c
		//linha
		para(l=0; l<TAMANHO;l++){
			//outro para dentro para ser a coluna
			para(c=0; c<2;c++){
				//inserir os valores para dentro das posições da matriz
				escreva("Valor:")
				leia(mat[l][c])
			}
		}
		limpa()
		para(l=0; l<TAMANHO;l++){
			
			para(c=0; c<2;c++){
				escreva("[ ", mat[l][c], " ]")
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 130; 
 * @PONTOS-DE-PARADA = 16, 19, 7, 23, 9, 25, 15;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */