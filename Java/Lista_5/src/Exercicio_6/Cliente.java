/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 02/03/2026
 * Objetivo: Filtragem, Contagem e Transformação de Objetos
 */


package Exercicio_6;

public class Cliente {

	private String nome;
	private int idade;
	
	Cliente(String nome, int idade)
	{
		
		this.nome = nome;
		this.idade = idade;
		
	}
	
	public String getNome()
	{
		
		return nome;
		
	}
	
	public int getIdade()
	{
		
		return idade;
		
	}
	
}
