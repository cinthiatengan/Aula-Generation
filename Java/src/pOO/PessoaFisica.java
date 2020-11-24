package pOO;

public class PessoaFisica extends Pessoa1 {
	private long cpf;4

	public PessoaFisica() {
		
	}
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public String getNome()
	{
		return "pessoa fisica:"+super.getNome()+ " -CPF: "+this.getCpf();
		
	}

}
