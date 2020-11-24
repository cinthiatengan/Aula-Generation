package aulaCollection;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {
	public static void main(String[] args) {
		//hashset
		Set<Aluno> conjunto = new HashSet<Aluno>();
		//instanciar alunos para testar
		Aluno a = new Aluno("Cinthia Tengan", "Java", 6.8);
		Aluno b = new Aluno("Camila Lopes", "Fortran", 9.9);
		Aluno c = new Aluno("Nathalya Ito", "Python", 9.0);
		Aluno d = new Aluno("Pedro Chibane", "Python", 8.9);
		//adicionando ao conjunto
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		//saida
		System.out.println(conjunto);
		
	}

}
