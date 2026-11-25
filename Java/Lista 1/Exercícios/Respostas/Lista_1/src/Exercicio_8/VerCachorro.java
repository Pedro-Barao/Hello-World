package Exercicio_8;

public class VerCachorro extends Cachorro {

	public static void main(String args[]) {

		Animal cachorro = new Cachorro("Rex", 5);
		Cachorro c = new Cachorro();

		System.out.println("O cachorro " + cachorro.getNome() + " tem " + cachorro.getIdade() + " de idade");
		System.out.print("E esta ");
		c.Latir();

	}
}
