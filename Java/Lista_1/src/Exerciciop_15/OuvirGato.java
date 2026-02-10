package Exerciciop_15;

public class OuvirGato extends Gato {

	public static void main(String args[]) {

		Gato gato = new Gato("Linux");

		System.out.print(gato.getNome() + " esta ");
		gato.FazerSom();

	}

}
