package Models;

public class FreteSedex implements EstrategiaFrete {
    
    @Override
    public double Calcular(double valorPedido)
    {

        return valorPedido + (valorPedido * 0.1) + 15;

    }

}
