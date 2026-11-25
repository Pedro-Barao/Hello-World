package Exerciciop_16;

public class Tablet extends AparelhoEletronico {

	Tablet() {

		super();

	}

	Tablet(String marca, String modelo) {

		super.setMarca(marca);
		super.setModelo(modelo);

	}

	@Override
	public void Ligar(String marca, String modelo) {

		System.out.println("O tablet da marca " + marca + " e do modelo " + modelo + " ligou");
	}

}
