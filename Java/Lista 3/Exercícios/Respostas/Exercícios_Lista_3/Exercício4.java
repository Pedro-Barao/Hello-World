/*

Autor: Pedro Gonella Barao
Data: 27/08/2025
Objetivo: Criar a possibilidade do usuario criar o seu carro

 */


package Exercícios_Lista_3;


import java.util.Scanner;


public class Exercício4 {
    
    public static void main(String[] args)
    {
    
        Scanner scanner = new Scanner(System.in);
        String marca, modelo;
        int ano;
        
        
        System.out.println("\nOla usuario! Diga qual a marca do seu carro:");
        marca = scanner.nextLine();
        
        System.out.println("\nAgora o modelo:");
        modelo = scanner.nextLine();
        
        System.out.println("\nPor fim o ano:");
        ano = scanner.nextInt();
        

        Carro Usuario = new Carro(marca, modelo, ano);
        Usuario.DefinicaoCarro();
        
    }
    
}

