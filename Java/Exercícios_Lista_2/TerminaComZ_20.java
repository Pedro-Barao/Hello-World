/*

Autor: Gabriel Nascimento, Guilherme Cortez, Henrique Oliveira e Pedro Barao
Data: 22/08/2025
Objetivo: Escrever uma funcao que veerifica se uma String tem a letra "z"

 */

public class TerminaComZ_20
{
    
    public static boolean terminacomz(String nome)
    {
        
        boolean comz = nome.contains("z");
        
        return comz;
        
    }

    public static void main(String[] args) 
     {

        String nome = "Guilherme Cortez";
        boolean comz;
        
        comz = terminacomz(nome);
        
        System.out.println(comz);
        
    }

}

