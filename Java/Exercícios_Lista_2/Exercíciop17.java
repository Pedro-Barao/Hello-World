/*

Autor: Pedro Gonella Barao
Data: 25/08/2025
Objetivo: Uma funcao que muda todos os "a" por "@"

 */

package Exercícios_Lista_2;

import java.util.Scanner;

public class Exercíciop17 {
    
    
    public static String MudancaDeFrase(String frase)
    {
        
        String nova_frase;
        
        
        nova_frase = frase.replace('a', '@');
        
        
        return nova_frase;
        
    }
    
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        String frase, nova_frase;
        
        
        System.out.println("\nOla usuario! Insira uma frase e mudaremos todos os 'a' por '@' :");
        frase = scanner.nextLine();
        
        
        nova_frase = MudancaDeFrase(frase);
        
        
        System.out.println("\nA frase '" + frase + "' se torna '" + nova_frase + "'");
                
    }
    
}
