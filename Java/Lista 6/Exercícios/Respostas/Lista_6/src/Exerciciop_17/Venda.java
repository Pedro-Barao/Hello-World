package Exerciciop_17;

public class Venda {

	private double valor;
	private String produto;
	
	Venda(String produto, double valor)
	{
		
		this.valor = valor;
		this.produto = produto;
		
	}
	
	public String getProduto()
	{
		
		return produto;
		
	}
	
	public double getValor()
	{
		
		return valor;
		
	}

}
