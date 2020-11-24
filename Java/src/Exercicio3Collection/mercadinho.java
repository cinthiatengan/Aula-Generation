package Exercicio3Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class mercadinho {
	public static void main(String[] args) {
			//declaração da collection
			Collection<String> produto = new ArrayList(); 
			//adição dos nomes na lista
			produto.add("Arroz");
			produto.add("Feijão");
			produto.add("Fubá");
			produto.add("Açucar");
			
			System.out.println("Estoque do Mercadinho");
			System.out.println("*\n*\n*\n");
			
			//apresentar todos os dados
			System.out.println("Lista de produtos: "+produto);
			System.out.println();
			
			//remove produto
			produto.remove("Arroz");
			System.out.println("Lista após produto removido: "+produto);
			System.out.println();
					
			//atualizar produtos da list
			Collection <String> atualizarProduto = Arrays.asList("Leite","Nescau");
			produto.addAll(atualizarProduto);
			System.out.println("Lista atualizada: "+produto);
			System.out.println();		
		}
}