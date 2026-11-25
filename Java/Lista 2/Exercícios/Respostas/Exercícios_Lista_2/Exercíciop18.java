/*

Autor: Pedro Gonella Barao
Data: 25/08/2025
Objetivo: Uma funcao que identifica se esta escrito "Java"

 */

package Exercícios_Lista_2;

import java.util.Scanner;

public class Exercíciop18 {
    
    
    public static boolean IgualJava(String palavra, String java)
    {
        
        boolean verificador;
        
        
        verificador = palavra.equals(java);
        
        
        return verificador;
        
    }
    
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        String palavra, java = "Java";
        boolean verificador;
        
        
        System.out.println("\nOla usuario! Escreva uma palavra e diremos se ela e 'Java':");
        palavra = scanner.nextLine();
        
        
        verificador = IgualJava(palavra, java);
        
        
        if (verificador == true)
        {
            
            System.out.println("\nA palavra escrita e Java");
            
        }
        
        else
        {
            
            System.out.println("\nA palavra escrita nao e Java");
            
        }
        
    }
    
}
