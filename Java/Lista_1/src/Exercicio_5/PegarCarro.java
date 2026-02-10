package Exercicio_5;

import java.util.Scanner;

public class PegarCarro extends Dono {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Carro carro = new Carro();
		Dono dono = new Dono();
		String nome_dono, marca, modelo;
		int idade, ano;

		System.out.println("Qual o nome do comprador do carro?: ");
		nome_dono = scanner.nextLine();
		dono.setNomeDono(nome_dono);

		System.out.println("Qual a idade do comprador?: ");
		idade = scanner.nextInt();
		dono.setIdade(idade);

		System.out.println("Qual o nome da marca do carro?: ");
		marca = scanner.nextLine();
		carro.setMarca(marca);

		System.out.println("Qual o nome do modelo do carro?: ");
		modelo = scanner.nextLine();
		carro.setModelo(modelo);

		System.out.println("Qual o ano do carro?: ");
		ano = scanner.nextInt();
		carro.setAno(ano);

		System.out.println(dono.getNomeDono() + " tem " + dono.getIdade());
		System.out.println("E e dono do carro: ");
		carro.ExibirDados(marca, modelo, ano);
	}

}
