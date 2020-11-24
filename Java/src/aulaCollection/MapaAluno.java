package aulaCollection;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

//map ja tem seus proprios metodos
//mapea a chave para os valores, chave nome, valor objeto
public class MapaAluno {
	public static void main(String[] args) {
		//primeiro a chave, segundo o valor q vai puxar
	Map<String, Aluno> mapa = new TreeMap<String, Aluno>();
	
	Aluno a = new Aluno("Cinthia Tengan", "Java", 6.8);
	Aluno b = new Aluno("Camila Lopes", "Fortran", 9.9);
	Aluno c = new Aluno("Nathalya Ito", "Python", 9.0);
	Aluno d = new Aluno("Pedro Chibane", "Python", 8.9);
	
	mapa.put("Cinthia Tengan",a);
	mapa.put("Camila Lopes",b);
	mapa.put("Nathalya Ito",c);
	mapa.put("Pedro Chibane",d);
	
	System.out.println(mapa);
	System.out.println(mapa.get("Cinthia Tengan"));
	
	Collection<Aluno> alunos = mapa.values();
	//for each para percorrer todos os valores do aluno
	for(Aluno e: alunos) {
		System.out.println(e);
	}
	
	}
}
