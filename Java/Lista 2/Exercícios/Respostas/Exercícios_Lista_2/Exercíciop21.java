/*

Autor: Pedro Gonella Barao
Data: 26/08/2025
Objetivo: Uma funcao que retorna se o numero e primo

 */


package Exercícios_Lista_2;


import java.util.Scanner;


public class Exercíciop21 {
    
    
    public static boolean Primo(int numero)
    {
        
        boolean verificador;
        
        
        verificador = (numero == 2) || (numero % 2 != 0) || (numero % 3 != 0) || (numero % 5 != 0) || (numero % 7 != 0);
        
        
        return verificador;
        
    }
    
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean verificador;
        
        
        System.out.println("\nOla usuario! Insira um numero e diremos se ele e primo:");
        numero = scanner.nextInt();
        
        
        verificador = Primo(numero);
        
        
        if (verificador == true)
        {
            
            System.out.println("\nO numero " + numero + " e um primo");
            
        }
        
        else
        {
            
            System.out.println("\nO numero " + numero + " nao e um primo");
            
        }
        
    }
    
}
