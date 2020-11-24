package aulaCollection;
//importar as bibliotecas!!!
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;

public class Colecoes {
	public static void main(String[] args) {
		//declaração da collection
		Collection<String> nomes = new ArrayList(); 
		//adição dos nomes na lista
		nomes.add("Mario");
		nomes.add("Maria");
		nomes.add("Juliana");
		nomes.add("Rafael");
		
		for(String name : nomes) {
			System.out.println("Lista de nomes: "+name);//mostra nome por nome da lista
		}
		
		Collection<String> nomes2 = Arrays.asList("João", "Joana");
		nomes.addAll(nomes2);// adiciona nomes a lista ja criada
		System.out.println("Lista de nomes: "+nomes);
		
		//System.out.println("Contem o nome Maria?"+nomes.contains("Maria")); //para verificar conteudo
		//System.out.println("Lista: "+nomes);
		/*System.out.println("Lista de nomes: "+nomes);
		 * 
		 * 
		nomes.clear(); //comando para limpar
		System.out.println("Lista de nomes: "+nomes);*/
		
		/*System.out.println("Lista de nomes: "+nomes);
		nomes.remove("Mario"); //comando para remover
		System.out.println("Lista de nomes: "+nomes);*/
		
		//verifica se tem um campo vazio na lista
		/* if(nomes.isEmpty()) {
			System.out.println("Lista vazia...");
		}
		else {
			//mostra a collection
			System.out.println("Lista de nomes: "+nomes);
		}
		
		
		System.out.println("Lista de nomes: "+nomes); */
	}

}
