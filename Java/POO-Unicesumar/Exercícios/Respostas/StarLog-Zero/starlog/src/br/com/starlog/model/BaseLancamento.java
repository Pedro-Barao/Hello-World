package br.com.starlog.model;

import java.util.HashMap;
import java.util.Map;

public class BaseLancamento {

    private Map<String, ModuloCarga> modulos = new HashMap<>();
    

    public void cadastraModulo(ModuloCarga modulo_Carga)
    {

        if(modulo_Carga == null || modulos.containsKey(modulo_Carga.getIdModulo()))
        {

            System.out.println("\nErro no preenchimento do módulo\n");

        }

        modulos.put(modulo_Carga.getIdModulo(), modulo_Carga);

        System.out.println("\nModulo adicionado com sucesso!\n");

    }

    public void buscarModulo(String idModulo)
    {

        if(modulos.containsKey(idModulo))
        {

            System.out.println("\nModulo com o id: " + idModulo + " já existente\n");

        }

        else
        {

            System.out.println("\nModulo não registrado no sistema\n");

        }

    }

}
