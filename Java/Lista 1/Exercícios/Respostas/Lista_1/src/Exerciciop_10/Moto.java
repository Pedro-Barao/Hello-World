package Exerciciop_10;

public class Moto extends Veiculo {

	private int cilindrada;

	public Moto() {

		super();

	}

	public Moto(String marca, String modelo, int velocidade_maxima, int cilindrada) {

		super(marca, modelo, velocidade_maxima);
		this.cilindrada = cilindrada;

	}

	public int getCilindrada() {

		return this.cilindrada;

	}

	public void setCilindrada(int cilindrada) {

		this.cilindrada = cilindrada;

	}

	public void MostrarDados(String marca, String modelo, int velocidade_maxima, int cilindradas) {

		System.out.println("A marca da moto e: " + marca);
		System.out.println("O modelo da moto e: " + modelo);
		System.out.println("A velocidade maxima da moto e: " + velocidade_maxima + " km");
		System.out.println("As cilindradas da moto sao: " + cilindradas + " cc");

	}

}
