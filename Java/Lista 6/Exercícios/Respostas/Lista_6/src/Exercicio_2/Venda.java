package Exercicio_2;

public class Venda {

	private String produto_vendido;
	private String valor;
	
	Venda(String produto_vendido, String valor)
	{
		
		this.produto_vendido = produto_vendido;
		this.valor = valor;
		
	}
	
	public String getProdutoVendido()
	{
		
		return produto_vendido;
		
	}
	
	public String getValor()
	{
		
		return valor;
		
	}
	
}
