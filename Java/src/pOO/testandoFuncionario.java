package pOO;

public class testandoFuncionario {
	public static void main(String[] args) {
		funcionario func = new funcionario();
		func.setNome("Cinthia");
		func.setSalario(5000);
		
		System.out.println(func.getNome());
		System.out.println(func.getSalario());
	}

}
