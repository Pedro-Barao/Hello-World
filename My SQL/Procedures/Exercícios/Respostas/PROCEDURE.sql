DROP PROCEDURE IF EXISTS colocar_livro;

CREATE PROCEDURE colocar_livro
	(Titulo VARCHAR(50), Preco FLOAT, FK_Genero_Id INT, FK_Editora_Id INT)
	INSERT INTO Livro(Titulo, Preco, FK_Genero_Id, FK_Editora_Id)
    VALUES(Titulo, Preco, FK_Genero_Id, FK_Editora_Id);