DROP FUNCTION IF EXISTS maior_numero;

DELIMITER //

CREATE FUNCTION maior_numero(numero1 INT, numero2 INT)

	RETURNS INT
    
    DETERMINISTIC
    
    BEGIN
    
		IF numero1 > numero2 THEN RETURN numero1;
            
		ELSE RETURN numero2;
          
		END IF;
        
    END //
    
DELIMITER ;


SELECT maior_numero(10, 3);