/*

Nome: Pedro Gonella Barão
Data: 22/09/2025
Objetivo: Crie um Map<Integer, String>, adicione 3 pares chave-valor e percorra exibindo-os

 */


package Exercícios_Lista_6;


import java.util.HashMap;
import java.util.Map;


public class Exercíciop11 {
    
    
    public static void main(String[] args) {
        
        
        Map<Integer, String> PontosporJogador = new HashMap<>();
        
        
        PontosporJogador.put(1, "Joao");
        PontosporJogador.put(10, "Caio");
        PontosporJogador.put(3, "Matheus");
        
        
        System.out.println(PontosporJogador);
        
    }
    
}
