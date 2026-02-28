package Exercicio_1;

public class Carro extends Veiculo {

	private float quilometro_rodado;

	Carro() {
	}

	Carro(String marca, String modelo, int quantidade_rodas) {

		super.setMarca(marca);
		super.setModelo(modelo);
		super.setQuantidadeRodas(quantidade_rodas);

	}

	public float getQuilometroRodado() {

		return this.quilometro_rodado;

	}

	public void setQuilometroRodado(float quilometro_rodado) {

		this.quilometro_rodado = quilometro_rodado;

	}

	@Override
	public float Mover(float quilometro_rodado, float metros) {

		return quilometro_rodado + metros;

	}

}
