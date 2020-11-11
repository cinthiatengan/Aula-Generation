programa
{
	//Desenvolva um sistema em que:
	//Leia 4 (quatro) números;
	//Calcule o quadrado de cada um;
	//Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
	//Caso contrário, imprima os valores lidos e seus respectivos quadrados.

	funcao inicio()
	{
		//variaveis
		inteiro a, b, c, d
		
		//entrada
		escreva("Digite o primeiro número: ")
		leia(a)
		escreva("\nDigite o segundo número: ")
		leia(b)
		escreva("\nDigite o terceiro número: ")
		leia(c)
		escreva("\nDigite o quarto número: ")
		leia(d)
		
			//laço 
			faca {
				//calculo do quadrado
				a = a*a
				b = b*b
			 	c = c*c
			 	d = d*d
				//saida se a condição não for aceita
			 	escreva("\nQuadrado do primeiro número é igual a: ", a)
				escreva("\nQuadrado do segundo número é igual a: ", b)
				escreva("\nQuadrado do terceiro número é igual a: ", c)
				escreva("\nQuadrado do quarto número é igual a: ", d)
				escreva("\n")
				//condição 
					se (c>=1000){
					escreva("\nO quadrado do terceiro número é igual a: ", c)
					escreva("\nFIM")
					
				}
			}	
				//repete o processo até que c seja maior que 1000
				enquanto (c<1000){
					
				}
			
		}
			
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 956; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */