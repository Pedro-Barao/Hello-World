package Exerciciop_19;

public abstract class Carro extends Veiculo{
	
	Carro()
	{
		
		super();
		
	}
	
	Carro(String marca, String modelo, float limite_tanque)
	{
		
		super(marca, modelo, limite_tanque);
		
	}

	public abstract void Abastecer();
}
