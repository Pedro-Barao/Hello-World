package Exerciciop_17;

public class Prato extends Restaurante {

	Prato() {

		super();

	}

	Prato(String nome_prato, String mesa) {

		super.setNomePrato(nome_prato);
		super.setMesa(getMesa());

	}

	@Override
	public void Comida(String nome_prato, int mesa) {

		System.out.println("O prato " + nome_prato + " foi servido na mesa de numero " + mesa);
	}

}
