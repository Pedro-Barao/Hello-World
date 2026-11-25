/*

Nome: Pedro Gonella Barão
Data: 22/09/2025
Objetivo: Declare uma Queue<Integer>, adicione 4 números e exiba cada um

 */


package Exercícios_Lista_6;


import java.util.LinkedList;
import java.util.Queue;


public class Exercíciop17 {
    
    
    public static void main(String[] args) {
        
        
        Queue<Integer> Numeros = new LinkedList<>();
        
        
        Numeros.add(2131);
        Numeros.add(4);
        Numeros.add(312);
        Numeros.add(76);
        
        
        for(int i = 0; i < 4; i++)
        {
         
            System.out.println(Numeros.poll());
            
        }
        
    }
    
}
