package Exerciciop_26;

public class Engenheiro extends Trabalho {

	Engenheiro() {

		super();

	}

	Engenheiro(String nome, int anos_experiencia) {

		this.getNome();
		this.getAnosExperiecia();

	}

	@Override
	public void Executar(String nome, int anos_experiencia) {

		System.out.println(
				"O engenheiro " + nome + " tem " + anos_experiencia + " anos de experiencia e esta calculanda");

	}

}
