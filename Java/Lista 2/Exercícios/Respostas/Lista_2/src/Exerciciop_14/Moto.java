package Exerciciop_14;

public class Moto extends Transporte {

	Moto() {

		super();

	}

	Moto(String marca, String modelo, float velocidade, int raio_roda) {

		super.setMarca(marca);
		super.setModelo(modelo);
		super.setVelocidade(velocidade);
		super.setRaioRoda(raio_roda);

	}

	@Override
	public double VelocidadeMaxima(float raio_roda) {

		return 10000 * (2 * 3.14 * (raio_roda / 1000)) / (60 * 1 * 3);
	}

}
