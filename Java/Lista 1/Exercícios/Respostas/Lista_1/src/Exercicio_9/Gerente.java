package Exercicio_9;

public class Gerente extends Funcionario {

	private float bonus;

	public Gerente() {

		super();

	}

	public Gerente(String nome, float salario, float bonus) {

		super(nome, salario);
		this.bonus = bonus;

	}

	public float getBonus() {

		return this.bonus;

	}

	public void setBonus(float bonus) {

		this.bonus = bonus;

	}

	public void MostrarGerente(String nome, float salario, float bonus) {

		System.out.println("O nome do gerente e: " + nome);
		System.out.println("O salario do gerente e: " + salario);
		System.out.println("O bonus do gerente e: " + bonus);
		System.out.println("O salario final do gerente e: " + (bonus + salario));

	}

}
