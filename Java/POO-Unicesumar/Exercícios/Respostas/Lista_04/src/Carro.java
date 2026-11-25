package Exercicio_02.src;

public class Carro
{

  String modelo;
  String cor;
  private int velocidade;
    
  public void buzinar()
  {

    System.out.println("\nO " + modelo + " " + cor + " fez: BIIII BIIII!\n");
  
  }

  public void setCor(String cor)
  {

    this.cor = cor;
    
  }

  public String getCor()
  {
    
    return cor;
    
  }

  public void setModelo(String modelo)
  {
      
    this.modelo = modelo;
    
  }

  public String getModelo()
  {
    
    return modelo;
    
  }
    
  public void setVelocidade(int velocidade)
  {
      
    if (velocidade < 0) 
    {
        
      System.out.println("Erro: Velocidade não pode ser negativa");
      
    }
      
    else
    {
        
      this.velocidade = velocidade;
      
    }
    
  }
    
  public int getVelocidade()
  {
      
    return velocidade;
    
  }

  public void passouNoRadar(int velocidade)
  {

    if (velocidade >= 100)
    {

      System.out.println("\nO radar detectou uma velocidade altíssima");

    }

    else if (velocidade >= 60)
    {

      System.out.println("\nO radar detectou uma velocidade alta");

    }

    else if (velocidade >= 20)
    {

      System.out.println("\nO radar detectou uma velocidade normal");

    }

    else
    {

      System.out.println("\nO radar detectou uma velocidade abaixo do normal");
    }

  }

}
