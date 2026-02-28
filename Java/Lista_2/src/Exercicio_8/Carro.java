package Exercicio_8;

public class Carro extends Veiculo {

	private float quilometro_rodado;

	Carro() {
	}

	Carro(String marca, String modelo, String cor) {

		super.setMarca(marca);
		super.setModelo(modelo);
		super.setCor(cor);

	}

}
