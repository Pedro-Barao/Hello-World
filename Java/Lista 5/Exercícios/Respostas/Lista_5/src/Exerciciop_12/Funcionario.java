/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 04/03/2026
 * Objetivo: Criar e Transformar Listas de Funcionários para Salários Ajustados
 */

package Exerciciop_12;

public class Funcionario {

	private String nome;
	private Double salario;
	private String departamento;
	
	Funcionario(String nome, Double salario, String departamento)
	{
		
		this.nome = nome;
		this.salario = salario;
		this.departamento = departamento;
		
	}
	
	public String getNome()
	{
		
		return nome;
		
	}
	
	public Double getSalario()
	{
		
		return salario;
		
	}
	
	public String getDepartamento()
	{
		
		return departamento;
		
	}
	
}
