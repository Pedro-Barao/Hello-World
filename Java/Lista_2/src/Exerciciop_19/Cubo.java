package Exerciciop_19;

public class Cubo extends Forma3D {

	Cubo() {

		super();

	}

	Cubo(float altura, float largura, float comprimento) {

		super.setAltura(altura);
		super.setLargura(largura);
		super.setComprimento(comprimento);

	}

	@Override
	public double CalcularVolume(float altura, float largura, float comprimento) {

		double volume = altura * largura * comprimento;

		return volume;

	}

}
