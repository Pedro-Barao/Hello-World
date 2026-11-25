/*

Autror: Pedro Gonella Barao
Data: 03/09/2025
Objetivo: Criando classe produto

*/


package Exercícios_Lista_3;


public class Produto21 {
        
    
        Cliente21 cliente = new Cliente21();
        double valorTotal;
        
        
        Produto21(){};
        Produto21(double valorTotal, String nome, String email)
        {
            
            this.valorTotal = valorTotal;
            this.cliente.nome = nome;
            this.cliente.email = email;
            
        }
        
        
        
        double getvalorTotal()
        {
            
            return valorTotal;
            
        }
        
        void setvalorTotal(double valorTotal)
        {
            
            this.valorTotal = valorTotal;
            
        }
        
        
        String getNome()
        {
            
            return cliente.nome;
            
        }
        
        void setNome(String nome)
        {
            
            this.cliente.nome = nome;
            
        }
        
        
        String getEmail()
        {
            
            return cliente.email;
            
        }
        
        void setEmail(String email)
        {
            
            this.cliente.email = email;
            
        }
}
       

