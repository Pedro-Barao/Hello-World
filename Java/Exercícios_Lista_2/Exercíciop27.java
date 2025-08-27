/*

Autor: Pedro Gonella Barao
Data: 26/08/2025
Objetivo: Uma funcao que retorna um numero elevado a outro numero sem Math.pow

 */


package Exercícios_Lista_2;


import java.util.Scanner;


public class Exercíciop27 {
    
    
    public static int Potencia(int numero1, int numero2)
    {
        
        int resultado = 0;
        
        
        for (int i = 0; i < numero2; i++)
        {
            
            resultado += numero1;
            
        }
        
        return resultado;
    }
    
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, resultado;
        
        
        System.out.println("\nOla usuario! Insisra um numero e vamos elevar ele ao segundo numero enviado:");
        numero1 = scanner.nextInt();
        
        System.out.println("\nAgora o segundo numero:");
        numero2 = scanner.nextInt();
        
        
        resultado = Potencia(numero1, numero2);
        
        
        System.out.println("\nO numero " + numero1 + " elevado a " + numero2 + " e igual a " + resultado);
        
    }
    
}
