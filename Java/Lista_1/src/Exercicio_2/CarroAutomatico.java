package Exercicio_2;

public class CarroAutomatico extends Carro {

	public static void main(String args[]) {

		Carro carro = new Carro();
		String marca_2, modelo_2;
		int ano_2;

		marca_2 = "Renault";
		modelo_2 = "Logan";
		ano_2 = 2010;

		carro.ExibirDados(marca_2, modelo_2, ano_2);

	}

}
