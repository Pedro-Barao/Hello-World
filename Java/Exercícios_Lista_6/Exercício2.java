/*

Nome: Pedro Gonella Barão
Data: 19/09/2025
Objetivo: Um array double com 4 posições e imprima cada elemento

 */


package Exercícios_Lista_6;


import java.util.Scanner;


public class Exercício2 {
    
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[4];
        
        
        System.out.println("Ola usuario! Preencha o valor de um numero sendo ele inteiro ou nao:\n");
        
        System.out.println("Numero 1: ");
        numeros[0] = scanner.nextDouble();
        
        System.out.println("Numero 2: ");
        numeros[1] = scanner.nextDouble();
        
        System.out.println("Numero 3: ");
        numeros[2] = scanner.nextDouble();
        
        System.out.println("Numero 4: ");
        numeros[3] = scanner.nextDouble();
        
        
        System.out.println("\nNumero 1: " + numeros[0]);
        
        System.out.println("Numero 2: " + numeros[1]);
        
        System.out.println("Numero 3: " + numeros[2]);
        
        System.out.println("Numero 4: " + numeros[3]);
        
    }
    
}
