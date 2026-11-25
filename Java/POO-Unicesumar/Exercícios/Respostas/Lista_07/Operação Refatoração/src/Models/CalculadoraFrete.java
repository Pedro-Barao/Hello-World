package Models;

public class CalculadoraFrete {
    
    public double ProcessarFrete(double pedido, EstrategiaFrete estrategiaFrete) {

        if(estrategiaFrete == null)
        {

            throw new TipoFreteInvalidoException("Tipo de frete não identificado");

        }

        return estrategiaFrete.Calcular(pedido);

    }

}
