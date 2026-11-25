package Exerciciop_15;

public class Filme {

	private String nome;
	private String genero;
	private int ano;
	
	Filme(String nome, String genero, int ano)
	{
		
		this.nome = nome;
		this.genero = genero;
		this.ano = ano;
		
	}
	
	public String getNome()
	{
		
		return nome;
		
	}
	
	public String getGenero()
	{
		
		return genero;
		
	}
	
	public int getAno()
	{
		
		return ano;
		
	}
	
}
