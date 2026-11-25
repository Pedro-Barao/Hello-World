package Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SistemaSeguranca {
    
    private Veiculo[] vagasGaragem;

    private List<Funcionario> catracaPrincipal = new ArrayList<>();

    private Set<Credencial> cofreFisico = new HashSet<>();


    public SistemaSeguranca(int totalVagas)
    {

        this.vagasGaragem = new Veiculo[totalVagas];

    }


    public void estacionarVeiculo(Veiculo veiculo, int vaga)
    {

        if(vaga >= 0 && vaga < vagasGaragem.length)
        {

            System.out.println("Garagem: Veiculo [" + veiculo.getPlaca() + "] esta estacionado na vaga " + vaga);

            vagasGaragem[vaga] = veiculo;

        }

        else
        {

            System.out.println("A vaga " + vaga + " e invalida");

        }

    }

    public void registrarCatraca(Funcionario funcionario)
    {
     
        catracaPrincipal.add(funcionario);

        System.out.println("Catraca: Acesso Liberado");

    }

    public void acessarCofre(Credencial credencial)
    {

        boolean acessado = cofreFisico.contains(credencial);

        if(acessado == false)
        {

            System.out.println("Credencial: Acesso CONCEDIDO. Bem-vindo(a) " + credencial.getTitular());

            cofreFisico.add(credencial);

        }

        else
        {

            System.out.println("ALERTA MAXIMO: Credencial " + credencial + " bloqueada! Tentativa de clonagem detecatada");

            cofreFisico.remove(credencial);

        }
        
    }

}
