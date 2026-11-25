/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author falea
 */
public class EstruturaDecisao {
   
    
     public static void main(String[] args) {
        int idade = 16;
        
        if (idade >= 18) {
            System.out.println("Voce e maior de idade.");
        } else {
            System.out.println("Voce e menor de idade.");
        }
        
        int nota = 75;
        if (nota >= 90) {
            System.out.println("Nota A");
        } else if (nota >= 80) {
            System.out.println("Nota B");
        } else if (nota >= 70) {
            System.out.println("Nota C");
        } else {
            System.out.println("Nota D");
        }
        
        int diaDaSemana = 3;
        switch (diaDaSemana) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-feira");
            case 3 -> System.out.println("Terca-feira");
            default -> System.out.println("Dia inválido");
        }
        
    }

}
