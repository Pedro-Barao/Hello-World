public class Agencia {

    public static final String nome_Banco = "JavaBank";
    public static final double taxa_Saque = 5.0;
    public static int total_Contas_Abertas;


    public String getNomeBanco()
    {

        return nome_Banco;

    }

    public double getTaxaSaque()
    {

        return taxa_Saque;

    }

    public int total_Contas_Abertas()
    {

        return total_Contas_Abertas;

    }


    public static void registrarContaNova() { total_Contas_Abertas++; }

}
