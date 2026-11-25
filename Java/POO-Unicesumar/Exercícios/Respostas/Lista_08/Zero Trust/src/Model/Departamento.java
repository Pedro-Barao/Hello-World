package Model;

public class Departamento {
    
    private String sigla;
    private String nomeSetor;
    private int andar;

    public Departamento(String sigla, String nomeSetor, int andar)
    {

        this.sigla = sigla;
        this.nomeSetor = nomeSetor;
        this.andar = andar;

    }


    public String getSigla()
    {

        return sigla;

    }

    public void setSigla(String sigla)
    {

        this.sigla = sigla;

    }


    public String getNomeSetor()
    {

        return nomeSetor;

    }

    public void setNomeSetor(String nomeSetor)
    {

        this.nomeSetor = nomeSetor;

    }


    public int getAndar()
    {

        return andar;

    }

    public void setAndar(int andar)
    {

        this.andar = andar;
        
    }

}