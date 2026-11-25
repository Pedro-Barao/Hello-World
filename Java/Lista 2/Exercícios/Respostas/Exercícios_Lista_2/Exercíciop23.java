/*

Autor: Pedro Gonella Barao
Data: 26/08/2025
Objetivo: Uma funcao que retorna true se 1 de 2 numeros for par

 */


package Exercícios_Lista_2;


import java.util.Scanner;


public class Exercíciop23 {
    
    
    public static boolean Par(int numero1, int numero2)
    {
        
        boolean verificador;
        
        
        verificador = (numero1 % 2 == 0) || (numero2 % 2 == 0);
        
        
        return verificador;
        
    }
    
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2;
        boolean verificador;
        
        
        System.out.println("\nOla usuario! Digite 2 numeros e verei se pelo menos 1 e par:");
        numero1 = scanner.nextInt();
        
        System.out.println("\nAgora o segundo numero:");
        numero2 = scanner.nextInt();
        
        
        verificador = Par(numero1, numero2);
        
        
        if (verificador == true)
        {
            
            System.out.println("\nPelo menos um dentre os numeros " + numero1 + " e " + numero2 + " e par");
            
        }
        
        else
        {
            
            System.out.println("\nNenhum dos numeros e par");
            
        }
        
    }
    
}
