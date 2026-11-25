public class Cliente {
    
    private String CPF;
    private String nome;
    private String email;


    public Cliente(String CPF, String nome, String email)
    {

        this.CPF = CPF;
        this.nome = nome;
        this.email = email;

    }


    public String getCPF()
    {

        return CPF;

    }


    public String getNome()
    {

        return nome;

    }

    public void setNome(String nome)
    {

        this.nome = nome;

    }


    public String getEmail()
    {

        return email;

    }

    public void setEmail(String email)
    {

        this.email = email;

    }

    @Override
    public boolean equals(Object objeto)
    {
        
        if(this == objeto)
        {

            return true;

        }

        if(objeto == null || getClass() != objeto.getClass())
        {

            return false;

        }

        Cliente compara_cliente = (Cliente) objeto;

        return this.CPF != null && this.CPF.equals(compara_cliente.CPF);

    }

    @Override
    public String toString()
    {

        return String.format("\nCliente: " + nome + " | Contato: " + email);

    }

    @Override
    public int hashCode()
    {

        if(CPF == null)
        {

            return 0;

        }

        else
        {

            return CPF.hashCode();

        }

    }

}
