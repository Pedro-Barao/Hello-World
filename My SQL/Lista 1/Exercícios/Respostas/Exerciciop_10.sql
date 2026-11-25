DROP TRIGGER IF EXISTS tr_produtos_valida_estoque;

DELIMITER //

CREATE TRIGGER tr_produtos_valida_estoque
	BEFORE INSERT ON produtos
	FOR EACH ROW
    
	BEGIN
		IF NEW.estoque < 0 THEN
			SIGNAL SQLSTATE '45000' 
			SET MESSAGE_TEXT = 'ERRO: Não é permitido inserir produto com estoque negativo';
		END IF;
	END //

DELIMITER ;
