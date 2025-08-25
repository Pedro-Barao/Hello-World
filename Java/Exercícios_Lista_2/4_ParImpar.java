/*

Autor: Gabriel Nascimento, Guilherme Cortez, Henrique Oliveira e Pedro Barão
Data: 15/08/2025
Objetivo: Uma função que retorna se um número é par ou ímpar

 */

package Exercícios_Lista_2;
import java.util.Scanner;

public class 4_ParImpar {
    
    public static boolean ParouImpar(int a)
    {
        
        boolean verificar;
        
        verificar = a % 2 == 0;
        
        return verificar;
        
    }
    
    public static void main(String[] args)
    {
        
        try (Scanner scanner = new Scanner(System.in))
        {
            
            boolean verificar;
            
            
            System.out.println("\nOla usuario! Digite um numero para verificarmos se ele e par ou impar: ");
            int numero = scanner.nextInt();
            
            
            verificar = ParouImpar(numero);
            
            
            if (verificar == true)
            {
                
                System.out.println("\nO numero " + numero + " e um numero par");
                
            }
            
            else
            {
                
                System.out.println("\nO numero " + numero + " e um numero impar");
                
            }
        }
    }
    
}
