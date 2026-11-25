package br.com.techbank.database;

public class GerenciadorConexao {
    
    private static GerenciadorConexao instanciaUnica;

    private GerenciadorConexao() 
    {
        
        System.out.println("\n>>> [HARDWARE] Abrindo conexão física pesada com o Banco de Dados... (Executa apenas 1 vez!)\n");
        
    }


    public static GerenciadorConexao getInstance() 
    {
        
        if (instanciaUnica == null) 
        {

            instanciaUnica = new GerenciadorConexao();
            
        }
        
        return instanciaUnica;
        
    }

    public void executarComando(String sql) 
    {
        
        System.out.println("Executando no banco central: " + sql);
        
    }

}
