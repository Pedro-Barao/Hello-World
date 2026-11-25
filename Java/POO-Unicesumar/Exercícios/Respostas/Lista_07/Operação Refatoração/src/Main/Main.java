package Main;

import Models.CalculadoraFrete;
import Models.FreteMotoboy;
import Models.FretePac;
import Models.FreteSedex;
import Models.TipoFreteInvalidoException;

public class Main {
    
    public static void main(String[] args)
    {

        CalculadoraFrete calcular_frete = new CalculadoraFrete();
        FreteSedex sedex = new FreteSedex();
        FretePac pac = new FretePac();
        FreteMotoboy motoboy = new FreteMotoboy();

        double valor = 100.00;

        try {

            System.out.println("\nSexdex: " + calcular_frete.ProcessarFrete(valor, sedex));
            System.out.println("\nPac: " + calcular_frete.ProcessarFrete(valor, pac));
            System.out.println("\nPac: " + calcular_frete.ProcessarFrete(valor, motoboy));

            System.out.println("\nInvalido: " + calcular_frete.ProcessarFrete(valor, null));

        }

        catch (TipoFreteInvalidoException error) {

            System.out.println("\nErro capturado: " + error.getMessage());
            
        }

    }

}
