/*
 *
 * Nome: Pedro Gonella Barao, Henrique Oliveira, Guilherme Cortez, Luis Felipe
 * Data: 10/02/2026
 * Objetivo: Crie uma classe Aula com um método ministrar(), e implemente Matematica e Portugues
 *
 */

package Exerciciop_29;

public abstract class Aula {

	private String horas;
	
	public String getHoras()
	{
		
		return horas;
		
	}
	
	public void setHoras(String horas)
	{
		
		this.horas = horas;
		
	}
	
	public abstract void Ministrar(String horas, String nome_professor);
	
}
