package Exerciciop_15;

public class PDF extends Documento {

	PDF() {

		super();

	}

	PDF(String nome, float tamanho) {

		super.setNome(nome);
		super.setTamanho(tamanho);

	}

	@Override
	public void Imprimir(String nome, float tamanho) {

		System.out.println("Foi impresso um documento " + nome + ".pdf de tamanho " + tamanho + " mb");

	}

}
