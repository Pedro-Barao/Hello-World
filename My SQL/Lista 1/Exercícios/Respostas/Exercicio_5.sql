CREATE TABLE livro (

	id_livro INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(45) NOT NULL,
    preco DOUBLE NOT NULL,
    estoque INT NOT NULL,
    CONSTRAINT fk_genero_id FOREIGN KEY (genero_id) REFERENCES genero(id_genero),
    CONSTRAINT fk_editora_id FOREIGN KEY (editora_id) REFERENCES editora(id_editora)
    
);