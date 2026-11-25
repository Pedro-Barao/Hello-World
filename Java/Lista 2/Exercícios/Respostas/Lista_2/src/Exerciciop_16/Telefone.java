package Exerciciop_16;

public class Telefone extends AparelhoEletronico {

	Telefone() {

		super();

	}

	Telefone(String marca, String modelo) {

		super.setMarca(marca);
		super.setModelo(modelo);

	}

	@Override
	public void Ligar(String marca, String modelo) {

		System.out.println("O telefone da marca " + marca + " e do modelo " + modelo + " ligou");
	}

}
