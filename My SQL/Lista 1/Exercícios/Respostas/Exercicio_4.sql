DROP PROCEDURE IF EXISTS deleta_cliente;

DELIMITER //

CREATE PROCEDURE deleta_cliente(clie_id INT)

BEGIN

	DELETE FROM cliente
    WHERE clie_id = id;
    
END //

DELIMITER ;

CALL deleta_cliente(1);