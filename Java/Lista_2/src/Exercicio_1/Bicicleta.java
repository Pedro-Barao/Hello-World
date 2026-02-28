package Exercicio_1;

public class Bicicleta extends Veiculo {

	private float metro_rodado;

	Bicicleta() {
	}

	Bicicleta(String marca, String modelo, int quantidade_rodas) {

		super.setMarca(marca);
		super.setModelo(modelo);
		super.setQuantidadeRodas(quantidade_rodas);

	}

	public float getMetroRodado() {

		return this.metro_rodado;

	}

	public void setMetroRodado(float metro_rodado) {

		this.metro_rodado = metro_rodado;

	}

	@Override
	public float Mover(float metro_rodado, float metros) {

		return metro_rodado + metros;

	}

}
