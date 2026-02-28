package Exerciciop_20;

public class Desktop extends Computador {

	Desktop() {

		super();

	}

	Desktop(String marca, String modelo, String funcao) {

		super.setMarca(marca);
		super.setModelo(modelo);
		super.setFuncao(funcao);

	}

	@Override
	public void Processar(String funcao) {

		System.out.println("Processou e executou a funcao: " + funcao);

	}

}
