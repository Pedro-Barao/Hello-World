/*

Nome: Pedro Gonella Barão
Data: 22/09/2025
Objetivo: Declare um ArrayList<Integer>, adicione 4 números e exiba os valores multiplicados por 2

 */


package Exercícios_Lista_6;


import java.util.ArrayList;


public class Exercício7 {
    
    
    public static void main(String[] args) {
        
        
        ArrayList<Integer> Numeros = new ArrayList<>();
        
        
        Numeros.add(2);
        Numeros.add(43);
        Numeros.add(66);
        Numeros.add(21);
        
        
        for(int i = 0; i < 4; i++)
        {
            
            System.out.println(2 * Numeros.get(i));
            
        }
        
    }
    
}
