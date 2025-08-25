/*

Autor: Gabriel Nascimento, Guilherme Cortez, Henrique Oliveira e Pedro Barão
Data: 15/08/2025
Objetivo: Uma função que retorna um valor real e seu módulo

 */

package Exercícios_Lista_2;
import java.util.Scanner;

public class 5_RealModulo {
    
    
    public static int RealModulo(int a)
    {
        
        if (a < 0)
        {
            
            a = (a * (-1));
            
        }
        
        return a;
        
    }
    
    public static void main(String[] args)
    {
        
        try (Scanner scanner = new Scanner(System.in))
        {
            int modulo;
        
            System.out.println("\nOla usuario! Digite um numero para escrevermos seu modulo");
            int numero = scanner.nextInt();
            
            modulo = RealModulo(numero);
            
            System.out.println("\nO numero " + numero + " tem o seu modulo equivalente a " + modulo);
            
        }
    }
}
