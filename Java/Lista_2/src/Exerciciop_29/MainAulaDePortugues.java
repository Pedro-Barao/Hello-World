package Exerciciop_29;

import java.util.Scanner;

public class MainAulaDePortugues {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		Portugues portugues = new Portugues();
		String horas, nome_professor;
		
		System.out.println("Qual o nome do professor(a) de portugues?: ");
		nome_professor = scanner.nextLine();
		portugues.setNomeProfessor(nome_professor);
		
		System.out.println("Que horas a aula de portugues comeca?: ");
		horas = scanner.nextLine();
		portugues.setHoras(horas);
		
		portugues.Ministrar(horas, nome_professor);
		
	}
	
}
