/*

Autor: Pedro Gonella Barao
Data: 28/08/2025
Objetivo: Criar a classe de conta bancaria

 */


package Exercícios_Lista_3;


import java.util.Scanner;



public class ContaBancaria10 {
    
    
    private String titular;
    private float saldo;
    
    
    ContaBancaria10(){};
    public ContaBancaria10(String titular, float saldo)
    {
        
        this.titular = titular;
        this.saldo = saldo;
        
    }
    
    
    
    public String getTitular()
    {
        
        return titular;
        
    }
    public void setTitular(String titular)
    {
        
        this.titular = titular;
        
    }
    
    
    public float getSaldo()
    {
        
        return saldo;
        
    }
    public void setSaldo(float saldo)
    {
        
        this.saldo = saldo;
        
        
        System.out.println("\n" + saldo);
        
    }
    
    
    
    float Depositar(float saldo)
    {
        
        Scanner scanner = new Scanner(System.in);
        float deposito;
        
        
        System.out.println("\nValor de deposito:");
        deposito = scanner.nextFloat();
        
        
        if(deposito > 0)
        {

            saldo = saldo + deposito;
            
        }
        
        else
        {
            
            System.out.println("\nNao foi possivel fazer o deposito");
            
        }
        
        
        return saldo;
        
    }
    
    
    float Sacar(float saldo)
    {

        Scanner scanner = new Scanner(System.in);
        float sacar;
        
        
        System.out.println("\nValor de saque:");
        sacar = scanner.nextFloat();
        
        
        if (saldo < sacar)
        {
            
            System.out.println("\nVoce nao pode sacar essa quantia superior ao seu saldo");
            
        }
        
        else if(sacar > 0)
        {

            saldo -= sacar;
            
        }
        
        else
        {
            
            System.out.println("\nNao foi possivel fazer o deposito");
            
        }
        
        
        return saldo;
        
    }
    
}
