package Exercicio_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainFiltrarProdutos {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		String nome;
		int QuantidadeEmEstoque;
		double preco;

		List<Produto> produto = new ArrayList();

		for (int i = 0; i < 5; i++) {

			System.out.println("Qual o nome do produto?: ");
			nome = scanner.nextLine();

			System.out.println("Qual o quantidade em estoque do produto?: ");
			QuantidadeEmEstoque = scanner.nextInt();

			System.out.println("Qual o preco do produto?: ");
			preco = scanner.nextDouble();

			scanner.nextLine();

			produto.add(new Produto(nome, QuantidadeEmEstoque, preco));

		}

		List<Produto> produtosmaiscaros = produto.stream().filter(p -> p.getQuantidadeEmEstoque() > 0)
				.sorted((a, b) -> Double.compare(a.getPreco(), b.getPreco())).collect(Collectors.toList());

		produtosmaiscaros.forEach(p -> System.out.println("O produto " + p.getNome() + " tem "
				+ p.getQuantidadeEmEstoque() + " no seu estoque valendo um preco de " + p.getPreco() + " reais\n"));

	}

}
