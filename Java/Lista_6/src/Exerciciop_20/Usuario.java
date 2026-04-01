package Exerciciop_20;

public class Usuario {

	private int id;
	private String nome_completo;
	
	Usuario(int id, String nome_completo)
	{
		
		this.id = id;
		this.nome_completo = nome_completo;
		
	}
	
	public int getId()
	{
		
		return id;
		
	}
	
	public String getNomeCompleto()
	{
		
		return nome_completo;
		
	}
	
}
