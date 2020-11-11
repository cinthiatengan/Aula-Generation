programa
{
	//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (Para)
	funcao inicio()
	{
		//Declaração de variáveis
		inteiro numero, resto, impar=0, par=0
		
		//entradas dentro do for (para)
		para (inteiro cont=1; cont<=10; cont++){
			escreva("Digite um número: ")
			leia(numero)
			resto = numero%2
			//teste de condição
				se (resto == 0){
					par++
				}
				senao {
					impar++
				}
		}
		//saida apos o laço 
		escreva("\nTotal de números pares: ", par, "\nTotal de números impares: ", impar)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 168; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */