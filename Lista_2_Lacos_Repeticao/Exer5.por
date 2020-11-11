programa
{
	//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
	//Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (Enquanto)

	funcao inicio()
	{
		//declaração de variaveis
		inteiro idade, jovem=0, idoso=0, adulto=0
		//primeira entrada do prog
		escreva("Olá usuario, digite uma idade: ")
		leia(idade)
		//condicional inicial
		se (idade<=21) {
			jovem++
		}
		senao se (idade>=50){
			idoso++
		}
		senao {
			adulto++
		}
			//Laço com entrada!
			enquanto (idade<99) {
				escreva("\nDigite uma idade: ")
				leia(idade)
			//repete a condicional inicial 	
			se (idade<=21) {
				jovem++
			}
				senao se (idade>=50){
					idoso++
				}
					senao {
						adulto++
					}	
		}
		//saída final
			escreva("\nTotal de pessoas com menos de 21 anos: ", jovem)
			escreva("\nTotal de pessoas com mais de 50 anos: ", idoso)
			escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 838; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */