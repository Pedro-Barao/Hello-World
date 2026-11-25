package Exerciciop_19;

public class CarroManual extends Carro {

	CarroManual() {

		super();

	}

	CarroManual(String marca, String modelo, float limite_tanque) {

		super(marca, modelo, limite_tanque);

	}

	@Override
	public void Abastecer() {

		System.out.println("Abastecendo o carro manual");

	}

}
