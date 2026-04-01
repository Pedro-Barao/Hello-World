package Exerciciop_23;

public class Produto {
	
	private int id;
	private String nome;
	private int versao;
	
	Produto(int id, String nome, int versao)
	{
		
		this.id = id;
		this.nome = nome;
		this.versao = versao;
		
	}
	
	public int getId()
	{
		
		return id;
		
	}
	
	public String getNome()
	{
		
		return nome;
		
	}
	
	public int getVersao()
	{
		
		return versao;
		
	}

}
