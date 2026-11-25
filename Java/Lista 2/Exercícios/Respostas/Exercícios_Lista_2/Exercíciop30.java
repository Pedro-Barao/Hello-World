/*

Autor: Pedro Gonella Barao
Data: 27/08/2025
Objetivo: Uma funcao que retorna true se um numero estiver entre 10 e 30 ou seja negativo

 */


package Exercícios_Lista_2;


import java.util.Scanner;


public class Exercíciop30 {
    
    
    public static boolean VerificarNumero(int numero)
    {
        
        boolean verificador;
        
        
        verificador = ((numero >= 10) && (numero <= 30)) || (numero < 0);
        
        
        return verificador;
        
    }
    
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean verificador;
        
        
        System.out.println("\nOla usuario! Insira um numero e diremos se ele esta entre 10 e 30 ou seja negativo:");
        numero = scanner.nextInt();
        
        
        verificador = VerificarNumero(numero);
        
        
        if (verificador == true)
        {
            
            System.out.println("\nO numero escolhido esta entre 10 e 30 ou e negativo");
            
        }
        
        else
        {
            
            System.out.println("\nO numero escolhido nao esta entre 10 e 30 ou e negativo");
            
        }
        
    }
    
}
