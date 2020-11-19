package vetoresMatrizesJava;
//Aula do professor Luis sobre vetores e matrizes 1
import java.util.Scanner;
public class ExemploAulaVetor {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] arrayUm = {12, 3, 5, 68, 9, 73, 44, 456, 65, 321};
		int[] arrayDois = {43, 42, 4, 8, 55, 21, 2, 45};
		
		float[] nota = new float[5];
		
		//tamanho do array com lenght
		if (arrayDois.length>8) {
			System.out.println("Tamano do ArrayDois- mario que 8!");	
		}
		else {
			System.out.println("Tamano do ArrayDois-menor que 8!");
		}
		System.out.println("\nTamanho do ArrayUm = "+arrayUm.length);
		
		//utilização do for each(varre todo o vetor ate a ultima posição, sem contador)
		String[] cars = {"Volvo", "", "Ford", "Mazda"};
		
		for (String i : cars) {
			System.out.println(i);
		}
		//populando um array (primeira posição 0)
		for(int i=0; i<5;i++) {
			System.out.println("Entre com uma nota: ");
			nota[i] = entrada.nextFloat();
		}
		//apresentando um array
		for(int i=0;i<5;i++) {
			System.out.println("Nota "+i+1+"="+nota[i]);
		}
	}

}
