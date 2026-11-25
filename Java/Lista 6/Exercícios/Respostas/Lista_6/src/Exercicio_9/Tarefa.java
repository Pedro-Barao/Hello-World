package Exercicio_9;

public class Tarefa {

	private String titulo;
	private String concluida;
	
	Tarefa(String titulo, String concluida)
	{
		
		this.titulo = titulo;
		this.concluida = concluida;
		
	}
	
	public String getTitulo()
	{
		
		return titulo;
		
	}
	
	public String getConcluida()
	{
		
		return concluida;
		
	}
	
}
