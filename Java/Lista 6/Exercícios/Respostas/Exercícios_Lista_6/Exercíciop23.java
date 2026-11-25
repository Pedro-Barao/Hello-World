/*

Autor: Gabriel Nascimento, Guilherme Cortez, Henrique Oliveira e Pedro Barao
Data: 02/09/2025
Objetivo: Criar um ArrayList Double que recebe e soma todos os valores

 */


package Exercícios_Lista_6;


import java.util.ArrayList;
import java.util.Scanner;


public class Exercíciop23 {
    
    
    public static void main(String[] args)
    {
     
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        double soma = 0;
        
        
        System.out.println("\nOla usuario! Digite 4 numeros e retornaremos sua soma:");
        numeros.add(scanner.nextDouble());
        
        System.out.println("\nNumero 2:");
        numeros.add(scanner.nextDouble());
        
        System.out.println("\nNumero 3:");
        numeros.add(scanner.nextDouble());
        
        System.out.println("\nNumero 4:");
        numeros.add(scanner.nextDouble());
        
        
        soma = numeros.get(0) + numeros.get(1) + numeros.get(2) + numeros.get(3);
        
        
        System.out.println("A soma de todos os numeros e igual a = " + soma);
        
    }
}
