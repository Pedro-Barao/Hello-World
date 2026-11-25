/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiposentradajava;

/**
 *
 * @author falea
 */
import java.util.Scanner;


public class TiposEntradaJava {

    public static void main(String[] args) {
        // Solicita ao usuário que insira seu nome
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita ao usuário que insira seu nome
            System.out.println("Digite seu nome:");
            // Lê a entrada do usuário como uma string
            String nome = scanner.nextLine();
            System.out.println("Ola, " + nome + "!");
            
            System.out.println("Digite seu  um numero:");
            int numero = scanner.nextInt();
            System.out.println("inteiro, " + numero + "!");
            
            System.out.println("Digite seu  um numero:");
            double valor = scanner.nextFloat();

            System.out.println("double, " + valor + "!");
        }
    }
}



