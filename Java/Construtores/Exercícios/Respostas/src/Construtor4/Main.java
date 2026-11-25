package Construtor4;

public class Main {
	
	public static void main(String arga[])
	{
		
		Retangulo retangulo1 = new Retangulo(10, 10);
		Retangulo retangulo2 = new Retangulo(retangulo1);
		
		System.out.println(retangulo1.getAltura());
		System.out.println(retangulo1.getLargura());
		
		System.out.println(retangulo2.getAltura());
		System.out.println(retangulo2.getLargura());
		
	}
	
}
