package Exerciciop_20;

public class Notebook extends Computador {

	Notebook() {

		super();

	}

	Notebook(String marca, String modelo, String funcao) {

		super.setMarca(marca);
		super.setModelo(modelo);
		super.setFuncao(funcao);

	}

	@Override
	public void Processar(String funcao) {

		System.out.println("Processou e executou a funcao: " + funcao);

	}

}
