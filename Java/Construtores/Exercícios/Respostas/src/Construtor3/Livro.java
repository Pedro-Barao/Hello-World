package Construtor3;

public class Livro {

	private String titulo;
	private String autor;
	private double preco;

	Livro()
	{
		
		this.titulo = "Sem titulo";
		this.autor = "Sem autor";
		
	}
	
	Livro(String titulo, String autor, double preco)
	{
		
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
		
	}
	
	public String getTitulo()
	{
		
		return titulo;
		
	}
	
	public String getAutor()
	{
		
		return autor;
		
	}
	
	public double getPreco()
	{
		
		return preco;
		
	}
	
}
