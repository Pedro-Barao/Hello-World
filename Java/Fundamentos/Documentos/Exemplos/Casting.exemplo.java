/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author falea
 */
public class ExemploCasting {
    
    public static void main(String[] args) {
        int numero = 100;
        long numeroLong = numero; // casting implícito
        System.out.println("Numero long: " + numeroLong);

        double preco = 9.99;
        int precoInt = (int) preco; // casting explícito
        System.out.println("Preco original: " + preco);
        System.out.println("Preco inteiro: " + precoInt);
    }
}
