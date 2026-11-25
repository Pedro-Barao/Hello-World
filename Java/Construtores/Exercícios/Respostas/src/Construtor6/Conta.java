package Construtor6;

public class Conta {

	private String id_conta;
	private double saldo;
	
	Conta(String id_conta, double saldo)
	{
		
		if(id_conta == null || id_conta.isEmpty())
		{
			
			System.out.println("O id deve receber um valor obrigatóriamente");
			
			return;
			
		}
		
		if(saldo < 0)
		{
			
			System.out.println("Saldo negativo, impossivel de registrar");
			
			return;
			
		}
		
		this.id_conta = id_conta;
		this.saldo = saldo;	
		
	}
	
	public String getIdConta()
	{
		
		return id_conta;
		
	}
	
	public double getSaldo()
	{
		
		return saldo;
		
	}
	
	public void MostrarConta(String id_conta, double saldo)
	{
		
		System.out.println("ID: " + id_conta + " | Saldo: " + saldo + "\n");
		
	}
	
}
