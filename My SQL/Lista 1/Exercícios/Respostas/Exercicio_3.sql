DROP PROCEDURE IF EXISTS inserir_cliente;

DELIMiTER //

CREATE PROCEDURE inserir_cliente(id INT, nome VARCHAR(30), email VARCHAR(30))

BEGIN

	INSERT INTO cliente(id, nome, email)
    VALUES(id, nome, email);
    
END //

DELIMITER ;

CALL inserir_cliente(1, 'Caio', 'caio@100');