/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author falea
 */
public class EstruturaRepeticao {
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Contagem: " + i);
        }
        
        int contador = 0;
        while (contador < 5) {
            System.out.println("Contagem: " + contador);
            contador++;
        }

        int conta = 0;
        do {
            System.out.println("Contagem: " + conta);
            conta++;
        } while (conta < 5);


    }
}
