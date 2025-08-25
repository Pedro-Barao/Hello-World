/*

Autor: Gabriel Nascimento, Guilherme Cortez, Henrique Oliveira e Pedro Barão
Data: 15/08/2025
Objetivo: Uma função que entrega a diferença de dois números em módulo

 */

package Exercícios_Lista_2;
import java.util.Scanner;

public class 8_DiferencaModulo {
    
    
    public static int ResultadoModulo(int a, int b)
    {
        
        if (a < 0)
        {
            
            a = (a * (-1));
            
        }
        
        if (b < 0)
        {
            
            b = (b * (-1));
            
        }
        
        return a - b;
        
    }
    
    public static void main(String[] args)
    {
        
        try(Scanner scanner = new Scanner(System.in))
        {
            
            int resultado;
            
            System.out.println("\nOla usuario! Insira 2 numeros para relizarmos sua diferenca em modulo: ");
            int numero1 = scanner.nextInt();
            
            System.out.println("\nAgora o segundo numero: ");
            int numero2 = scanner.nextInt();
            
            
            resultado = ResultadoModulo(numero1, numero2);
            
            System.out.println("\nO resultado da diferenca entre " + (numero1 * (-1)) + " e " + (numero2 * (-1)) + " e de = " + resultado);
            
        }
    }
}
