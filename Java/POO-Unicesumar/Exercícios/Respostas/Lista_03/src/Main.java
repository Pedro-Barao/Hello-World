package Exercicio_01.src;

public class Main
{
  public static void main(String[] args)
  {
    Carro meuCarro = new Carro();
    meuCarro.modelo = "Fusca";
    meuCarro.cor = "Azul";

    meuCarro.buzinar();

    Carro meuCarro2 = new Carro();
    meuCarro2.modelo = "Camaro";
    meuCarro2.cor = "Amarelo";

    meuCarro2.buzinar();

  }

}
