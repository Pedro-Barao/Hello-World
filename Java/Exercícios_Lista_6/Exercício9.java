/*

Nome: Pedro Gonella Barão
Data: 22/09/2025
Objetivo: Crie uma List<Character> e adicione as vogais, depois percorra e exiba os caracteres

 */


package Exercícios_Lista_6;


import java.util.ArrayList;
import java.util.List;


public class Exercício9 {
 
    
    public static void main(String[] args) {
        
        
        List<Character> Vogais = new ArrayList<>();
        
        
        Vogais.add('a');
        Vogais.add('e');
        Vogais.add('i');
        Vogais.add('o');
        Vogais.add('u');
        
        
        for(int i = 0; i < 5; i++)
        {
         
            System.out.println(Vogais.get(i));
            
        }
        
    }
    
}
