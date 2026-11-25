package Exerciciop_22;

import java.time.LocalDate;

public class Pessoa {
	
	private String nome;
	private LocalDate dataNascimento;

	Pessoa(String nome, LocalDate dataNascimento)
	{
		
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		
	}
	
	public String getNome()
	{
		
		return nome;
		
	}
	
	public LocalDate getDataNascimento()
	{
		
		return dataNascimento;
		
	}
	
}
