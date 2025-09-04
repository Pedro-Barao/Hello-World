/*

Autor: Gabriel Nascimento, Guilherme Cortez, Henrique Oliveira e Pedro Barão
Data: 15/08/2025
Objetivo: Uma função que verifica se um número entre 1 e 100

 */

package Exercícios_Lista_2;
import java.util.Scanner;

public class Exercício7 {
    
    
    public static boolean UmaCem(int a)
    {
        
        boolean verificador;
        
        verificador = a <= 100 && a >= 1;
        
        return verificador;
        
    }
    
    
    public static void main(String[] args)
    {
        
        try (Scanner scanner = new Scanner(System.in))
        {
            
            boolean verificador;
            
            
            System.out.println("\nOla usuario! Digite um numero e direi se ele esta entre 1 e 100: ");
            int numero = scanner.nextInt();
            
            
            verificador = UmaCem(numero);
            
            
            if (verificador == true)
            {
                
                System.out.println("\nO numero " + numero + " esta entre 1 e 100");
                
            }
            
            else
            {
                
                System.out.println("\nO numero " + numero + " nao esta entre 1 e 100");
                
            }
        }
    }
}
