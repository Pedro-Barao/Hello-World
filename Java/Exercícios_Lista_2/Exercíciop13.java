/*

Autor: Pedro Gonella Barao
Data: 25/08/2025
Objetivo: Fazer uma funcao que recebe um caracter e retorna se e ou nao uma vogal

 */

package Exercícios_Lista_2;


import java.util.Scanner;


public class Exercíciop13 {
    
    
    public static boolean Vogal(char letra)
    {
        
        boolean verificador;
        
        
        switch (letra) {
            case 'a':
                
                verificador = true;
                break;
                
            case 'e':
                
                verificador = true;
                break;
                
            case 'i':
                
                verificador = true;
                break;
                
            case 'o':
                
                verificador = true;
                break;
                
            case 'u':
                
                verificador = true;
                break;
                
            default:
                
                verificador = false;
                break;
        }
        
        return verificador;
    }
    
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        String leitor;
        char letra;
        boolean verificador;
        
        
        System.out.println("\nOla usuario! Digite uma letra e diremos se ela e uma vogal:");
        leitor = scanner.next();
        letra = leitor.charAt(0);
        
        
        verificador = Vogal(letra);
        
        
        if (verificador == true)
        {
            
            System.out.println("\nVoce digitou uma vogal");
            
        }
        
        else
        {
            
            System.out.println("\nVoce digitou uma consoante");
            
        }
        
    }
    
}
