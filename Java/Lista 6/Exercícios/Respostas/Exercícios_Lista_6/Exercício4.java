/*

Nome: Pedro Gonella Barão
Data: 19/09/2025
Objetivo: Crie um array de 6 números inteiros e exiba apenas os valores pares

 */


package Exercícios_Lista_6;


import java.util.Scanner;


public class Exercício4 {
    
    
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        
        
        System.out.println("Ola usuario! Escreva 6 numeros e mostraremos apenas os numeros pares");
        
        
        System.out.println("\nNumero 1: ");
        numeros[0] = scanner.nextInt();
        
        System.out.println("Numero 2: ");
        numeros[1] = scanner.nextInt();
        
        System.out.println("Numero 3: ");
        numeros[2] = scanner.nextInt();
        
        System.out.println("Numero 4: ");
        numeros[3] = scanner.nextInt();
        
        System.out.println("Numero 5: ");
        numeros[4] = scanner.nextInt();
        
        System.out.println("Numero 6: ");
        numeros[5] = scanner.nextInt();
        
        
        for(int i = 0; i < 6; i++)
        {
        
            if(numeros[i] % 2 == 0)
            {
                
                System.out.println("O numero " + numeros[i] + " e par");
                
            }
            
        }
        
    }
    
}
