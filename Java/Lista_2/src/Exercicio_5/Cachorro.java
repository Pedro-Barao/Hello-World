package Exercicio_5;

public class Cachorro extends Animal {

	Cachorro() {
		super();
	}

	Cachorro(String nome, int idade) {

		super.setNome(nome);
		super.setIdade(idade);

	}

	@Override
	public void FazerSom() {

		System.out.println("Au au");

	}

}
