package Main;

import Model.Credencial;
import Model.Departamento;
import Model.Funcionario;
import Model.SistemaSeguranca;
import Model.Veiculo;

public class Main {
    
    public static void main(String[] args)
    {

        SistemaSeguranca Seguranca = new SistemaSeguranca(2);

        Departamento TI = new Departamento("TI", "Tecnologia da Inforamacao", 0);

        Funcionario Claudio = new Funcionario("1A", "Claudio", TI);

        Veiculo carro_1 = new Veiculo("260-ABC", "Honda", Claudio);


        Credencial c1 = new Credencial("FFF-999", true, Claudio);
        Credencial clone = new Credencial("FFF-999", true, Claudio);


        Seguranca.registrarCatraca(Claudio);
        Seguranca.registrarCatraca(Claudio);

        Seguranca.acessarCofre(c1);
        Seguranca.acessarCofre(clone);

        Seguranca.estacionarVeiculo(carro_1, 0);
        Seguranca.estacionarVeiculo(carro_1, 5);

    }

}
