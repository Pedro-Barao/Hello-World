package Exerciciop_15;

public class Gato extends Animal {

	Gato() {
		super();
	}

	Gato(String nome) {
		super(nome);
	}

	@Override
	public void FazerSom() {

		System.out.println("Miando");

	}

}
