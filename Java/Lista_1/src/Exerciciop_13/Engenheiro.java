package Exerciciop_13;

public class Engenheiro extends Empregado {

	Engenheiro() {
		super();
	}

	Engenheiro(String nome, String funcao) {

		super(nome, funcao);

	}

	@Override
	public void MostrarFuncao(String nome, String funcao) {

		System.out.println("O empregado " + nome + " trabalha como ENGENHEIRO DE " + funcao);

	}

}
