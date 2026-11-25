package Exercicio_3;

public class Circulo extends FormaGenerica {

	Circulo() {
	}

	Circulo(float base, float altura) {

		super.setBase(base);
		super.setAltura(altura);

	}

	@Override
	public double CalcularPerimetro(double base, double altura) {

		return 2 * altura * base;

	}

	@Override
	public double CalcularArea(double base, double altura) {

		return altura * (base * base);

	}

}
