DROP VIEW IF EXISTS livro_genero;

CREATE VIEW livro_genero AS(

	SELECT l.Id_Livro, g.Nome_Genero
		FROM livro l
        JOIN genero g WHERE l.FK_Genero_Id = g.Id_Genero
        ORDER BY l.Id_Livro ASC
        
);