package Exercicio_4;

import java.util.Scanner;

public class Compra extends Produto {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		String nome;
		float preco, soma;
		int quantidade = 0;

		System.out.println("Qual o nome do produto?: ");
		nome = scanner.nextLine();
		setNome(nome);

		System.out.println("Qual o preco do produto?: ");
		preco = scanner.nextInt();
		setPreco(preco);

		System.out.println("Qual a quantidade que esse produto tem no estoque?: ");
		quantidade = scanner.nextInt();
		setQuantidade(quantidade);

		soma = ValorTotalEstoque(preco, quantidade);

		System.out.println("O valor total do(a)" + nome + " estoque e = " + soma);

	}

}
