package calculatorJava;

public class escolha {
	//attributes
	private int option;
	//getters and setters
	public int getOption() {
		return option;
	}

	public void setOption(int option) {
		this.option = option;
	}
	//method
	public String retorno() {
		return "1- Somar dois números || 2- Subtrair dois números || 3- Multiplicar dois números \n"
		+"4- Dividir dois números || 5- Potência de dois números || 6- Raiz enésima (número e fator) \n"
		+"7- % de dois números || 8- Inversão de sinal || -99 -> Para sair \n"; 
	}

}
