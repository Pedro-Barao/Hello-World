package Exerciciop_14;

public class Caminhao extends Transporte {

	Caminhao() {

		super();

	}

	Caminhao(String marca, String modelo, float velocidade, int raio_roda) {

		super.setMarca(marca);
		super.setModelo(modelo);
		super.setVelocidade(velocidade);
		super.setRaioRoda(raio_roda);

	}

	@Override
	public double VelocidadeMaxima(float raio_roda) {

		return 1500 * (2 * 3.14 * (raio_roda / 1000) * 0.06) / (0.8 * 3.5);
	}

}
