/*

Autor: Pedro Gonella Barao
Data: 28/08/2025
Objetivo: Criar uma classe pessoa com encapsulamento

 */


package Exercícios_Lista_3;


import java.util.Scanner;


public class Exercício8 {
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        Pessoa8_9 Usuario = new Pessoa8_9();
        String nome;
        int idade;
        float altura;
        
        
        System.out.println("\nOla usuario! Digite o seu nome:");
        nome = scanner.nextLine();
        
        System.out.println("\nAgora digite sua idade:");
        idade = scanner.nextInt();
        
        System.out.println("\nDigite a sua altura:");
        altura = scanner.nextFloat();
        

        Usuario.setNome(nome);
        Usuario.setIdade(idade);
        Usuario.setAltura(altura);
        
        
        Usuario.ImprimirDados();
        
    }
    
}
