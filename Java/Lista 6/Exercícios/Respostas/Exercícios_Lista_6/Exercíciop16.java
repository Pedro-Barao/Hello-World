/*

Nome: Pedro Gonella Barão
Data: 22/09/2025
Objetivo: Crie uma Queue<String>, adicione 5 nomes e percorra com um for

 */


package Exercícios_Lista_6;


import java.util.LinkedList;
import java.util.Queue;


public class Exercíciop16 {
    
    
    public static void main(String[] args) {
        
        
        Queue<String> Nomes = new LinkedList<>();
        
        
        Nomes.add("Caio");
        Nomes.add("Antonio");
        Nomes.add("Mauricio");
        Nomes.add("Antinieta");
        Nomes.add("Laura");
        
        for(int i = 0; i < 5; i++)
        {
         
            System.out.println(Nomes.poll());
            
        }
    }
    
}
