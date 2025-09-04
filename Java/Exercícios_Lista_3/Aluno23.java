/*

Autor: Pedro Gonella Barao
Data: 03/09/2025
Objetivo: Criando classe alunos

 */


package Exercícios_Lista_3;


public class Aluno23 {
    
    
    private String nome;
    private int matricula;
    private int nota1;
    private int nota2;
    
    
    Aluno23(){};
    Aluno23(String nome, int matricula, int nota1, int nota2)
    {
        
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        
    }
    
    
    String getNome()
    {
        
        return nome;
        
    }
    void setNome(String nome)
    {
        
        this.nome = nome;
        
    }
    
    
    int getMatricula()
    {
        
        return matricula;
        
    }
    void setMatricula(int matricula)
    {
        
        this.matricula = matricula;
        
    }
    
    
    int getNota1()
    {
        
        return nota1;
        
    }
    void setNota1(int nota1)
    {
        
        this.nota1 = nota1;
        
    }
    
    
    int getNota2()
    {
        
        return nota2;
        
    }
    void setNota2(int nota2)
    {
        
        this.nota2 = nota2;
        
    }

           
    float CalcularMedia(int nota1, int nota2)
    {
        
        float media;
        
        media = (nota1 + nota2) / 2;
        
        return media;
        
    }
}
