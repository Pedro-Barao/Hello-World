/*

Nome: Pedro Gonella Barão
Data: 22/09/2025
Objetivo: Crie uma List<String> com nomes de cores e exiba apenas aquelas que começam com "A"

 */


package Exercícios_Lista_6;


import java.util.ArrayList;
import java.util.List;


public class Exercíciop10 {
    
    public static void main(String[] args) {
        
        
        List<String> Cores = new ArrayList<>();
        boolean verificador;
        
        Cores.add("Azul");
        Cores.add("Amarelo");
        Cores.add("Roxo");
        Cores.add("Cinza");
        Cores.add("Anil");
        
        
        for(int i = 0; i < 5; i++)
        {
         
            verificador = Cores.get(i).substring(0, 1).contains("A");
            
            if(verificador == true)
            {
                
                System.out.println(Cores.get(i));
                
            }
            
        }
        
    }
    
}
