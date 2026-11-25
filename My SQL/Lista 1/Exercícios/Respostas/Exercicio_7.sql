DROP FUNCTION IF EXISTS valor_taxado;

DELIMITER //

CREATE FUNCTION valor_taxado(valor INT)

	RETURNS INT
    
    DETERMINISTIC
    
    BEGIN
    
		RETURN valor + (valor * 0.1);
        
    END //
    
DELIMITER ;


SELECT valor_taxado(10);