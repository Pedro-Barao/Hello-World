# StarLog-Zero • Operação Enigma: Caça ao Acoplamento (Aula 23)

> **Situação de Emergência:** A estação de comunicação espacial *StarLog-Zero* interceptou um módulo legado (`TelaCaoticaLegada.java`) desenvolvido por um programador júnior que foi demitido. O código funciona precariamente, mas é um desastre de engenharia: todas as regras de criptografia, validações e persistência foram jogadas dentro de um único botão do Java Swing!

---

## 🎯 Objetivo da Missão
Aplicar os princípios de **Engenharia de Software, Refatoração e Padrão MVC (Model-View-Controller)** para resgatar a inteligência do sistema e satisfazer a suíte oficial de **Testes TDD (JUnit 5)**.

---

## 📂 Estrutura do Desafio
```text
br.com.starlog
├── amador
│   └── TelaCaoticaLegada.java      <- O código monstro legado que mistura tudo
├── model
│   └── CriptoMensagem.java         <- O Model que você deve blindar (sem Swing!)
├── controller
│   └── TransmissaoController.java  <- O Maestro que você deve orquestrar
└── test
    └── CriptoMensagemTest.java     <- A suíte oficial com 8 testes TDD JUnit 5
```

---

## 🛠️ As 4 Etapas da Operação de Bancada (50 Minutos)

### Etapa 1: Diagnóstico Forense
1. Abra e execute a classe `TelaCaoticaLegada.java`.
2. Teste o envio de uma mensagem (ex: Remetente: `ALPHA`, Msg: `SEGREDO`, Chave: `3`).
3. Abra o código-fonte e localize o evento do botão `btnDespacharCifrado.addActionListener(...)`.
4. Identifique o "code smell": por que esse botão é considerado uma bomba-relógio pela Engenharia de Software?

### Etapa 2: Resgate do Domínio (`CriptoMensagem.java`)
Extraia a regra de negócio para a classe de Modelo:
* **Barreira Fail-Fast:** Não permitir remetente ou mensagem nula/vazia (`IllegalArgumentException`). A chave de deslocamento deve estar estritamente entre `1` e `25`.
* **Algoritmo da Cifra de César:** O método `cifrar()` deve rotacionar apenas letras de `'A'` a `'Z'` com rotação circular (wrap-around: `'Z'` + 1 vira `'A'`), preservando espaços e pontuações.
* **Cálculo de Integridade:** O método `calcularChecksum()` deve somar o código ASCII de todos os caracteres da mensagem em maiúsculo.

### Etapa 3: Orquestração no Controller (`TransmissaoController.java`)
Crie a ponte entre a tela e o modelo:
* O método `processarTransmissao(remetente, msg, chaveStr)` deve converter a chave para inteiro (`Integer.parseInt`), capturando `NumberFormatException` e disparando mensagem limpa.
* Instanciar o `CriptoMensagem`, recuperar o texto cifrado e o checksum.
* Formatar o pacote de transmissão no padrão: `[REMETENTE] #CHECKSUM -> TEXTO_CIFRADO`.

### Etapa 4: Veredito Binário (Executar a Suíte TDD)
* Execute a classe de testes `CriptoMensagemTest.java` na sua IDE (clique no botão verde de Play ao lado da classe).
* Sua missão está cumprida quando todos os **8 testes automatizados apresentarem Barra Verde (Passed)**!
