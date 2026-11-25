package Exerciciop_29;

public class Matematica extends Aula{

	private String nome_professor;
	
	Matematica()
	{
		
		super();
		
	}
	
	Matematica(String horas)
	{
		
		super.getHoras();
		
	}
	
	public String getNomeProfessor()
	{
		
		return nome_professor;
		
	}
	
	public void setNomeProfessor(String nome_professor)
	{
		
		this.nome_professor = nome_professor;
		
	}
	
	public void Ministrar(String horas, String nome_professor)
	{
		
		System.out.println("A aula de matematica do professor(a) " + nome_professor + " sera ministrada as " + horas + " horas");
		
	}

	
}
