package Exercicio_8;

public class Pessoa implements Descritivel{

	private String nome;
	private String descricao;
	
	Pessoa(String nome, String descricao)
	{
		
		this.nome = nome;
		this.descricao = descricao;
		
	}
	
	public String getNome()
	{
		
		return nome;
		
	}
	
	@Override
	public String getDescricao()
	{
		
		return descricao;
		
	}
	
}
