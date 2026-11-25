/*

Autor: Gabriel Nascimento, Guilherme Cortez, Herique Oliveira e Pedro Barao
Data: 02/09/2025
Objetivo: Criar um ArrayList que recebe 5 numeros e exiba-os

 */


package Exercícios_Lista_6;


import java.util.ArrayList;
import java.util.Scanner;


public class Exercíciop21 {
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
    
        
        System.out.println("\nOla usuario! Mande os numeros e vamos imprimi-los em sua tela, numero 1:");
        numeros.add(scanner.nextInt());
    
        System.out.println("\nnumero 2:");
        numeros.add(scanner.nextInt());
        
        System.out.println("\nnumero 3:");
        numeros.add(scanner.nextInt());
        
        System.out.println("\nnumero 4:");
        numeros.add(scanner.nextInt());
        
        System.out.println("\nnumero 5:");
        numeros.add(scanner.nextInt());
        
        
        System.out.println("\n" + numeros.get(0));
        System.out.println(numeros.get(1));
        System.out.println(numeros.get(2));
        System.out.println(numeros.get(3));
        System.out.println(numeros.get(4));
        
    }
    
}
