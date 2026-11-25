/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Associação de Objetos: Crie uma classe Dono que possui um Carro. Instancie um objeto e
			relacione-o com um carro.

 */

package Exercicio_5;

public class Carro {

	private String marca;
	private String modelo;
	private int ano;

	public String getMarca() {

		return this.marca;

	}

	public void setMarca(String marca) {

		this.marca = marca;

	}

	public String getModelo() {

		return this.modelo;

	}

	public void setModelo(String modelo) {

		this.modelo = modelo;

	}

	public int getAno() {

		return this.ano;

	}

	public void setAno(int ano) {

		this.ano = ano;

	}

	public void ExibirDados(String marca, String modelo, int ano) {

		System.out.println(marca);
		System.out.println(modelo);
		System.out.println(ano);

	}

}
