# StarLog Logistics • Kit de Desenvolvimento de Laboratório (Aula 24)

Este projeto foi fornecido com a **infraestrutura de interface gráfica (View) pronta** para que você aplique os princípios de **Engenharia de Software e Arquitetura MVC (Model-View-Controller)**.

---

## 🎯 Objetivo Pedagógico
Integrar uma interface visual rica desenvolvida em **Java Swing** com classes de domínio (**Model**) e orquestração (**Controller**), sem violar o princípio de responsabilidade única e sem misturar regras de negócio dentro de botões.

---

## 📂 Arquitetura do Pacote
```text
br.com.starlog
├── model
│   └── Carga.java                  <- O Modelo de Domínio (POJO com regras e Fail-Fast)
├── view
│   └── TelaCadastroCarga.java      <- A Casca Visual (JFrame, botões, campos e tabela)
├── controller
│   └── CargaController.java        <- O Maestro (Conversão de tipos, validações e fluxo)
└── main
    └── MainApp.java                <- Inicialização da aplicação na thread segura (EDT)
```

---

## 🛠️ Suas Missões no Laboratório

### Missão 1: Compreensão e Execução Inicial
1. Abra o projeto na sua IDE (VS Code, IntelliJ ou Eclipse).
2. Execute a classe `MainApp.java`.
3. Observe a interface gráfica abrir centralizada, com componentes organizados via `BorderLayout`, `GridLayout` e `FlowLayout`.

### Missão 2: Regra de Negócio no Model (`Carga.java`)
* Analise as validações do construtor:
  * Código de rastreio e categoria não podem ser nulos ou em branco (`IllegalArgumentException`).
  * Peso e valor devem ser estritamente maiores que zero.
* Observe o método `calcularSeguro()`:
  * Taxa base de 2% do valor declarado.
  * Cargas da categoria `"PERIGOSA"` ou com peso superior a 100 kg recebem sobretaxa de R$ 150,00.

### Missão 3: Conexão dos Fios no Controller (`CargaController.java`)
* Complete ou ajuste os blocos de tratamento:
  * Capture erros de digitação (`NumberFormatException`) para impedir travamento do sistema caso o usuário digite letras no campo de peso.
  * Capture `IllegalArgumentException` e repasse a mensagem limpa para a tela através de `tela.exibirMensagemErro(...)`.

### Missão 4: Teste de Resiliência
* Tente cadastrar uma carga com peso `"abc"` e veja o diálogo amigável na tela.
* Tente cadastrar uma carga com valor `"-50"` e veja a barreira do Model atuando.
* Cadastre 3 cargas válidas e observe o relatório de despacho sendo atualizado dinamicamente na área de texto inferior!
