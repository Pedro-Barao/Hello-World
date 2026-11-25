package Construtor3;

public class Main {

	public static void main(String args[])
	{
		
		Livro livro = new Livro();
		Livro livro_com_dados = new Livro("Senhor dos aneis", "J.J.Tolkien", 200);
		
		System.out.println(livro.getTitulo());
		System.out.println(livro.getAutor());
		
		
		System.out.println("\n" + livro_com_dados.getTitulo());
		System.out.println(livro_com_dados.getAutor());
		System.out.println(livro_com_dados.getPreco());
		
	}
	
}
