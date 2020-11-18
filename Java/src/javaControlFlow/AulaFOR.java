package javaControlFlow;
//exemplo da video aula do professor Luis sobre o laço FOR
public class AulaFOR {
	public static void main(String[] args) {
		int x, soma=0;
		//inicio;fim;cond
		for(x=1; x<=10; x++) {
			System.out.printf("\n %d",x);
			soma = soma+x;
		}
		System.out.printf("\nSoma total: %d", soma);
	}
}
