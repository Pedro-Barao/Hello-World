/*

Autor: Pedro Gonella Barão
Data: 11/08/2025
Objetivo: Fazer uma calculadora

 */

import java.util.Scanner;

public class Calculadora6 {
    
    public static void main(String[] args)
    {
              
        try (Scanner scanner = new Scanner(System.in))
        {
    
            System.out.println("Bem-vindo ao sistema de calculadora!\n");
            System.out.println("Digite o primeiro número inteiro para fazermos a conta: ");
        
            int numero1 = scanner.nextInt();
        
            System.out.println("\nAgora digite o segundo número: ");
        
            int numero2 = scanner.nextInt();
        
        
        
            System.out.println("\nEscolha a equação que você deseja efetuar:\n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão");
        
            int calcular = scanner.nextInt();
            int resultado = 0;
            
            switch(calcular)
            {
                case 1:
                    
                    resultado = numero1 + numero2;
                    break;
                    
                case 2:
                    
                    resultado = numero1 - numero2;
                    break;
                    
                case 3:
                    
                    resultado = numero1 * numero2;
                    break;
                    
                case 4:
                    
                    resultado = numero1 / numero2;
                    break;
                    
                default:
                    
                    System.out.println("Coloque um dos valores disponíveis");
                    break;
                    
            }
            
            System.out.println("\nO resultado da equação é: " + resultado);
        }
    }
}
