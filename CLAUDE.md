# Hello-World — configuração geral para o Claude

Este arquivo é lido automaticamente quando o Claude Code é aberto nesta pasta, em qualquer computador.
Ele guarda só o **contexto geral**. Não há dados pessoais aqui, porque o repositório é **público**.

## O que é este repositório
Trabalhos e material de estudo da faculdade (Unicesumar), organizados por linguagem ou tema.
Idioma de trabalho: **português do Brasil**.

## Estrutura
| Pasta | Conteúdo |
|-------|----------|
| `Java/` | Aulas e exercícios de Java. Os arquivos soltos são antigos; `Java/POO-Unicesumar/` é o material de POO da Unicesumar, separado do resto |
| `Java/POO-Unicesumar/` | Os seus exercícios e projetos de POO: `Lista_*`, `Lista-Interativa-*`, `Aula*Kit`, `TestePOO`, `StarLog-Zero` etc. As pastas `Aulas`, `Listas de Exercicios`, `Material de Apoio` e `Outros` são dos professores e ficam **só locais** |
| `C/`, `C#/`, `Python/`, `HTML_CSS_JavaScript/` | Exercícios por linguagem |
| `My SQL/` | Trabalhos em MySQL |
| `Oracle SQL/` | Estudo de Oracle SQL: `Trilha/` (módulos e `PROGRESSO.md`) e `Exercícios/` |
| `Sistemas Operacionais/` | Slides do Tanenbaum, listas por capítulo, exemplos em C e planilhas. Material do professor: **só local** |
| `pdf_e_outros_trabalhos/` | PDFs e trabalhos avulsos. `Engenharia-de-Requisitos/` guarda as aulas dessa matéria, que são do professor e ficam **só locais** |
| `Relatorios/` | Modelo de relatório e cronograma de revisão |

## Como o Claude deve trabalhar com o Pedro
- **Modo teste:** os exercícios não trazem gabarito. Quando houver erro, dar **pista** e apontar a região, e não a resposta pronta.
  Só entregar o código corrigido se o Pedro pedir de forma explícita.
- **Correção sob demanda:** quando ele disser "corrige o módulo X", ler o arquivo salvo, apontar os erros e atualizar `Oracle SQL/Trilha/PROGRESSO.md`.
- **Honestidade:** se não executou o código, dizer que a conferência foi só por leitura.
  O Claude só vê o que está **salvo no disco**, e não o que está na tela do editor.
- **Módulos futuros:** gerar o módulo seguinte só quando o Pedro chegar nele, para ajustar a dificuldade.

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
- O repositório é **público**. **Nunca** versionar notas, pareceres, devolutivas ou qualquer dado de outras pessoas.
  Essas regras estão no `.gitignore`. Antes de cada `push`, conferir `git status` e o que vai subir.
- **Material dos professores** (aulas, slides, listas, provas oficiais e gabaritos) também **não** é versionado, para não publicar sem autorização deles.
  Só entram no repositório os trabalhos e exercícios feitos pelo próprio Pedro.
- Binários compilados (`*.exe`, `*.o`, `*.class`) ficam fora do controle de versão daqui para frente.
  Os que já vieram da migração continuam versionados.
- Mensagens de commit descritivas, em português, e commits separados por assunto.
- Não usar `git push --force` nem reescrever o histórico sem pedido explícito do Pedro.

## Em um computador novo
1. Instalar `git` e o GitHub CLI (`gh`), rodar `gh auth login` e `gh auth setup-git`, e configurar `git config --global user.name` e `user.email`.
2. Clonar: `gh repo clone Pedro-Barao/Hello-World`.
3. Para o Oracle: instalar o Docker, entrar no grupo `docker` e fazer logout e login. Depois subir o contêiner Oracle Free e criar a conexão `ESTUDO` na extensão.
4. Abrir o Claude Code **dentro desta pasta**. A memória do Claude é local a cada máquina, e este arquivo faz o papel de ponte.
5. Os arquivos de notas, o material dos professores e os relatórios diários estão no `.gitignore`, então **não vêm no `git clone`**. Eles só existem na máquina original. Copie-os à mão se precisar.

## Histórico
O material de Java POO, Sistemas Operacionais, Engenharia de Requisitos e Oracle SQL veio do repositório `Unicesumar-POO`, que foi incorporado aqui.
