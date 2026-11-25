package Construtor7;

public class Main {

	public static void main(String args[])
	{
		
		Carro carro1 = new Carro("", "", 2000);
		Carro carro2 = new Carro("Renault", "Logan", 2016);
		Carro carro3 = new Carro("Ford Ka", "", 1980);
		
		System.out.println("Marca: " + carro1.getMarca() + " | Modelo: " + carro1.getModelo() + " | Ano: " + carro1.getAno() + "\n");
		System.out.println("Marca: " + carro2.getMarca() + " | Modelo: " + carro2.getModelo() + " | Ano: " + carro2.getAno() + "\n");
		System.out.println("Marca: " + carro3.getMarca() + " | Modelo: " + carro3.getModelo() + " | Ano: " + carro3.getAno() + "\n");
		
	}
	
}
