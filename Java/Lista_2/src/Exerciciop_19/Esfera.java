package Exerciciop_19;

public class Esfera extends Forma3D {

	Esfera() {

		super();

	}

	Esfera(float altura, float largura, float comprimento) {

		super.setAltura(altura);
		super.setLargura(largura);
		super.setComprimento(comprimento);

	}

	@Override
	public double CalcularVolume(float altura, float largura, float comprimento) {

		double volume = (4.0 / 3.0) * 3.14 * (largura * largura * largura);

		return volume;

	}

}
