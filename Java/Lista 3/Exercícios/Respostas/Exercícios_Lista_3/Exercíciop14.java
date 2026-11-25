/*

Autor: Pedro Gonella Barao
Data: 01/09/2025
Objetivo: Acessar um atributo sem modificador

 */


package Exercícios_Lista_3;


import java.util.Scanner;


public class Exercíciop14 {
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        AtributoSemModificador14 Usuario = new AtributoSemModificador14();
        int numero;
        
        
        System.out.println("\nOla usuario! Diga o valor de um numero:");
        numero = scanner.nextInt();
        
        
        Usuario.setNumero(numero);
        
        Usuario.ImprimirNumero(numero);
        
    }
}
