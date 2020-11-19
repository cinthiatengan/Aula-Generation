package vetoresMatrizesJava;
//classe com varios metodos com diferentes parametros
public class MetodoSobrecarregado {
	public void testaMetodosSobrecarregados() {
		System.out.printf("salario em numero inteiro: %d \n", salario(1000));
		System.out.printf("salario em numero double: %f \n", salario(7.500));
	}
	public int salario (int valorInt) {
		System.out.printf("salario com argumento inteiro: %d \n", valorInt);
		return valorInt*valorInt;
	}
	public double salario(double valorDouble) {
		System.out.printf("salario com argumento double: %f \n", valorDouble);
		return valorDouble*valorDouble;
	}
}
