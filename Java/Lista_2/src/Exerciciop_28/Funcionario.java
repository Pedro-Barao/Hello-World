/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Crie uma classe Funcionario com um método baterPonto(), e implemente Desenvolvedor e
			Designer
 *
 */

package Exerciciop_28;

public abstract class Funcionario {

	private String nome;
	
	public String getNome()
	{
		
		return nome;
		
	}
	
	public void setNome(String nome)
	{
		
		this.nome = nome;
		
	}
	
	public abstract void BaterPonto(String nome);
	
}
