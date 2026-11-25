# AutoTech Parts • Kit de Desenvolvimento de Laboratório (Aula 26)

> **Engenharia de Persistência: Prática de JDBC com SQLite (Banco em Arquivo Local)**  
> Disciplina de Programação Orientada a Objetos • UniCesumar  
> Prof. Mestre Júlio B. Herculani • Sistema Operacional: Windows 10 / 11

---

## 🏢 1. O Cenário de Negócio
A oficina mecânica **AutoTech** atende dezenas de veículos por dia em seu galpão de serviços rápidos. Os mecânicos utilizam computadores nos boxes de serviço para consultar e dar baixa em peças de reposição (pastilhas de freio, filtros de óleo, velas de ignição).

**O Grande Problema:** O sinal de Wi-Fi do galpão cai com frequência devido à estrutura metálica do teto e interferência das ferramentas elétricas. Se o sistema dependesse de um banco de dados na nuvem ou de um servidor pesado de rede (como PostgreSQL ou Oracle), **a oficina inteira pararia a cada oscilação de internet!**

**A Solução de Engenharia:** Desenvolver um software em Java com **persistência relacional local autônoma em SQLite (`autotech.db`)**, que roda 100% embutido na aplicação, sem precisar de servidores, sem logins complexos e sem dependência de internet.

---

## 📂 2. Arquitetura do Pacote
```text
Aula26Kit
├── .vscode/
│   └── settings.json                    <- Configuração de compilação do VS Code
├── .classpath & .project                <- Metadados para Eclipse e extensões Java
├── lib/
│   ├── sqlite-jdbc-3.45.1.0.jar         <- Driver JDBC do SQLite
│   ├── slf4j-api-1.7.36.jar             <- Biblioteca de suporte
│   └── slf4j-simple-1.7.36.jar          <- Logger simples embutido
├── src/br/com/autotech/
│   ├── model/
│   │   └── Peca.java                    <- Modelo com atributos (id, codigo, nome, preco, estoque)
│   ├── factory/
│   │   └── ConexaoFactory.java          <- Fábrica apontando para autotech.db
│   ├── dao/
│   │   └── PecaDao.java                 <- 🎯 SEU LOCAL DE TRABALHO (Complete os métodos!)
│   └── main/
│       └── MainApp.java                 <- Menu interativo para testar suas missões
├── bin/                                 <- Onde os arquivos compilados (.class) são gerados
├── executar.bat                         <- Script de 1 clique para Windows 10
└── autotech.db                          <- Arquivo de banco criado automaticamente pelo seu código!
```

---

## 🛠️ 3. O Roteiro das 5 Missões de Bancada

Abra o arquivo [`src/br/com/autotech/dao/PecaDao.java`](src/br/com/autotech/dao/PecaDao.java) e implemente as missões na ordem abaixo:

### 🎯 Missão 1: DDL Automático (`criarTabelaSeNaoExistir`)
* **Objetivo:** Fazer o Java criar a tabela `pecas` automaticamente no arquivo `autotech.db` na primeira vez em que abrir.
* **Comando SQL:**
  ```sql
  CREATE TABLE IF NOT EXISTS pecas (
      id INTEGER PRIMARY KEY AUTOINCREMENT,
      codigo TEXT UNIQUE NOT NULL,
      nome TEXT NOT NULL,
      preco REAL NOT NULL,
      estoque INTEGER NOT NULL
  );
  ```
* **Teste:** Execute o programa pelo `executar.bat` (ou VS Code) e veja se o arquivo `autotech.db` aparece na pasta do projeto!

---

### 🎯 Missão 2: Cadastro com Resgate da Chave Primária (`salvar`)
* **Objetivo:** Inserir a peça com `PreparedStatement` e capturar o ID autoincrementado que o SQLite gerou.
* **Comando SQL:**
  ```sql
  INSERT INTO pecas (codigo, nome, preco, estoque) VALUES (?, ?, ?, ?);
  ```
* **Dica de Ouro:**
  1. Passe o parâmetro `Statement.RETURN_GENERATED_KEYS` na criação do PreparedStatement:
     ```java
     PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
     ```
  2. Lembre-se: os parâmetros começam no índice 1 (`stmt.setString(1, ...)`).
  3. Após chamar `stmt.executeUpdate()`, resgate a chave gerada:
     ```java
     try (ResultSet chaves = stmt.getGeneratedKeys()) {
         if (chaves.next()) {
             peca.setId(chaves.getLong(1));
         }
     }
     ```
* **Teste:** No menu do sistema, selecione a **Opção [2]** para cadastrar uma peça e ver o ID gerado!

---

### 🎯 Missão 3: Consulta Geral Navegável (`listarTodas`)
* **Objetivo:** Consultar todas as peças gravadas no disco rígido e transformá-las em uma lista de objetos `List<Peca>`.
* **Comando SQL:**
  ```sql
  SELECT id, codigo, nome, preco, estoque FROM pecas ORDER BY nome;
  ```
* **Dica de Ouro:**
  1. Use `stmt.executeQuery()` para obter o `ResultSet`.
  2. Use o laço `while (rs.next())` para navegar por todas as linhas devolvidas.
  3. Leia as colunas pelo **nome** (ex: `rs.getString("nome")`, `rs.getDouble("preco")`).
* **Teste:** No menu, selecione a **Opção [1]** e veja a tabela formatada com todas as peças do estoque!

---

### 🎯 Missão 4: Busca Filtrada por Código (`buscarPorCodigo`)
* **Objetivo:** Localizar uma peça específica digitando seu código (ex: `"PAS-101"`).
* **Comando SQL:**
  ```sql
  SELECT id, codigo, nome, preco, estoque FROM pecas WHERE codigo = ?;
  ```
* **Dica de Ouro:** Como o código é `UNIQUE`, utilize `if (rs.next())` em vez de `while`. Se encontrar, retorne o objeto montado; se não encontrar, retorne `null`.
* **Teste:** No menu, selecione a **Opção [3]** e digite `"PAS-101"`.

---

### 🎯 Missão 5: Baixa de Estoque no Balcão (`darBaixaEstoque`)
* **Objetivo:** Quando o mecânico retira peças para um conserto, subtrair a quantidade do estoque no banco.
* **Comando SQL:**
  ```sql
  UPDATE pecas SET estoque = estoque - ? WHERE id = ? AND estoque >= ?;
  ```
* **Dica de Ouro:**
  * Parâmetro 1 (`?`): quantidade a subtrair (`stmt.setInt(1, qtd)`).
  * Parâmetro 2 (`?`): ID da peça (`stmt.setLong(2, id)`).
  * Parâmetro 3 (`?`): validação para não permitir estoque negativo (`stmt.setInt(3, qtd)`).
  * Chame `int linhas = stmt.executeUpdate()`. Se `linhas > 0`, a baixa foi um sucesso!
* **Teste:** No menu, selecione a **Opção [4]** para retirar 2 unidades de uma peça e depois liste novamente (Opção [1]) para ver o estoque diminuído!

---

### 🏆 Missão Bônus: A Prova Real da Persistência
1. Cadastre 2 peças novas ou use a **Opção [5]** para semear peças padrão.
2. Selecione a **Opção [0]** para fechar completamente o programa.
3. Abra o programa novamente!
4. Selecione a **Opção [1]**: **todas as peças cadastradas anteriormente continuarão lá!**
5. Você comprovou que seu código Java agora possui memória permanente e durável gravada no disco rígido!

---

## 🆘 FAQ & Socorro de Bancada (Se Algo Der Errado)

### 1. "Deu erro: `database is locked`!"
* **Causa:** O SQLite tranca o arquivo quando alguém está gravando nele. Esse erro acontece se você abriu uma `Connection` ou `Statement` e esqueceu de fechar, ou se abriu o arquivo `autotech.db` no programa **DB Browser for SQLite** e esqueceu de clicar em *Escrever Alterações* / Fechar Banco.
* **Solução:**
  1. Feche o DB Browser ou qualquer visualizador de banco aberto.
  2. Garanta que no seu código todo acesso ao banco esteja dentro de parênteses do `try (...)` (*try-with-resources*).

### 2. "Deu erro: `Parameter index 0 out of bounds`!"
* **Causa:** Você digitou `stmt.setString(0, ...)`!
* **Solução:** No JDBC, os parâmetros `?` começam no **índice 1**, nunca no índice 0. Mude para `stmt.setString(1, ...)`.

### 3. "Não encontro o arquivo `autotech.db` na minha pasta!"
* **Solução:** No VS Code, clique no botão com ícone de setinhas circulares (**Refresh**) no canto superior do painel *Explorer*. O arquivo aparecerá instantaneamente!
