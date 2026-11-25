package Exercicio_2;

public class MainTocandoPiano {

	public static void main(String args[]) {

		Piano piano = new Piano();
		String tipo = "Cordas Percutidas";

		piano.setTipo(tipo);

		System.out.println("O piano e instrumento de: " + piano.getTipo());
		piano.Tocar();

	}

}
