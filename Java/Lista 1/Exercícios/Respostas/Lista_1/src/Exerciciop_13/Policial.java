package Exerciciop_13;

public class Policial extends Empregado {

	Policial() {
		super();
	}

	Policial(String nome, String funcao) {

		super(nome, funcao);

	}

	@Override
	public void MostrarFuncao(String nome, String funcao) {

		System.out.println("O policial " + nome + " trabalha como POLICIAL " + funcao);

	}
}
