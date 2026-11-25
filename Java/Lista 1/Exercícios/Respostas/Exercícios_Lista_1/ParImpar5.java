/*

Autor: Pedro Gonella Barão
Data: 11/08/2025
Objetivo: Aplicar condicionais

 */

import java.util.Scanner;

public class ParImpar5 {
    
    public static void main(String[] args)
    {
        
        try (Scanner scanner = new Scanner(System.in))
        {
            
            System.out.println("Digite um número, e diremos se ele é par ou ímpar; ");
            int numero = scanner.nextInt();
            
            if (numero % 2 == 0)
            {
                
                System.out.println("Seu número é par");
                
            }
            else
            {
                
                System.out.println("Seu número é ímpar");
                
            }
        }
    }
}
