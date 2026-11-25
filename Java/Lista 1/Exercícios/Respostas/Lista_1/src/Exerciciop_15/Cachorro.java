package Exerciciop_15;

public class Cachorro extends Animal {

	Cachorro() {
		super();
	}

	Cachorro(String nome) {
		super(nome);
	}

	@Override
	public void FazerSom() {

		System.out.println("Latindo");

	}

}
