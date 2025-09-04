/*

Autor: Gabriel Nascimento, Guilherme Cortez, Henrique Oliveira e Pedro Barao
Data: 02/09/2025
Objetivo: Criar um ArrayList Character e adicionando as consoantes e depois mostre todas

 */


package Exercícios_Lista_6;


import java.util.ArrayList;
import java.util.Scanner;


public class Exercíciop24 {
    
    
    public static void main(String[] args)
    {
     
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> consoantes = new ArrayList<>();
        
        
        System.out.println("\nOla usuario! Digite 5 consoantes e iremos imprimi-las:");
        consoantes.add(scanner.next().charAt(0));
        
        System.out.println("\nConsoante 2:");
        consoantes.add(scanner.next().charAt(0));
        
        System.out.println("\nConsoante 3:");
        consoantes.add(scanner.next().charAt(0));
        
        System.out.println("\nConsoante 4:");
        consoantes.add(scanner.next().charAt(0));
        
        System.out.println("\nConsoante 5:");
        consoantes.add(scanner.next().charAt(0));
        
        
        
        System.out.println("\n" + consoantes.get(0));
        System.out.println(consoantes.get(1));
        System.out.println(consoantes.get(2));
        System.out.println(consoantes.get(3));
        System.out.println(consoantes.get(4));
        
    }
}
