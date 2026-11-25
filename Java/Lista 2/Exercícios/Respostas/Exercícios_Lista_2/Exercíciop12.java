/*

Autor: Pedro Gonella Barao
Data: 25/08/2025
Objetivo: Fazer uma funcao que reccebe 2 strings e retorna se sao iguais

 */

package Exercícios_Lista_2;


import java.util.Scanner;


public class Exercíciop12 {
    
    
    public static boolean Iguais(String frase1, String frase2)
    {
        
        boolean verificador;
        
        
        frase1 = frase1.toUpperCase();
        frase2 = frase2.toUpperCase();
        
        
        verificador = frase1.equals(frase2);
        
        
        return verificador;
        
    }
    
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        String frase1, frase2;
        boolean verificador;
        
        
        System.out.println("\nOla usuario! Digite 2 textos para que possamos dizer se eles sao iguais ou nao:");
        frase1 = scanner.nextLine();
        
        
        System.out.println("\nAgora a segunda frase:");
        frase2 = scanner.nextLine();
        
        
        verificador = Iguais(frase1, frase2);
        
        
        if (verificador == true)
        {
            
            System.out.println("\nAs duas frases sao iguais");
            
        }
        
        else
        {
            
            System.out.println("\nAs duas frases sao diferentes");
            
        }
        
    }
    
}
