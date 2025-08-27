/*

Autor: Pedro Gonella Barao
Data: 27/08/2025
Objetivo: Uma funcao que retorna o fatorial de um numero

 */


package Exercícios_Lista_2;


import java.util.Scanner;


public class Exercíciop28 {
    
    
    public static int Fatorial(int numero)
    {
        
        int fatorial = 1;
        
        for(int i = 1; i <= numero; i++)
        {
            
            fatorial *= i;
            
        }
        
        
        return fatorial;
        
    }
    
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        int numero, fatorial;
        
        
        System.out.println("\nOla usuario! Digite um numero e diremos seu fatorial:");
        numero = scanner.nextInt();
        
        
        fatorial = Fatorial(numero);
        
        
        System.out.println("\nO fatorial do numero " + numero + " e igual a " + fatorial);
        
    }
    
}
