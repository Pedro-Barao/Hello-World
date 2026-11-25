/*

Autor: Pedro Gonella Barao
Data: 25/08/2025
Objetivo: Criar uma funcao que recebe uma String que diz se uma palavra comeca com "A"

 */

package Exercícios_Lista_2;

import java.util.Scanner;

public class Exercíciop15 {
    
    
    public static boolean ComecaA(String palavra, String letra)
    {
        
        boolean verificador;
        
        
        palavra = palavra.substring(0, 1);
        
        verificador = palavra.equals(letra);
        
        
        return verificador;
        
    }
    
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        String palavra, letra = "A";
        boolean verificador;
        
        
        System.out.println("\nOla usuario! Insira uma palavra e diremos se ela comeca com 'A':");
        palavra = scanner.nextLine();
        
        
        verificador = ComecaA(palavra, letra);
        
        
        if (verificador == true)
        {
            
            System.out.println("\nA palavra " + palavra + " comeca com A");
            
        }
        
        else
        {
            
            System.out.println("\nA palavra " + palavra + " nao comeca com A");
            
        }
        
    }
    
}
