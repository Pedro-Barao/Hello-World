/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
* Data: 02/03/2026
 * Objetivo:  Agrupamento de Funcionários por Cargo e Mapeamento para Médias
 */

package Exercicio_3;

public abstract class Pessoa {

	private String nome;
	private int idade;
	
	Pessoa(String nome, int idade)
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
