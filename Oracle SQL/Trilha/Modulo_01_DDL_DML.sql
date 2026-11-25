-- ============================================================
-- MODULO 1 - Criacao e manipulacao de dados  (conectado como ESTUDO)
-- Escreva sua resposta embaixo de cada enunciado. Nao apague os enunciados.
-- ============================================================

-- 1.0 Modele o banco da livraria. Crie as 7 tabelas abaixo, com EXATAMENTE
--     estes nomes de tabela e de coluna (o arquivo Carga_de_Dados.sql depende
--     deles). Quem decide o tipo de dado adequado e voce.
--     Rode o script varias vezes sem erro: ele deve recriar tudo do zero.
--
--     AUTOR       id_autor (identificador, gerado pelo banco)
--                 nome_autor (texto ate 40, obrigatorio)
--                 email (texto ate 60, opcional)
--     EDITORA     id_editora (identificador, gerado pelo banco)
--                 nome_editora (texto ate 40, obrigatorio)
--     GENERO      id_genero (identificador, gerado pelo banco)
--                 nome_genero (texto ate 30, obrigatorio)
--     CLIENTE     id_cliente (identificador, gerado pelo banco)
--                 nome_cliente (texto ate 40, obrigatorio)
--                 telefone (texto ate 15, opcional)
--     LIVRO       id_livro (identificador, gerado pelo banco)
--                 titulo (texto ate 60, obrigatorio)
--                 preco (valor em reais, ate 999.999,99, obrigatorio)
--                 ano_publicacao (ano com 4 digitos, opcional)
--                 e a ligacao de cada livro com seu autor, sua editora
--                 e seu genero (todas obrigatorias)
--     VENDA       id_venda (identificador, gerado pelo banco)
--                 a ligacao com o cliente (obrigatoria)
--                 data_venda (data, obrigatoria)
--     ITEM_VENDA  uma venda tem varios livros, e o mesmo livro nao pode
--                 aparecer duas vezes na mesma venda
--                 quantidade (inteiro ate 3 digitos, obrigatorio)
--                 preco_unitario (mesmo formato do preco do livro, obrigatorio)
--     As colunas de ligacao entre tabelas devem ter o mesmo nome da coluna
--     identificadora da tabela de origem (ex.: id_autor em LIVRO).
--     Depois de criar tudo, rode Carga_de_Dados.sql.
-- Sua resposta:



-- 1.1 A livraria vai passar a registrar promocoes. Crie a tabela PROMOCAO:
--     - cada promocao tem identificador proprio, gerado automaticamente;
--     - pertence obrigatoriamente a um livro que exista;
--     - tem um percentual de desconto obrigatorio, com ate 2 casas decimais,
--       que so pode ficar entre 1 e 90;
--     - tem uma data de inicio obrigatoria que, se nao for informada,
--       assume a data atual.
-- Sua resposta:



-- 1.2 Os livros agora precisam de controle de estoque: um numero inteiro de
--     ate 5 digitos, obrigatorio. Os livros que ja existem comecam com zero.
-- Sua resposta:



-- 1.3 Cadastre a autora Lygia Fagundes Telles (sem email) e o livro
--     'As Meninas' ligado a ela: R$ 45,00, publicado em 1973, pela
--     Companhia das Letras, genero Romance, com 10 unidades em estoque.
--     O script precisa funcionar mesmo que os ids das tabelas sejam outros.
-- Sua resposta:



-- 1.4 Os livros publicados antes de 1950 terao o preco AUMENTADO em 10%.
--     Aplique o reajuste de um jeito que voce consiga desfazer, comprove com
--     consulta que ele foi aplicado, desfaca, comprove que os precos voltaram
--     ao normal e, por fim, aplique de forma definitiva.
--     (Escreva em comentario o que cada consulta mostrou.)
-- Sua resposta:



-- 1.5 Remova da base o cliente que nunca comprou nada.
--     Depois tente remover o autor Machado de Assis. Registre em comentario
--     o codigo do erro e explique por que ele aconteceu.
-- Sua resposta:


