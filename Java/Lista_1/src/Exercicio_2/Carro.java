/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Criação de Classe e Objeto: Crie uma classe Carro com atributos marca, modelo e ano.
		Instancie objetos dessa classe e imprima seus valores.

		a. Métodos Simples: Adicione um método exibirDetalhes() na classe Carro que imprime
		os detalhes do carro.

		b. Encapsulamento: Torne os atributos marca, modelo e ano privados e crie métodos
		getters e setters.

		c. Construtores: Adicione um construtor que receba os valores dos atributos da classe
		Carro no momento da instanciação.

		d. Contador de Objetos: Adicione um atributo estático na classe Carro para contar
		quantos carros foram criados.

		e. Métodos Estáticos: Crie um método estático na classe Carro que exibe quantos carros
		foram criados.

 */

package Exercicio_2;

public class Carro {

	private static String marca;
	private static String modelo;
	private static int ano;
	public static int contar = 0;

	String marca_2;
	String modelo_2;
	int ano_2;

	Carro() {
	}

	public Carro(String marca_2, String modelo_2, int ano_2) {

		this.marca_2 = marca_2;
		this.modelo_2 = modelo_2;
		this.ano_2 = ano_2;

	}

	public String getMarca() {

		return Carro.marca;

	}

	public void setMarca(String marca) {

		Carro.marca = marca;

	}

	public String getModelo() {

		return Carro.modelo;

	}

	public void setModelo(String modelo) {

		Carro.modelo = modelo;

	}

	public int getAno() {

		return Carro.ano;

	}

	public void setAno(int ano) {

		Carro.ano = ano;

	}

	public void ExibirDados(String marca, String modelo, int ano) {

		System.out.println(marca);
		System.out.println(modelo);
		System.out.println(ano);
		contar++;

	}

	public void MostrarCarros() {

		System.out.println("Carros: " + contar);

	}

}
