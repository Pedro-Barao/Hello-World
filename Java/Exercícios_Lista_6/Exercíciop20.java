/*

Nome: Pedro Gonella Barão
Data: 22/09/2025
Objetivo: Crie uma Queue<String> representando clientes em uma fila e percorra para exibir os nomes

 */


package Exercícios_Lista_6;


import java.util.LinkedList;
import java.util.Queue;


public class Exercíciop20 {
    
    
    public static void main(String[] args) {
        
        
        Queue<String> Nomes = new LinkedList<>();
        
        
        Nomes.add("Pailo");
        Nomes.add("Andre");
        Nomes.add("Marta");
        Nomes.add("Carla");
        Nomes.add("Serverino");
        
        
        for(int i = 0; i < 5; i++)
        {
            
            System.out.println(Nomes.poll());
            
        }
        
    }
    
}
