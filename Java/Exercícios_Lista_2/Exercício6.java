/*

Autor: Gabriel Nascimento, Guilherme Cortez, Henrique Oliveira e Pedro Barão
Data: 15/08/2025
Objetivo: Uma função que mostra o menor dentre 3 números

 */

package Exercícios_Lista_2;
import java.util.Scanner;

public class Exercício6 {
    
    
    public static boolean MenordosTres(int a, int b, int c, boolean d)
    {
        
        boolean menor_numero1;
        boolean menor_numero2;
        
        
        if (a < b && a < c)
        {
            
            menor_numero1 = true;
            menor_numero2 = true;
            
        }
        
        else if (b < a && b < c)
        {
            
            menor_numero1 = true;
            menor_numero2 = false;
            
        }
        
        else
        {
            
            menor_numero1 = false;
            menor_numero2 = false;
            
        }
        
        
        if (d == true)
        {
            
            return menor_numero1;
            
        }
        
        else
        {
            
            return menor_numero2;
            
        }
        
    }
    
    
    public static void main(String[] args)
    {
        
        try (Scanner scanner = new Scanner(System.in))
        {
            
            boolean menor_numero1;
            boolean menor_numero2;
            boolean verificador = true;
            
            
            System.out.println("\nOla usuario! Digite tres numeros e diremos o menor: ");
            int numero1 = scanner.nextInt();
            
            System.out.println("\nAgora o segundo: ");
            int numero2 = scanner.nextInt();
            
            System.out.println("\nPor fim o terceiro: ");
            int numero3 = scanner.nextInt();
            
            
            menor_numero1 = MenordosTres(numero1, numero2, numero3, verificador);
            
            verificador = false;
            
            menor_numero2 = MenordosTres(numero1, numero2, numero3, verificador);
            
            
            if (menor_numero1 && menor_numero2 == true)
            {
                
                System.out.println("\nO numero " + numero1 + " e o menor dos tres");
                
            }
            
            else if (menor_numero1 == true && menor_numero2 == false)
            {
                
                System.out.println("\nO numero " + numero2 + " e o menor dos tres");
                
            }
            
            else
            {
                
                System.out.println("\nO numero " + numero3 + " e o menor dos tres");
                
            }
                    
        }
    }
}
