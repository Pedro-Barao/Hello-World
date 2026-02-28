package Exercicio_6;

public class Cachorro extends Animal {

	Cachorro(String nome, int idade) {

		super(nome, idade);

	}

	@Override
	public void FazerSom() {

		System.out.println("Au au");

	}

}
