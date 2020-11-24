package pOO;

public class testePessoa {
	public static void main(String[] args) {
		{
			Pessoa jessica = new Pessoa("Jessica", 555);
			funcionario1 pedro = new funcionario1("Pedro", 333, "TI");
			Pessoa maria = new funcionario1("Maria", 222, "vendas");
			Pessoa jose = new Coordenador("Jose", 444, "CC");
			
			System.out.println(jessica.getMatricula());
			System.out.println(pedro.getDepartamento());
			
		}
	}
}
