package Exerciciop_13;

public class Cliente {

	private String nome;
	private boolean ativo;
	
	Cliente(String nome, boolean ativo)
	{
		
		this.nome = nome;
		this.ativo = ativo;
		
	}
	
	public String getNome()
	{
		
		return nome;
		
	}
	
	public boolean getAtivo()
	{
		
		return ativo;
		
	}
	
}
