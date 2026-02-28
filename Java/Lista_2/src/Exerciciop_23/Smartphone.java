package Exerciciop_23;

public class Smartphone extends Dispositivo {

	Smartphone() {

		super();

	}

	Smartphone(String marca, String modelo) {

		super.setMarca(marca);
		super.setModelo(modelo);

	}

	@Override
	public void ConectarInternet(String marca, String modelo) {

		System.out.println("O Smartphone de marca " + marca + " e do modelo " + modelo + " conectou com a internet");

	}

}
