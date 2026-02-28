package Exerciciop_30;

public class Eletronicos extends Estoque{

	Eletronicos()
	{
		
		super();
		
	}
	
	Eletronicos(String nome, int quantidade)
	{
		
		super.getNome();
		super.getQuantidade();
		
	}
	
	public void AtualizarQuantidade(String nome, int quantidade)
	{
		
		System.out.println("Os " + nome + " tem atualmente o novo estoque com " + quantidade + " unidades");
		
	}
	
}
