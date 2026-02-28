package Exercicio_3;

public class Quadrado extends FormaGenerica {

	Quadrado() {
	}

	Quadrado(double base, double altura) {

		super.setBase(base);
		super.setAltura(altura);

	}

	@Override
	public double CalcularPerimetro(double base, double altura) {

		return (base + altura) * 2;

	}

	@Override
	public double CalcularArea(double base, double altura) {

		return base * altura;

	}

}
