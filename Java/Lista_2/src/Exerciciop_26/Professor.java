package Exerciciop_26;

public class Professor extends Trabalho {

	Professor() {

		super();

	}

	Professor(String nome, int anos_experiencia) {

		this.getNome();
		this.getAnosExperiecia();

	}

	@Override
	public void Executar(String nome, int anos_experiencia) {

		System.out
				.println("O professor " + nome + " tem " + anos_experiencia + " anos de experiencia e esta lecionando");

	}

}
