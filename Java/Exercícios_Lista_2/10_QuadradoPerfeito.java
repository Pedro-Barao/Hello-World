/*

Autor: Pedro Gonella Barao
Data: 25/08/2025
Objetivo: Retornando um numero quadrado

 */

package Exercícios_Lista_2;

import java.util.Scanner;


public class 10_QuadradoPerfeito {
    
    
    public static boolean QuadradoPerfeito(int numero)
    {
        
        boolean verificador;
        
        verificador = numero == Math.sqrt(numero) * Math.sqrt(numero);
        
        return verificador;
        
    }
    
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean verificador;
        
        
        System.out.println("\nOla usuario! Insira um numero e diremos se ele e ou nao um quadrado perfeito: ");
        numero = scanner.nextInt();
        
        
        verificador =  QuadradoPerfeito(numero);
        
        if (verificador == true)
        {
            
            System.out.println("\n\nO numero " + numero + " e um quadrado perfeito");
            
        }
        
        else
        {
            
            System.out.println("\n\nO numero " + numero + " nao e um quadrado perfeito");
            
        }
            
   
    }
    
}
