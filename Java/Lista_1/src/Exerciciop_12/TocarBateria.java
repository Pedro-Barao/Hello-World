package Exerciciop_12;

public class TocarBateria extends Bateria {

	public static void main(String args[]) {

		Bateria bateria = new Bateria("Percussao");

		System.out.println("A bateria e um instrumento de: " + bateria.getTipo());

		bateria.Tocar();

	}
}
