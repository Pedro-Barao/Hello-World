package Exercicio_2;

public class Guitarra extends InstrumentoMusical {

	Guitarra() {
	}

	Guitarra(String tipo) {

		super.setTipo(tipo);

	}

	@Override
	public void Tocar() {

		System.out.println("Tocando Guitarra");

	}

}
