/*

Autor: Pedro Gonella Barao
Data: 26/08/2025
Objetivo: Uma funcao que retorna a raiz quadrada de um numero sem sqrt
 */


package Exercícios_Lista_2;


import java.util.Scanner;


public class Exercíciop26 {
    
    
    public static int RaizQuadrada(int numero)
    {
        
        int raiz_numero;
        
        
        raiz_numero = (int) Math.pow(numero, 0.5);
        
        
        return raiz_numero;
        
    }
    
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        int numero, raiz_numero;
        
        
        System.out.println("\nOla usuario! Insira um numero e direi sua raiz quadrada:");
        numero = scanner.nextInt();
        
        
        raiz_numero = RaizQuadrada(numero);
        
        
        
        System.out.println("\nA raiz do numero " + numero + " e " + raiz_numero);
        
    }
    
}
