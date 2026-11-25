package Exerciciop_15;

public class Word extends Documento {

	Word() {

		super();

	}

	Word(String nome, float tamanho) {

		super.setNome(nome);
		super.setTamanho(tamanho);

	}

	@Override
	public void Imprimir(String nome, float tamanho) {

		System.out.println("Foi impresso um documento " + nome + ".word de tamanho " + tamanho + " mb");

	}

}
