package Exerciciop_12;

public class TocarFlauta extends Flauta {

	public static void main(String args[]) {

		Flauta flauta = new Flauta("Sopro");

		System.out.println("A flauta e um instrumento de: " + flauta.getTipo());

		flauta.Tocar();

	}

}
