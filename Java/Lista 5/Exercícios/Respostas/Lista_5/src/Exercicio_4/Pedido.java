/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
* Data: 02/03/2026
 * Objetivo: Mapear uma Lista de Objetos para um DTO
 */

package Exercicio_4;

public class Pedido {

	private int id;
	private String cliente;
	private double valor_total;
	
	Pedido(int id, String cliente, double valor_total)
	{
		
		this.id = id;
		this.cliente = cliente;
		this.valor_total = valor_total;
		
	}

	public int getId()
	{
		
		return id;
		
	}
	
	public String getCliente()
	{
		
		return cliente;
		
	}
	
	public double getValorTotal()
	{
		
		return valor_total;
		
	}
	
}
