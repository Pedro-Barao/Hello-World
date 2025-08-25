/*

Autor: Gabriel Nascimento, Guilherme Cortez, Henrique Oliveira e Pedro Barão
Data: 14/08/2025
Objetivo: Função que identifica se um número é multiplo do outro

 */

package Exercícios_Lista_2;
import java.util.Scanner;

public class 3_Multiplos {
    
    public static boolean Multiplos(int numero1, int numero2)
    {
        
        boolean multiplos = false;
        int resultado;
        int i;
        
        for (i = 0; i < numero1; i++)
        {
            
            resultado = numero2 * i;
            
            if (resultado == numero1)
            {
                
                multiplos = true;
                
            }
        }
        
        return multiplos;
        
    }
    
    
    public static void main(String[] args)
    {
        
        try (Scanner scanner = new Scanner(System.in))
        {
            
            boolean resultado;
            
            System.out.println("\nOla usuario! Digite um numero para ver se ele e multiplo do numero seguinte: ");
            int numero1 = scanner.nextInt();
            
            System.out.println("\nAgora o segundo numero: ");
            int numero2 = scanner.nextInt();
            
            resultado = Multiplos(numero1, numero2);
            
            if (resultado == true)
            {
                
                System.out.println("\nO numero " + numero1 + " e multiplo do numero " + numero2);
                
            }
            
            else
            {
                
                System.out.println("\nO numero " + numero1 + " nao e multiplo do numero " + numero2);
                
            }
        }
    }
}
