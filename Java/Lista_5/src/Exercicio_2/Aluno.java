/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
* Data: 01/03/2026
 * Objetivo:  Ordenação de Objetos (ASC e DESC) e Transformação de Lista

 */

package Exercicio_2;

public class Aluno {

	private String nome;
	private int idade;
	private double nota;
	
	Aluno(String nome, int idade, double nota)
	{
		
		this.nome = nome;
		this.idade = idade;
		this.nota = nota;
		
	}
	
	public String getNome()
	{
		
		return nome;
		
	}
	
	public int getIdade()
	{
		
		return idade;
		
	}
	
	public double getNota()
	{
		
		return nota;
		
	}
	
}
