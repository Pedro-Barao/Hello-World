package Exerciciop_23;

public class SmartTV extends Dispositivo {

	SmartTV() {

		super();

	}

	SmartTV(String marca, String modelo) {

		super.setMarca(marca);
		super.setModelo(modelo);

	}

	@Override
	public void ConectarInternet(String marca, String modelo) {

		System.out
				.println("A Televisao Smart de marca " + marca + " e do modelo " + modelo + " conectou com a internet");

	}

}
