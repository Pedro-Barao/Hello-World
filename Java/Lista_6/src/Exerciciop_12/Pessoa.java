package Exerciciop_12;

public class Pessoa {

	protected String nome;
	protected int idade;
	
	Pessoa(String nome, int idade)
	{
		
		this.nome = nome;
		this.idade = idade;
		
	}
	
	public String getNome()
	{
		
		return nome;
		
	}
	
	public int getIdade()
	{
		
		return idade;
		
	}
	
}
