package Exerciciop_16;

public class Trabalho {

	private int projeto_id;
	private String descricao;
	
	Trabalho(int projeto_id, String descricao)
	{
		
		this.projeto_id = projeto_id;
		this.descricao = descricao;
		
	}
	
	public int getProjetoId()
	{
		
		return projeto_id;
		
	}
	
	public String getDescricao()
	{
		
		return descricao;
		
	}
	
}
