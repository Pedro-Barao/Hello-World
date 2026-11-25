package Exercicio_2;

public class Piano extends InstrumentoMusical {

	Piano() {
	}

	Piano(String tipo) {

		super.setTipo(tipo);

	}

	@Override
	public void Tocar() {

		System.out.println("Tocando Piano");

	}

}
