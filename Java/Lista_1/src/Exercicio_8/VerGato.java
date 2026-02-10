package Exercicio_8;

public class VerGato extends Gato {

	public static void main(String args[]) {

		Animal gato = new Gato("Mimi", 10);
		Gato g = new Gato();

		System.out.println("O gato " + gato.nome + " tem " + gato.idade + " de idade");
		System.out.print("E esta ");
		g.Miar();

	}
}
