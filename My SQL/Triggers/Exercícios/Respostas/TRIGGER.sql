DROP TRIGGER IF EXISTS depois_inserir_livro;
DROP TRIGGER IF EXISTS depois_deletar_livro;
DROP TABLE IF EXISTS log_livro_inserir;
DROP TABLE IF EXISTS log_livro_deletar;

CREATE TABLE log_livro_inserir (

   Id INT PRIMARY KEY AUTO_INCREMENT,
   Titulo_log VARCHAR(50),
   dataCadastro DATE
   
);

CREATE TABLE log_livro_deletar (

   Id INT PRIMARY KEY AUTO_INCREMENT,
   Titulo_log VARCHAR(50),
   dataCadastro DATE
   
);


DELIMITER $$
CREATE TRIGGER depois_inserir_livro
	AFTER INSERT ON Livro
    FOR EACH ROW
    BEGIN
		INSERT INTO log_livro_inserir (Id, Titulo_log, dataCadastro)
        VALUES (NEW.Id_Livro, NEW.Titulo, CURRENT_DATE());
END $$
DELIMITER ;

DELIMITER $$
CREATE TRIGGER depois_deletar_livro
	AFTER DELETE ON Livro
    FOR EACH ROW
    BEGIN
		INSERT INTO log_livro_deletar (Id, Titulo_log, dataCadastro)
        VALUES (OLD.Id_Livro, OLD.Titulo, CURRENT_DATE());
END $$
DELIMITER ;

INSERT Livro (Titulo, Preco, FK_Genero_Id, FK_Editora_Id)
	VALUES('Pedro', 40, 1, 3);
    
DELETE FROM Livro WHERE Id_Livro = 51;