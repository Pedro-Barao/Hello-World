package Exerciciop_11;

public class Pedido {

	private int id;
	private double valor;
	
	Pedido(int id, double valor)
	{
		
		this.id = id;
		this.valor = valor;
		
	}
	
	public int getId()
	{
		
		return id;
		
	}
	
	public double getValor()
	{
		
		return valor;
		
	}
	
}
