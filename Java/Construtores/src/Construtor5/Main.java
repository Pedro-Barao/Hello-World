package Construtor5;

public class Main {

	public static void main(String args[])
	{
		
		Retangulo retangulo1 = new Retangulo(1, 2);
		
		System.out.println("Altura 1: " + retangulo1.getAltura() + " | Largura 1: " + retangulo1.getLargura());
		
		Retangulo retangulo2 = new Retangulo(retangulo1);
		
		System.out.println("Altura 2: " + retangulo2.getAltura() + " | Largura 2: " + retangulo2.getLargura());
		
	}
	
}
