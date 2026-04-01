-- EXERCICIO 1 --

DROP FUNCTION IF EXISTS concatenando_livro_autor;

DELIMITER //

CREATE FUNCTION concatenando_livro_autor (titulo_livro VARCHAR(50), nome_autor VARCHAR(25))
	RETURNS VARCHAR(100)
    DETERMINISTIC
		RETURN CONCAT_WS(' - ', titulo_livro, nome_autor);
	END //

DELIMITER ;

SELECT concatenando_livro_autor(l.Titulo, a.Nome_Autor) 
	FROM Livro l
	JOIN Autor_Livro al
    ON l.Id_Livro = al.FK_Livro_Id
    JOIN Autor a
    WHERE a.Id_Autor = al.FK_Autor_Id;
    


-- EXERCICIO 2 --

DROP PROCEDURE IF EXISTS novo_cliente;

DELIMITER //

CREATE PROCEDURE novo_cliente (nome_cliente VARCHAR(25), telefone VARCHAR(15))
	INSERT INTO Cliente (nome_cliente, telefone)
    VALUES (nome_cliente, telefone);
    END //
    
DELIMITER ;
    
CALL novo_cliente ('Pedro', '(44) 991019768');



-- EXERCICIO 3 --

DROP PROCEDURE IF EXISTS nova_venda;
DROP PROCEDURE IF EXISTS novo_livro;

DELIMITER //

CREATE PROCEDURE nova_venda (data_venda DATE, total_venda FLOAT, fk_cliente_id INT)
	BEGIN
	INSERT INTO Venda (data_venda, total_venda, fk_cliente_id)
    VALUES (data_venda, total_venda, fk_cliente_id);
    
    END //
    
CREATE PROCEDURE itens_venda (fk_venda_id INT, fk_livro_itens_venda_id INT, quantidade INT, subtotal FLOAT)
	BEGIN
	INSERT INTO Itens_Venda (fk_venda_id, fk_livro_itens_venda_id, quantidade, subtotal)
	VALUES (fk_venda_id, fk_livro_itens_venda_id, quantidade, subtotal);
	
    END //

DELIMITER ;

CALL nova_venda ('2026-01-02', 200.00, 1);
CALL itens_venda (1, 1, 10, 200);



-- EXERCICIO 4 --

DROP TRIGGER IF EXISTS limitador_de_estoque;

DELIMITER //

CREATE TRIGGER aumento_de_estoque
	AFTER INSERT ON Itens_Venda
    FOR EACH ROW
    BEGIN
		UPDATE Livro
        SET estoque = estoque - NEW.Quantidade
        WHERE Id_Livro = NEW.FK_Livro_Itens_Venda_Id;

	END //
    
DELIMITER ;

ALTER TABLE Livro ADD COLUMN estoque INT DEFAULT 100;

INSERT INTO Itens_Venda (FK_Venda_Id, FK_Livro_Itens_Venda_Id, Quantidade, Subtotal)
	VALUES (1, 1, 20, 200);
    
INSERT INTO Itens_Venda (FK_Venda_Id, FK_Livro_Itens_Venda_Id, Quantidade, Subtotal)
	VALUES (1, 1, 40, 200);
    

-- EXERCICIO 5 --

DROP TRIGGER IF EXISTS maior_que_limite;

DELIMITER //

CREATE TRIGGER maior_que_limite
	BEFORE INSERT ON Itens_Venda
    FOR EACH ROW
    BEGIN
		DECLARE estoque_atual INT;
        
        SELECT estoque INTO estoque_atual
        FROM Livro
		WHERE Id_Livro = NEW.FK_Livro_Itens_Venda_Id;
        
		IF NEW.Quantidade > estoque_atual THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Estoque insuficiênte';
		END IF;
        
	END //
    
DELIMITER ;

ALTER TABLE Livro ADD COLUMN estoque INT DEFAULT 100;

INSERT INTO Itens_Venda (FK_Venda_Id, FK_Livro_Itens_Venda_Id, Quantidade, Subtotal)
	VALUES (1, 1, 40, 200);
    
    
    
-- EXERCICIO 6 --

DROP USER IF EXISTS 'app_user'@'localhost';

CREATE USER 'app_user'@'localhost' IDENTIFIED BY '1234';

GRANT SELECT, INSERT ON livraria_bairro.cliente TO 'app_user'@'localhost';
GRANT SELECT, INSERT ON livraria_bairro.venda TO 'app_user'@'localhost';

FLUSH PRIVILEGES;



-- EXERCICIO 7 --

DROP USER IF EXISTS 'relatorio_user'@'localhost';

CREATE USER 'relatorio_user'@'localhost';

GRANT SELECT ON livraria_bairro.autor TO 'relatorio_user'@'localhost';
GRANT SELECT ON livraria_bairro.autor_livro TO 'relatorio_user'@'localhost';
GRANT SELECT ON livraria_bairro.cliente TO 'relatorio_user'@'localhost';
GRANT SELECT ON livraria_bairro.editora TO 'relatorio_user'@'localhost';
GRANT SELECT ON livraria_bairro.genero TO 'relatorio_user'@'localhost';
GRANT SELECT ON livraria_bairro.itens_venda TO 'relatorio_user'@'localhost';
GRANT SELECT ON livraria_bairro.livro TO 'relatorio_user'@'localhost';
GRANT SELECT ON livraria_bairro.venda TO 'relatorio_user'@'localhost';

FLUSH PRIVILEGES;

REVOKE SELECT ON livraria_bairro.cliente FROM 'relatorio_user'@'localhost';

FLUSH PRIVILEGES;

