package Exercicio2Collection;

public class main {
public static void main(String[] args) {
		
		cavalo cavalo = new cavalo("Pocot�", 9, "Iririririn", "corre");
		cachorro cachorro = new cachorro("Tobi", 4, "auauau","corre");
		preguica preguica = new preguica("Evandra", 7, "zZzZzZzZ", "sobe em �rvores");
		
		System.out.println(cavalo.Animal());
		System.out.println(cachorro.Animal());
		System.out.println(preguica.Animal());
	}
}