/*
 *
 * Nome: Pedro Gonella Barao
 * Data: 10/02/2026
 * Objetivo: Classe Empregado e Especializações: Crie uma hierarquia onde Empregado tem subclasses
			Programador e Designer, cada uma com um método que imprime sua função.

 */

package Exerciciop_13;

public class Empregado {

	private String nome;
	private String funcao;

	Empregado() {
	}

	Empregado(String nome, String funcao) {

		this.nome = nome;
		this.funcao = funcao;

	}

	public String getNome() {

		return this.nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public String getFuncao() {

		return funcao;

	}

	public void setFuncao(String funcao) {

		this.funcao = funcao;

	}

	public void MostrarFuncao(String nome, String funcao) {

		System.out.println("O empregado " + nome + " trabalha como " + funcao);

	}

}
