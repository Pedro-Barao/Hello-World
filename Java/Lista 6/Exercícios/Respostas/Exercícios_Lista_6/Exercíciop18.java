/*

Nome: Pedro Gonella Barão
Data: 22/09/2025
Objetivo: Crie uma Queue<Character>, adicione as letras "A", "B", "C", "D", "E" e percorra-as

 */


package Exercícios_Lista_6;


import java.util.LinkedList;
import java.util.Queue;


public class Exercíciop18 {
    
    
    public static void main(String[] args) {
        
        
        Queue<Character> Letras = new LinkedList<>();
        
        
        Letras.add('A');
        Letras.add('B');
        Letras.add('C');
        Letras.add('D');
        Letras.add('E');
        
        
        for(int i = 0; i < 5; i++)
        {
            
            System.out.println(Letras.poll());
            
        }
        
    }
    
}
