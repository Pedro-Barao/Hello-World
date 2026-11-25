# Hello-World — configuração geral para o Claude

Este arquivo é lido automaticamente quando o Claude Code é aberto nesta pasta, em qualquer computador.
Ele guarda só o **contexto geral**. Não há dados pessoais aqui, porque o repositório é **público**.

## O que é este repositório
Trabalhos e material de estudo da faculdade (Unicesumar), organizados por linguagem ou matéria.
Idioma de trabalho: **português do Brasil**.

## Estrutura padrão
Cada linguagem ou matéria tem uma pasta. Dentro dela, cada **conteúdo** (assunto) segue a mesma forma:

```
Linguagem ou Matéria/
├── Conteúdo/                      um assunto (ex.: "Ponteiro", "Cap 03 - Gerenciamento de memória")
│   ├── Exercícios/
│   │   ├── Enunciados/            só se houver enunciado
│   │   └── Respostas/             o que o Pedro fez (código, planilhas, diagramas)
│   └── Documentos/                arquivos da matéria: aulas, slides (PDF só local), exemplos de código, guias
└── Trilha/                        só onde há trilha guiada de estudo (hoje, Oracle SQL)
```
**Ao criar ou mover arquivos, seguir essa forma.** Projetos Java (com `src`, `bin`, `nbproject`) e pastas de código
**não são desmontados**: ficam inteiros dentro de `Respostas/`, para continuarem compilando.

| Pasta | Conteúdos |
|-------|-----------|
| `C/`, `C#/`, `Python/`, `HTML_CSS_JavaScript/` | Exercícios por linguagem. Em `C/`, `Seq V1` e `Seq V2` são versões do mesmo tema |
| `Java/` | Conteúdos soltos (Fundamentos, Encapsulamento, Listas 1 a 6, Streams...) e `POO-Unicesumar/`, a matéria de POO |
| `Java/POO-Unicesumar/` | `Exercícios/Respostas/` com as listas e projetos do Pedro. `Exercícios/Enunciados/` e `Documentos/` são dos professores (só locais) |
| `My SQL/` | Funções, Procedures, Triggers, Views, Lista 1, Trabalho Takahashi, Modelagem Conceitual |
| `Oracle SQL/` | `Trilha/` (módulos, `PROGRESSO.md`), `Criação de Usuário/`, `DDL e DML/` |
| `Sistemas Operacionais/` | Um conteúdo por capítulo do Tanenbaum, mais `Trabalhos e Provas`. **Só local** |
| `Engenharia-de-Requisitos/` | Dado e Conhecimento, Regras de Negócio, Requisitos, Gestão de Requisitos. **Só local** |
| `Arquitetura de Software/` | Trabalho em grupo com dados de colegas. **Só local** |
| `Relatorios/` | Modelo de relatório e cronograma de revisão |

## Como o Claude deve trabalhar com o Pedro
- **Modo teste:** os exercícios não trazem gabarito. Quando houver erro, dar **pista** e apontar a região, e não a resposta pronta.
  Só entregar o código corrigido se o Pedro pedir de forma explícita.
- **Correção sob demanda:** quando ele disser "corrige o módulo X", ler o arquivo salvo, apontar os erros e atualizar `Oracle SQL/Trilha/PROGRESSO.md`.
- **Honestidade:** se não executou o código, dizer que a conferência foi só por leitura.
  O Claude só vê o que está **salvo no disco**, e não o que está na tela do editor.
- **Módulos futuros:** gerar o módulo seguinte só quando o Pedro chegar nele, para ajustar a dificuldade.
- **Pesquisa externa:** o Pedro pesquisa quando não sabe uma estrutura, e isso é bom. Pedir que marque no código com `-- pesquisei: ...`,
  para o relatório separar o que ele sabia do que consultou. Resultados de busca costumam ser de MySQL: preferir `docs.oracle.com`.

## Oracle SQL — ambiente
- Banco: **Oracle Free** em contêiner Docker, serviço `FREEPDB1`, porta `1521` (versão 23ai ou mais nova).
- Usuário de estudo: `ESTUDO`, criado por `Oracle SQL/Trilha/00_Usuario.sql`. Rodar os exercícios **como `ESTUDO`**, e não como `SYSTEM`.
- Editor: VS Code com a extensão **Oracle SQL Developer**.
- Cuidado com os hábitos do MySQL: `AUTO_INCREMENT`, `LIMIT`, `DELIMITER`, `CREATE SCHEMA IF NOT EXISTS` e `DEFAULT` depois de `NOT NULL` não funcionam do mesmo jeito no Oracle.
- `DROP TABLE IF EXISTS` e vários `VALUES (...), (...)` num só `INSERT` exigem Oracle 23ai. Se a faculdade usar uma versão mais antiga, avisar.
- Os logs do contêiner Oracle usam **UTC**. O horário local é UTC-3.

## Relatórios e rotina
- No fim de cada módulo, o Claude escreve um relatório **completo**, usando `Relatorios/MODELO_Relatorio_de_Modulo.md`.
  Os relatórios diários ficam em `Relatorios/Relatórios_Diarios/` e **não são versionados** (ver `.gitignore`).
- Cronograma de revisão: `Relatorios/Cronograma_Revisao.md` (segunda a quinta, uma matéria por dia).
- Medidas de tempo usam a data de gravação dos arquivos (`stat`) e o horário dos comandos (`date`). São indícios, e não um cronômetro.

## Git e GitHub — regras
- O repositório é **público**. **Nunca** versionar notas, pareceres, devolutivas ou qualquer dado de outras pessoas (nome, RA, e-mail).
  Essas regras estão no `.gitignore`. Antes de cada `push`, conferir `git status` e o que vai subir.
- **Material dos professores** (aulas, slides, exemplos, listas, provas e gabaritos) também **não** é versionado, para não publicar sem autorização deles.
  Os PDFs dentro de pastas `Documentos/` ficam fora do Git, e `Sistemas Operacionais/`, `Engenharia-de-Requisitos/` e `Java/POO-Unicesumar/Documentos/` também.
  O código de exemplo e os trabalhos feitos pelo próprio Pedro continuam versionados.
- Binários compilados (`*.exe`, `*.o`, `*.class`) ficam fora do controle de versão daqui para frente.
  Os que já vieram da migração continuam versionados.
- Mensagens de commit descritivas, em português, e commits separados por assunto.
- Não usar `git push --force` nem reescrever o histórico sem pedido explícito do Pedro.

## Ferramentas e extensões do VS Code
Extensões usadas: Java (pack completo, Maven, Gradle, Spring), Oracle SQL Developer, Database Client, C/C++ (`ms-vscode.cpptools`),
Python (`ms-python.python`), C# (`ms-dotnettools.csharp`), Live Server (`ritwickdey.LiveServer`), PDF (`tomoki1207.pdf`),
Excel Viewer (`grapecity.gc-excelviewer`), Docker (`ms-azuretools.vscode-docker`), SQLite (`alexcvzz.vscode-sqlite`) e Claude Code.
Instalar uma por vez com `code --install-extension <id>`.

Programas que as extensões precisam (instalar com `sudo`, no Ubuntu):
`sudo apt install build-essential gdb dotnet-sdk-10.0 python3-pip python3-venv nodejs npm sqlite3`
(no Ubuntu 26.04 só existe o `dotnet-sdk-10.0`; em outra versão, procurar com `apt search dotnet-sdk`). Java 21 e Maven, Docker e Git já estavam instalados.

## Em um computador novo
1. Instalar `git` e o GitHub CLI (`gh`), rodar `gh auth login` e `gh auth setup-git`, e configurar `git config --global user.name` e `user.email`.
2. Clonar: `gh repo clone Pedro-Barao/Hello-World`.
3. Instalar as extensões e os programas da seção acima.
4. Para o Oracle: instalar o Docker, entrar no grupo `docker` e fazer logout e login. Depois subir o contêiner Oracle Free
   (de preferência com `-p 127.0.0.1:1521:1521`, para não abrir o banco para a rede) e criar a conexão `ESTUDO` na extensão.
5. Abrir o Claude Code **dentro desta pasta**. A memória do Claude é local a cada máquina, e este arquivo faz o papel de ponte.
6. Os arquivos de notas, o material dos professores e os relatórios diários estão no `.gitignore`, então **não vêm no `git clone`**.
   Eles só existem na máquina original. Copie-os à mão se precisar.

## Histórico
O material de Java POO, Sistemas Operacionais, Engenharia de Requisitos e Oracle SQL veio do repositório `Unicesumar-POO`.
Esse repositório foi mantido, mas passou a ser **privado**.
