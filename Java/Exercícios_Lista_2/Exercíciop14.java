/*

Autor: Pedro Gonella Barao
Data: 25/08/2025
Objetivo: Uma funcao que retorna a primeira letra de uma palavra

 */

package Exercícios_Lista_2;


import java.util.Scanner;


public class Exercíciop14 {
   
    
    public static String PrimeiraLetra(String palavra)
    {
        
        String letra;
        
        letra = palavra.substring(0, 1);
        
        return letra;
        
    }
    
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        String palavra, letra;
        
        
        System.out.println("\nOla usuario! Insira uma palavra e retornaremos sua primeira letra:");
        palavra = scanner.nextLine();
        
        
        letra = PrimeiraLetra(palavra);
        
        
        System.out.println("\nA primeira letra da palavra " + palavra + " e " + letra);
        
    }
    
}
