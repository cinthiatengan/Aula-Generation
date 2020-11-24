package pOO;

public class TestePolimorfismo {
	public static void main(String[] args) {
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("Julianna");
		fisica.setCpf(12345678L);
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("Chris");
		juridica.setCnpj(10001563625654L);
		
		Pessoa1[] pessoas = new Pessoa1[2];
		pessoas[0] = fisica;
		pessoas[1] = juridica;
		
		for(Pessoa1 pessoa:pessoas)
		{
			System.out.println(pessoa.getNome());
		}
	}

}
