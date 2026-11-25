-- ============================================================
-- 00_Usuario.sql  |  Rode conectado como SYSTEM (FREEPDB1)
-- Cria o usuario de estudo. Depois crie uma SEGUNDA conexao
-- na extensao com: usuario ESTUDO / senha Estudo123.
-- Se der ORA-01920 (usuario ja existe), pode ignorar.
-- ============================================================

CREATE USER estudo IDENTIFIED BY "Estudo123" QUOTA UNLIMITED ON USERS;

GRANT CREATE SESSION, CREATE TABLE, CREATE VIEW, CREATE SEQUENCE,
      CREATE PROCEDURE, CREATE TRIGGER TO estudo;
