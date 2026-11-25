import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    
    public static void main(String[] args)
    {

        Agencia agencia = new Agencia();
        Random randomizar = new Random();
        StringBuilder codigo = new StringBuilder();

        System.out.println("\nOlá! seja bem-vindo(a) ao sistema do banco " + agencia.getNomeBanco());

        int tamanho_lista = 3;
        double saldo = 0.0, minimo = 100.00, maximo = 10000.00;


        //Cliente

        String[] nomes = { "Ana", "Bruno", "Carlos", "Daniela", "Eduardo", "Fernanda", "Gabriel", "Helena", "Igor", "Julia", "Lucas", "Mariana", "Nicolas", "Olivia", "Pedro", "Rafaela", "Samuel", "Tatiana", "Vitor", "Yasmin" };

        String[] cpf = { "718.392.405-11", "283.491.502-88", "904.182.736-44", "152.938.475-22", "639.201.485-99", "405.829.137-55", "827.493.106-00", "316.592.847-11", "594.103.827-66", "238.495.106-33", "749.205.183-44", "105.839.274-55", "893.472.105-66", "362.918.405-77", "504.829.137-88", "617.394.205-99", "284.105.938-11", "493.827.105-22", "716.493.820-33", "852.194.307-44"};

        String[] emails = { "ana.silva@email.com", "bruno.santos@exemplo.com", "carlos.oliveira@mail.com", "diana.costa@provedor.com", "eduardo.lima@email.com", "fernanda.souza@exemplo.com", "gabriel.almeida@mail.com", "helena.ribeiro@provedor.com", "igor.pereira@email.com", "julia.carvalho@exemplo.com", "lucas.martins@mail.com", "mariana.rocha@provedor.com", "nicolas.gomes@email.com", "olivia.alves@exemplo.com", "pedro.teixeira@mail.com", "rafaela.mendes@provedor.com", "samuel.barros@email.com", "tatiana.nunes@exemplo.com", "vinicius.pinto@mail.com", "beatriz.cardoso@provedor.com" };


        //Conta Bancária
        String numeros = "1234567890";

        Map<Integer, Cliente> cliente_lista = new HashMap<>();
        Map<String, ContaBancaria> conta_lista = new HashMap<>();

        for(int i = 0; i < tamanho_lista; i++)
        {

            //Cliente

            int index_nome = randomizar.nextInt(nomes.length);
            int index_cpf = randomizar.nextInt(cpf.length);
            int index_email = randomizar.nextInt(nomes.length);

            Cliente cliente = new Cliente(cpf[index_cpf], nomes[index_nome], emails[index_email]);

            if(cliente.equals(cliente))
            {

                cliente_lista.put(cliente.hashCode(), cliente);

                for(int o = 0; o < 10; o++)
                {

                    int index_numero = randomizar.nextInt(numeros.length());

                    codigo.append(index_numero);
        
                }

                saldo = minimo + (maximo - minimo) * randomizar.nextDouble();

                codigo.insert(5, "-");

                ContaBancaria conta = new ContaBancaria(String.valueOf(codigo), cliente, saldo);

                conta_lista.put(conta.getNumeroConta(), conta);

                Agencia.registrarContaNova();

                codigo.setLength(0);
                
            }

            else { tamanho_lista++; }

        }

        System.out.println("\n\nClientes registrados:");

        cliente_lista.forEach((codigo_hash, dados) -> 
        {

            System.out.println(dados.toString());

        });

        System.out.println("\n");

        conta_lista.forEach((numero_conta, dados) -> 
        {

            double valor = minimo + (maximo - minimo) * randomizar.nextDouble();
            int acoes = randomizar.nextInt(3);
            boolean saque = false;

            switch (acoes) {

                case 1:

                    dados.depositar(valor);

                    System.out.printf("\nO cliente " + dados.getTitular().getNome() + " realizou um depoisito com o valor de %.2f\n", valor);
                    
                    break;

                case 2:

                    saque = dados.sacar(valor);

                    if(saque == true)
                    {

                        System.out.printf("\nO cliente " + dados.getTitular().getNome() + " realizou um saque de %.2f com mais 5 reais de taxa\n", valor);

                    }

                    else
                    {

                        System.out.println("\nO cliente " + dados.getTitular().getNome() + " falhou ao realizar o saque por ter um saldo insuficiênte");

                    }
            
                default:

                    break;

            }

        });

    }

}
