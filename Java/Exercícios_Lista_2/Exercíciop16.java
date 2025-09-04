/*

Autor: Pedro Gonella Barao
Data: 25/08/2025
Objetivo: Uma funcao que retorna true se uma sting tem apenas letras, sem numeros

 */

package Exercícios_Lista_2;

import java.util.Scanner;

public class Exercíciop16 {
    
    
    public static boolean TemNumeros(String frase)
    {
        
        boolean verificador;
        
        
        verificador = !(frase.contains("1") || frase.contains("2") || frase.contains("3") || frase.contains("4") || frase.contains("5") || frase.contains("6") || frase.contains("7") || frase.contains("8") || frase.contains("9") || frase.contains("0"));
        
        
        return verificador;
        
    }
    
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        String frase;
        boolean verificador;
        
        
        System.out.println("\nOla usuario! Insira uma palavra ou frase e diremos se ela tem numeros ou nao:");
        frase = scanner.nextLine();
        
        
        verificador = TemNumeros(frase);
        
        
        if (verificador == true)
        {
            
            System.out.println("\nA palavra ou frase " + frase + " nao tem numeros em sua composicao");
            
        }
        
        else
        {
            
            System.out.println("\nA palavra ou frase " + frase + " tem numeros em sua composicao");
            
        }
        
    }
    
}
