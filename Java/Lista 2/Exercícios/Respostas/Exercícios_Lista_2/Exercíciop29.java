/*

Autor: Pedro Gonella Barao
Data: 27/08/2025
Objetivo: Uma funcao que retorna true se um numero for perfeito

 */


package Exercícios_Lista_2;


import java.util.Scanner;


public class Exercíciop29 {
    
    
    public static boolean Perfeito(int numero)
    {
        
        int soma = 0;
        boolean verificador;
                
        
        for (int i = 1; i < numero; i++)
        {
            
            if (numero % i == 0)
            {
                
                soma += i;
                
            }
            
        }
        
        
        verificador = numero == soma;
        
        
        return verificador;
        
    }
    
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean verificador;
        
        
        System.out.println("\nOla usuario! Insira um numero e direi se ele e perfeito:");
        numero = scanner.nextInt();
        
        
        verificador = Perfeito(numero);
        
        
        if (verificador == true)
        {
            
            System.out.println("\nO numero " + numero + " e um numero perfeito");
            
        }
        
        else
        {
            
            System.out.println("\nO numero " + numero + " nao e um numero perfeito");
            
        }
        
    }
    
}
