/*

Autor: Pedro Gonella Barao
Data: 25/08/2025
Objetivo: Somar 2 numeros, mas apenas se eles forem positivos caso sejam negativos deve-se retornar 0

 */

package Exercícios_Lista_2;

import java.util.Scanner;


public class 9_SomaPositivos {
    
    
    public static int Soma(int numero1, int numero2)
    {
        
        int soma;
        
        if (numero1 > 0 && numero2 > 0)
        {
            
            soma = numero1 + numero2;
            
        }
        
        else
        {
            
            soma = 0;
            
        }
        
        
        return soma;
            
    }
    
    
    public static void main (String[] args)
    {
        
        Scanner scanner = new Scanner (System.in);
        int numero1, numero2, resultado;
        
        
        System.out.println("\nOla usuario! Insira numeros positivos para realizarmos uma soma: ");
        numero1 = scanner.nextInt();
        
        
        System.out.println("\nAgora o outro numero: ");
        numero2 = scanner.nextInt();
        
        
        resultado = Soma(numero1, numero2);
        
        
        if (resultado > 0)
        {
            
            System.out.println("\n\nA soma do numero " + numero1 + " e do numero " + numero2 + " gera o resultado " + resultado);
            
        }
        
        else
        {
            
            System.out.println("\n\nOs valores inseridos nao geram um resultado positivo");
            
        }
    }
    
}
