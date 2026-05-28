DROP FUNCTION IF EXISTS soma_numeros;

DELIMITER //
CREATE FUNCTION soma_numeros(numero1 INT, numero2 INT, numero3 INT) 

    RETURNS INT
    DETERMINISTIC
    
    BEGIN

		RETURN numero1 + numero2 + numero3;
    
	END //

DELIMITER ;

SELECT soma_numeros(1, 2, 3);