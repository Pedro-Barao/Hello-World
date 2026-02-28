package Exerciciop_15;

import java.util.Scanner;

public class MainImprimirPDF {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		PDF pdf = new PDF();
		String nome;
		float tamanho;

		System.out.println("Qual o nome do documento pdf?: ");
		nome = scanner.nextLine();
		pdf.setNome(nome);

		System.out.println("Qual o tamanho do pdf?: ");
		tamanho = scanner.nextFloat();
		pdf.setTamanho(tamanho);

		pdf.Imprimir(nome, tamanho);

	}

}
