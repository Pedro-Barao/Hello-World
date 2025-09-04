/*

Autor: Pedro Gonella Barao
Data: 25/08/2025
Objetivo: Uma funcao que retorna o tamanho de uma String

 */

package Exercícios_Lista_2;

import java.util.Scanner;


public class Exercíciop11 {
    
    
    public static int Tamanho(String frase)
    {
        
        int numero;
        
        numero = frase.length();
        
        return numero;
        
    }
    
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        int numero_de_caracteres;
        String frase;
        
        
        System.out.println("\nOla usuario! Insira uma frase e diremos qual o seu tamanho:");
        frase = scanner.nextLine();
        
        
        numero_de_caracteres = Tamanho(frase);
        
        
        System.out.println("\n\nA frase '" + frase + "' tem em sua composicao " + numero_de_caracteres + " caracteres");
    
    }
    
}
