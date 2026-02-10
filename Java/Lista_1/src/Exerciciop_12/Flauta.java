package Exerciciop_12;

public class Flauta extends InstrumentoMusical {

	Flauta() {
		super();
	}

	Flauta(String tipo) {

		super(tipo);
	}

	@Override
	public void Tocar() {
		System.out.println("Flauteando");
	}

}
