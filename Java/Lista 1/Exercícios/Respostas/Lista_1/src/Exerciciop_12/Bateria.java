package Exerciciop_12;

public class Bateria extends InstrumentoMusical {

	Bateria() {
		super();
	}

	Bateria(String tipo) {

		super(tipo);
	}

	@Override
	public void Tocar() {
		System.out.println("Batucando");
	}

}
