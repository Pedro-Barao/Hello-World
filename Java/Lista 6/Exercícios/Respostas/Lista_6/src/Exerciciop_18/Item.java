package Exerciciop_18;

public class Item {

	private String nome;
	private int quantidade;
	
	Item(String nome, int quantidade)
	{
		
		this.nome = nome;
		this.quantidade = quantidade;
		
	}
	
	public String getNome()
	{
		
		return nome;
		
	}
	
	public int getQuantidade()
	{
		
		return quantidade;
		
	}
	
}
