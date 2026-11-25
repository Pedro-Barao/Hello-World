-- ============================================================
-- Carga_de_Dados.sql  |  Rode como ESTUDO, DEPOIS de criar as tabelas (1.0)
-- So tem INSERTs. Rode uma unica vez: rodar de novo duplica os dados.
-- Para recomecar, recrie as tabelas (o script do 1.0) e rode isto de novo.
-- Se der erro de coluna, o nome da sua coluna difere do enunciado do 1.0.
-- ============================================================

INSERT INTO autor (nome_autor, email) VALUES ('Machado de Assis', 'machado@letras.org');
INSERT INTO autor (nome_autor, email) VALUES ('Clarice Lispector', NULL);
INSERT INTO autor (nome_autor, email) VALUES ('George Orwell', 'orwell@uk.com');
INSERT INTO autor (nome_autor, email) VALUES ('Jorge Amado', NULL);

INSERT INTO editora (nome_editora) VALUES ('Companhia das Letras');
INSERT INTO editora (nome_editora) VALUES ('Rocco');
INSERT INTO editora (nome_editora) VALUES ('Record');

INSERT INTO genero (nome_genero) VALUES ('Romance');
INSERT INTO genero (nome_genero) VALUES ('Distopia');
INSERT INTO genero (nome_genero) VALUES ('Contos');

INSERT INTO livro (titulo, preco, ano_publicacao, id_autor, id_editora, id_genero) VALUES ('Dom Casmurro', 39.90, 1899, 1, 1, 1);
INSERT INTO livro (titulo, preco, ano_publicacao, id_autor, id_editora, id_genero) VALUES ('Memórias Póstumas de Brás Cubas', 44.50, 1881, 1, 1, 1);
INSERT INTO livro (titulo, preco, ano_publicacao, id_autor, id_editora, id_genero) VALUES ('A Hora da Estrela', 34.00, 1977, 2, 2, 1);
INSERT INTO livro (titulo, preco, ano_publicacao, id_autor, id_editora, id_genero) VALUES ('Laços de Família', 42.00, 1960, 2, 2, 3);
INSERT INTO livro (titulo, preco, ano_publicacao, id_autor, id_editora, id_genero) VALUES ('1984', 49.90, 1949, 3, 1, 2);
INSERT INTO livro (titulo, preco, ano_publicacao, id_autor, id_editora, id_genero) VALUES ('A Revolução dos Bichos', 29.90, 1945, 3, 1, 2);
INSERT INTO livro (titulo, preco, ano_publicacao, id_autor, id_editora, id_genero) VALUES ('Capitães da Areia', 47.00, 1937, 4, 3, 1);
INSERT INTO livro (titulo, preco, ano_publicacao, id_autor, id_editora, id_genero) VALUES ('Gabriela, Cravo e Canela', 52.00, 1958, 4, 3, 1);

INSERT INTO cliente (nome_cliente, telefone) VALUES ('Ana Souza', '11999990001');
INSERT INTO cliente (nome_cliente, telefone) VALUES ('Bruno Lima', '11999990002');
INSERT INTO cliente (nome_cliente, telefone) VALUES ('Carla Dias', NULL);
INSERT INTO cliente (nome_cliente, telefone) VALUES ('Diego Reis', '11999990004');

INSERT INTO venda (id_cliente, data_venda) VALUES (1, DATE '2026-01-10');
INSERT INTO venda (id_cliente, data_venda) VALUES (1, DATE '2026-02-14');
INSERT INTO venda (id_cliente, data_venda) VALUES (2, DATE '2026-02-20');
INSERT INTO venda (id_cliente, data_venda) VALUES (3, DATE '2026-03-05');
INSERT INTO venda (id_cliente, data_venda) VALUES (2, DATE '2026-03-18');

INSERT INTO item_venda (id_venda, id_livro, quantidade, preco_unitario) VALUES (1, 1, 1, 39.90);
INSERT INTO item_venda (id_venda, id_livro, quantidade, preco_unitario) VALUES (1, 5, 2, 49.90);
INSERT INTO item_venda (id_venda, id_livro, quantidade, preco_unitario) VALUES (2, 3, 1, 34.00);
INSERT INTO item_venda (id_venda, id_livro, quantidade, preco_unitario) VALUES (3, 5, 1, 49.90);
INSERT INTO item_venda (id_venda, id_livro, quantidade, preco_unitario) VALUES (3, 6, 1, 29.90);
INSERT INTO item_venda (id_venda, id_livro, quantidade, preco_unitario) VALUES (3, 7, 3, 47.00);
INSERT INTO item_venda (id_venda, id_livro, quantidade, preco_unitario) VALUES (4, 2, 1, 44.50);
INSERT INTO item_venda (id_venda, id_livro, quantidade, preco_unitario) VALUES (4, 8, 1, 52.00);
INSERT INTO item_venda (id_venda, id_livro, quantidade, preco_unitario) VALUES (5, 1, 2, 39.90);

COMMIT;

-- Conferencia: deve mostrar 4, 3, 3, 8, 4, 5, 9
SELECT (SELECT COUNT(*) FROM autor)      AS autores,
       (SELECT COUNT(*) FROM editora)    AS editoras,
       (SELECT COUNT(*) FROM genero)     AS generos,
       (SELECT COUNT(*) FROM livro)      AS livros,
       (SELECT COUNT(*) FROM cliente)    AS clientes,
       (SELECT COUNT(*) FROM venda)      AS vendas,
       (SELECT COUNT(*) FROM item_venda) AS itens
FROM dual;
