/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Crie uma classe Estoque com um método atualizarQuantidade(), e implemente Eletronicos e
			Roupas.
 *
 */

package Exerciciop_30;

public abstract class Estoque {

	private String nome;
	private int quantidade;
	
	public String getNome()
	{
		
		return nome;
		
	}
	
	public void setNome(String nome)
	{
		
		this.nome = nome;
		
	}
	
	public int getQuantidade()
	{
		
		return quantidade;
		
	}

	public void setQuantidade(int quantidade)
	{
		
		this.quantidade = quantidade;
		
	}
	
	public abstract void AtualizarQuantidade(String nome, int quantidade);
	
}
