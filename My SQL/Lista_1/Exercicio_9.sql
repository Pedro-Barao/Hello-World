DROP TRIGGER IF EXISTS tr_vendas_data_atual;

DELIMITER //

CREATE TRIGGER tr_vendas_data_atual
	BEFORE INSERT ON vendas
	FOR EACH ROW
    
	BEGIN
    
		SET NEW.data_venda = CURDATE();
    
	END //

DELIMITER ;
