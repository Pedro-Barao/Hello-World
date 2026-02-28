package Exerciciop_29;

import java.util.Scanner;

public class MainAulaDeMatematica {

	public static void main(String args[])
	{
		
		Scanner scanner = new Scanner(System.in);
		Matematica matematica = new Matematica();
		String horas, nome_professor;
		
		System.out.println("Qual o nome do professor(a) de matematica?: ");
		nome_professor = scanner.nextLine();
		matematica.setNomeProfessor(nome_professor);
		
		System.out.println("Que horas a aula de matematica comeca?: ");
		horas = scanner.nextLine();
		matematica.setHoras(horas);
		
		matematica.Ministrar(horas, nome_professor);
		
	}
	
}
