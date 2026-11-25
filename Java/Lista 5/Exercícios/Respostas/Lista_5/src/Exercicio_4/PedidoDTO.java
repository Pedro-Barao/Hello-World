package Exercicio_4;

public class PedidoDTO {

	private int id;
	private double valor_total;
	
	PedidoDTO(int id, double valor_total)
	{
		
		this.id = id;
		this.valor_total = valor_total;
		
	}
	
	public int getId()
	{
		
		return id;
		
	}
	
	public double getValorTotal()
	{
		
		return valor_total;
		
	}
	
}
