package Models;

public class FretePac implements EstrategiaFrete{
    
    @Override
    public double Calcular(double valorPedido)
    {

        return valorPedido + (valorPedido * 0.05) + 15;
        
    }

}
