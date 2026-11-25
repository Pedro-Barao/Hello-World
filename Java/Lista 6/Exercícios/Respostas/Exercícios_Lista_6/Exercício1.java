/*

Autor: Pedro Gonella Barao
Data: 11/09/2025
Objetivo: Criar um array com 5 inteiros e preencha os valores com um for

 */


package Exercícios_Lista_6;


import java.util.Scanner;


public class Exercício1 {
    
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        
        
        for(int i = 0; i < 5; i++)
        {
            
            System.out.println("Ola usuario, coloque o valor de " + (i + 1) + " :");
            numeros[i] = scanner.nextInt();
            
        }
        
        
        for(int i = 0; i < 5; i++)
        {
            
            System.out.println("O numero " + (i + 1) + " e igual a: " + numeros[i]);
            
        }
        
    }
    
}
