programa
{	
//3)Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
	 //declaração de variaveis
	 inteiro n1[4][6], n2[4][6], linha, coluna, M1[4][6], M2[4][6]
		//entrada para matriz n1
	 	para(linha=0;linha<4;linha++){
	 		para(coluna=0;coluna<6;coluna++){
	 			escreva("\nDigite um valor para matriz n1: ")
	 			leia(n1[linha][coluna])
	 			limpa()
	 		}
	 	}
	 	//entrada para matriz n2
	 	para(linha=0;linha<4;linha++){
	 		para(coluna=0;coluna<6;coluna++){
	 			escreva("\nDigite um valor para matriz n2: ")
	 			leia(n2[linha][coluna])
	 			limpa()
	 		}
	 	}
	 	//Saída da matriz n1 
	 	escreva("\nMatriz n1: ", "\n")
	 	para(linha=0;linha<4;linha++){
	 		para(coluna=0;coluna<6;coluna++){
	 			escreva("[", n1[linha][coluna], "]")
	 		}
	 	escreva("\n")
	 	}
	 	//Saída da matriz n2
	 	escreva("\nMatriz Soma n2: ", "\n")
	 	para(linha=0;linha<4;linha++){
	 		para(coluna=0;coluna<6;coluna++){
	 			escreva("[", n2[linha][coluna], "]")
	 		}
	 	escreva("\n")
	 	}
	 	//soma e subtração dos elementos de n1 e n2
	 	para(linha=0;linha<4;linha++){
	 		para(coluna=0;coluna<6;coluna++){
	 			M1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna]
	 			M2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna]
	 			M2[linha][coluna] = mat.valor_absoluto(M2[linha][coluna])
	 		}
	 	}
	 	//Saída das matrizes soma (M1) e subtração (M2)
	 	escreva("\nMatriz Soma (M1): ", "\n")
	 	para(linha=0;linha<4;linha++){
	 		para(coluna=0;coluna<6;coluna++){
	 			escreva("[", M1[linha][coluna], "]")
	 		}
	 	escreva("\n")
	 	}
	 	//Saída das matrizes soma (M1) e subtração (M2)
	 	escreva("\nMatriz Subtração (M2): ", "\n")
	 	para(linha=0;linha<4;linha++){
	 				para(coluna=0;coluna<6;coluna++){
	 					escreva("[", M2[linha][coluna], "]")
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
 * @POSICAO-CURSOR = 1546; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */