package Construtor5;

public class Retangulo {

	int altura;
	int largura;
	
	Retangulo(int altura, int largura)
	{
		
		this.altura = altura;
		this.largura = largura;
		
	}
	
	Retangulo(Retangulo retangulo)
	{
		
		this.altura = retangulo.altura;
		this.largura = retangulo.largura;
		
	}
	
	public int getAltura()
	{
		
		return altura;
		
	}
	
	public int getLargura()
	{
		
		return largura;
		
	}
	
}
