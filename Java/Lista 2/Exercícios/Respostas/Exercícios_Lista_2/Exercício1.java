/*

Autor: Gabriel Nascimento, Guilherme Cortez, Henrique Oliveira e Pedro Barão
Data: 14/08/2025
Objetivo: Fução recebe número intero e retorna o seu dobro

 */

package Exercícios_Lista_2;
import java.util.Scanner;

public class Exercício1 {
    
    public static int DobrarNumero(int numero)
    {
        
        return (numero * 2);
        
    }
    
    
    public static void main(String[] args)
    {
        
        try (Scanner scanner = new Scanner(System.in))
        {
            int resultado;
            
            System.out.println("\nOla usuario! Escreva um numero para que possamos imprimir seu valor dobrado: ");
            int numero = scanner.nextInt();
            
            resultado = DobrarNumero(numero);
            
            System.out.println("\nO valor dobrado do seu numero e: " + resultado);
        }
        
    }
}
