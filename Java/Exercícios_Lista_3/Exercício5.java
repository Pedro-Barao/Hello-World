/*

Autor: Pedro Gonella Barao
Data: 27/08/2025
Objetivo: Deixar os atributos de carro com privados

 */


package Exercícios_Lista_3;


import java.util.Scanner;


public class Exercício5 {
    
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
        

        Carro5_6_7 Usuario = new Carro5_6_7(marca, modelo, ano);
        Usuario.DefinicaoCarro5_6_7();
        
    }
    
}

