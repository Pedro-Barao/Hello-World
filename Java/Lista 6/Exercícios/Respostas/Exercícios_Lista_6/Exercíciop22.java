/*

Autor: Gabriel Nascimento, Guilherme Cortez, Henrique Oliveira e Pedro Barao
Data: 02/09/2025
Objetivo: Faca um ArrayList que recebe o nome de frutas e imprima-os

 */


package Exercícios_Lista_6;


import java.util.ArrayList;
import java.util.Scanner;


public class Exercíciop22 {
    
    
    public static void main(String[] args)
    {
        
        ArrayList<String> nomes_frutas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("\nOla usuario! Informe o nome de 5 frutas e imprimiremos seus 5 nomes:");
        nomes_frutas.add(scanner.nextLine());
        
        System.out.println("\nSegundo nome:");
        nomes_frutas.add(scanner.nextLine());
        
        System.out.println("\nTerceiro nome:");
        nomes_frutas.add(scanner.nextLine());
        
        System.out.println("\nQuarto nome:");
        nomes_frutas.add(scanner.nextLine());
        
        System.out.println("\nQuinto nome:");
        nomes_frutas.add(scanner.nextLine());
        
        
        System.out.println("\n" + nomes_frutas.get(0));
        System.out.println(nomes_frutas.get(1));
        System.out.println(nomes_frutas.get(2));
        System.out.println(nomes_frutas.get(3));
        System.out.println(nomes_frutas.get(4));
        
        
    }
}
