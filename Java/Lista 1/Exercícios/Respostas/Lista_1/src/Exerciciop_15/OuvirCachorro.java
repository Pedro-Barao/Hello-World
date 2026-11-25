package Exerciciop_15;

public class OuvirCachorro extends Cachorro {

	public static void main(String args[]) {

		Cachorro cachorro = new Cachorro("Argus");

		System.out.print(cachorro.getNome() + " esta ");
		cachorro.FazerSom();

	}

}
