/*

Autor: Pedro Gonella Barao
Data: 26/08/2025
Objetivo: verificar se um numero e multiplo de 3 e 5 ao mesmo tempo

 */


package Exercícios_Lista_2;


import java.util.Scanner;


public class Exercíciop24 {
    
    
    public static boolean Multiplo(int numero)
    {
        
        boolean verificador;
        
        
        verificador = (numero % 3 == 0) && (numero % 5 == 0);
        
        
        return verificador;
        
    }
    
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean verificador;
        
        
        System.out.println("\nOla usuario! Insira um numero e diremos se ele e multiplo de 3 e 5 ao mesmo tempo:");
        numero = scanner.nextInt();
        
        
        verificador = Multiplo(numero);
        
        
        if (verificador == true)
        {
            
            System.out.println("\nO numero " + numero + " e multiplo de 3 e de 5 ao mesmo tempo");
            
        }
        
        else
        {
            
            System.out.println("\nO numero " + numero + " nao e mutiplo de 3 ou 5 ao mesmo tempo");
            
        }
        
    }
    
}
