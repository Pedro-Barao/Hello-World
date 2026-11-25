package Exercicio_2;

public class MainTocandoGuitarra {

	public static void main(String args[]) {

		Guitarra guitarra = new Guitarra();
		String tipo = "Corda";

		guitarra.setTipo(tipo);

		System.out.println("O guitarra e instrumento de: " + guitarra.getTipo());
		guitarra.Tocar();

	}

}
