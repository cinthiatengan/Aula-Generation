package vetoresMatrizesJava;

public class TesteCarro {
	public static void main(String args[]) {
		//novo objeto
		Carro meuCarro = new Carro();
		//atributos do meu objeto
		meuCarro.cor="Vermelho";
		meuCarro.modelo="Passat";
		meuCarro.velocidadeAtual=0;
		meuCarro.velocidadeMaxima=80;
		
		//metodos
		meuCarro.liga();
		
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
		meuCarro.pegaMarcha();
	}
}
