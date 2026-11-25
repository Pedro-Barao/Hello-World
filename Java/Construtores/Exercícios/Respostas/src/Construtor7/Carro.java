package Construtor7;

public class Carro {

	private String marca;
	private String modelo;
	private int ano;
	
	Carro(String marca, String modelo, int ano)
	{
		
		this.marca = (marca == null || marca.isEmpty()) ? "Marca Genérica" : marca;
		
		this.modelo = (modelo == null || modelo.isEmpty()) ? "Modelo Genérico" : modelo;
			
		this.ano = (ano <= 0) ? 2000 : ano;
		
	}
	
	public String getMarca()
	{
		
		return marca;
		
	}
	
	public String getModelo()
	{
		
		return modelo;
		
	}
	
	public int getAno()
	{
		
		return ano;
		
	}
	
}
