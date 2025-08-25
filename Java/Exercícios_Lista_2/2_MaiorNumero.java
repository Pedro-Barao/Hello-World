/*

Autor: Gabriel Nascimento, Guilherme Cortez, Henrique Oliveira e Pedro Barão
Data: 14/08/2025
Objetivo: Função que retorna o maior dentre 2 números inteiros

 */

package Exercícios_Lista_2;
import java.util.Scanner;


public class 2_MaiorNumero {
    
    public static boolean MaiorNumero(int numero1, int numero2)
    {
        
        boolean maior;
        
        maior = numero1 < numero2;
        
        return maior;
        
    }
    
    
    
    public static void main(String[] args)
    {
        
        try (Scanner scanner = new Scanner(System.in))
        {
            
            boolean resultado;
            
            System.out.println("\nOla usuario! Digite um numero para fazermos uma comparacao: ");
            int numero1 = scanner.nextInt();
            
            System.out.println("\nAgora o segundo numero: ");
            int numero2 = scanner.nextInt();
            
            resultado = MaiorNumero(numero1, numero2);
            
            if (resultado = true)
            {
                
                System.out.println("\nO numero " + numero1 + " e maior que o " + numero2);
                
            }
            
            else
            {
                
                System.out.println("\nO numero " + numero2 + " e maior que o " + numero1);
            }
            
        }
    }
}
