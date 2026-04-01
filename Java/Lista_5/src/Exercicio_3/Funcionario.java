package Exercicio_3;

public class Funcionario extends Pessoa{

	private String cargo;
	private double salario;
	
	Funcionario(String nome, int idade, String cargo, double salario)
	{
		
		super(nome, idade);
		this.cargo = cargo;
		this.salario = salario;
		
	}
	
	public String getCargo()
	{
		
		return cargo;
		
	}
	
	public double getSalario()
	{
		
		return salario;
		
	}
	
}
