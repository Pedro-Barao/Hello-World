/*

Autor: Pedro Gonella Barao
Data: 26/08/2025
Objetivo: Uma funcao que anlisa 3 numeros e diz se sao diferentes

 */


package Exercícios_Lista_2;


import java.util.Scanner;


public class Exercíciop25 {
    
    
    public static boolean Diferentes(int numero1, int numero2, int numero3)
    {
        
        boolean verificador;
        
        
        verificador = (numero1 != numero2) || (numero1 != numero3) || (numero2 != numero3);
        
        
        return verificador;
        
    }
    
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, numero3;
        boolean verificador;
        
        
        System.out.println("\nOla usuario! Digite 3 numeros e diremos se eles sao diferentes, primeiro numero:");
        numero1 = scanner.nextInt();
        
        System.out.println("\nAgora o segundo:");
        numero2 = scanner.nextInt();
        
        System.out.println("\nPor fim o terceiro:");
        numero3 = scanner.nextInt();
        
        
        verificador = Diferentes(numero1, numero2, numero3);
        
        
        if (verificador == true)
        {
            
            System.out.println("\nOs tres numeros sao diferentes");
            
        }
        
        else
        {
            
            System.out.println("\nOs tres numeros nao sao diferentes");
            
        }
        
    }
    
}
