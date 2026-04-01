/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 04/03/2026
 * Objetivo: Criar e Agrupar Objetos por Status
 */


package Exerciciop_11;

public class Pedido {
	
	private int id;
	private String nome;
	private String status;
	
	Pedido(int id, String nome, String status)
	{
		
		this.id = id;
		this.nome = nome;
		this.status = status;
		
	}
	
	public int getId()
	{
		
		return id;
		
	}
	
	public String getNome()
	{
		
		return nome;
		
	}
	
	public String getStatus()
	{
		
		return status;
		
	}

}
