package Exercicio_6;

public class MainCachorroSom {

	public static void main(String args[]) {

		Cachorro cachorro = new Cachorro("Pablo", 3);

		System.out.println("O cachorro " + cachorro.getNome() + " tem " + cachorro.getIdade() + " ano(s)");
		cachorro.FazerSom();

	}

}
