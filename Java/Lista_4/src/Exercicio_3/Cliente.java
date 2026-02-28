package Exercicio_3;

import java.time.LocalDate;

public class Cliente extends Pessoa {

	private LocalDate dataCadastro;

	Cliente(String nome, int idade, LocalDate dataCadastro) {

		super(nome, idade);
		this.dataCadastro = dataCadastro;

	}

	public LocalDate getDataCadastro() {

		return dataCadastro;

	}

}
