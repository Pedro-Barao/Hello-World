/*

Autor: Pedro Gonella Barao
Data: 26/08/2025
Objetivo: Uma String que retorna uma frase em letras maiusculas

 */


package Exercícios_Lista_2;


import java.util.Scanner;


public class Exercíciop19 {
    
    
    public static String Maiuscula(String frase)
    {
     
        String nova_frase;
        
        
        nova_frase = frase.toUpperCase();
        
        
        return nova_frase;
        
    }
    
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        String frase, nova_frase;
        
        
        System.out.println("\nOla usuario! Escreva uma frase e escreverei ela em letras maiusculas:");
        frase = scanner.nextLine();
        
        
        nova_frase = Maiuscula(frase);
        
        
        System.out.println("\nA frase '" + frase + "' com letras maiusculas se torna '" + nova_frase + "'");
        
    }
    
}
