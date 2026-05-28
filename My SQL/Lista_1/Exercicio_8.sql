DROP PROCEDURE IF EXISTS tamanho;

DELIMITER //

CREATE PROCEDURE tamanho(valor INT)

BEGIN
    
    IF valor > 1000
		THEN SELECT 'ALTO' AS Resultado;
    
	ELSEIF valor > 500
		THEN SELECT 'MEDIO' AS Resultado;
        
	ELSE
		SELECT 'BAIXO' AS Resultado;
        
	END IF;
    
END //

DELIMITER ;

CALL tamanho(2000);