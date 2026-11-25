package br.com.starlog.exception;

import java.lang.RuntimeException;

public class CapacidadeExcedidaException extends RuntimeException {
    
    public CapacidadeExcedidaException(String mensagem)
    {

        super(mensagem);
        
    }

}
