programa
{
//4)Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
//e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
//ou seja, diagonal principal.

	funcao inicio()
	{
		//declaração de variaveis
		inteiro matriz[3][3], a=0, b=0, c=0, coluna, linha, soma=0

		//entrada dos valores da matriz 3x3
		para(linha=0; linha<3;linha++){
			para(coluna=0; coluna<3;coluna++){
				escreva("\nDigite um valor para matriz: ")
				leia(matriz[linha][coluna])
				limpa()
			}
		}
		//saida da matriz digitada pelo usuario
		escreva("\nSua matriz 3x3 é: ", "\n")
		para(linha=0;linha<3;linha++){
			para(coluna=0;coluna<3;coluna++){
				escreva("[",matriz[linha][coluna], "]")
			}
		escreva("\n")
		}
		//armazenando o primeiro valor da diagonal
		para(linha=0;linha<1;linha++){
			para(coluna=0;coluna<1;coluna++){
				a=matriz[linha][coluna]
			}
		}
		//armazenando o segundo valor da diagonal
		para(linha=0;linha<2;linha++){
			para(coluna=0;coluna<2;coluna++){
				b=matriz[linha][coluna]
			}
		}
		//armazenando o terceiro valor da diagonal
		para(linha=0;linha<3;linha++){
			para(coluna=0;coluna<3;coluna++){
				c=matriz[linha][coluna]
			}
		}
		//realizando a soma da diagonal
		escreva("\nO valor de (0.0) é: ", a)
		escreva("\nO valor de (1.2) é: ", b)
		escreva("\nO valor de (2.3) é: ", c)
		soma = a+b+c
		escreva("\nO valor da soma da diagonal é: ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 324; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */