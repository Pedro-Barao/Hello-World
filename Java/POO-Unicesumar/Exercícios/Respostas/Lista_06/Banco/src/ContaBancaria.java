public class ContaBancaria {
    
    private String numero_Conta;
    private double saldo;
    private Cliente titular;
    

    public ContaBancaria(String numero_Conta, Cliente titular, double saldo)
    {

        this.numero_Conta = numero_Conta;
        this.titular = titular;
        this.saldo = saldo;

    }


    public String getNumeroConta()
    {

        return numero_Conta;

    }
    
    public void setNumeroConta(String numero_Conta)
    {

        this.numero_Conta = numero_Conta;

    }


    public double getSaldo()
    {

        return saldo;

    }


    public Cliente getTitular()
    {

        return titular;

    }

    public void setTitular(Cliente titular)
    {

        this.titular = titular;

    }


    public void depositar(double valor)
    {

        if(valor <= 0)
        {

            return;

        }

        else
        {

            this.saldo = this.saldo + valor;

        }

    }


    public boolean sacar(double valor)
    {

        double taxa = Agencia.taxa_Saque;
        double total = valor + taxa;

        if(total <= saldo)
        {

            this.saldo -= total;

            return true;

        }

        else
        {

            return false;

        }

    }

}
