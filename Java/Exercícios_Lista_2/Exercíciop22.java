/*

Autor: Pedro Gonella Barao
Data: 26/08/2025
Objetivo: Uma funcao que retorna true se o numero enviado for impar e maior que 50
 */


package Exercícios_Lista_2;


import java.util.Scanner;


public class Exercíciop22 {
    
    
    public static boolean Impar50(int numero)
    {
        
        boolean verificador;
        
        
        verificador = (numero > 50) && (numero % 2 != 0);
        
        
        return verificador;
        
    }
    
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean verificador;
        
        
        System.out.println("\nOla usuario! Insira um numero e diremos se ele e impar e maior que 50:");
        numero = scanner.nextInt();
        
        
        verificador = Impar50(numero);
        
        
        if (verificador == true)
        {
            
            System.out.println("\nO numero " + numero + " e impar e maior que 50");
            
        }
        
        else
        {
         
            System.out.println("\nO numero " + numero + " nao e impar ou maior que 50");
            
        }
        
    }
    
}
