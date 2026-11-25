package Exercicio_5;

public class Gato extends Animal {

	Gato() {
		super();
	}

	Gato(String nome, int idade) {

		super.setNome(nome);
		super.setIdade(idade);

	}

	@Override
	public void FazerSom() {

		System.out.println("Miau miau");

	}

}
