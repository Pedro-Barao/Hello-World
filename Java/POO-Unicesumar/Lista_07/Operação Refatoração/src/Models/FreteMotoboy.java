package Models;

public class FreteMotoboy implements EstrategiaFrete{

    @Override
    public double Calcular(double valorPedido)
    {

        return valorPedido + 15;
        
    }
    
}
