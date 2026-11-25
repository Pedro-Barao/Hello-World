package br.com.starlog.amador;

import javax.swing.*;

import br.com.starlog.controller.TransmissaoController;

import java.awt.*;

/**
 * CÓDIGO LEGADO CORROMPIDO • ESTAÇÃO STARLOG-ZERO
 * 
 * ALERTA DE ARQUITETURA: Este arquivo é um exemplo CLÁSSICO de código macarrônico amador!
 * Ele viola o Princípio da Responsabilidade Única (SRP) e o padrão MVC.
 * Tudo está misturado: criação visual, validações, cálculo de criptografia e persistência em memória.
 * 
 * MISSÃO DO SQUAD:
 * Resgatar as regras deste arquivo e refatorar criando o Model (CriptoMensagem) 
 * e o Controller (TransmissaoController), fazendo a suíte de testes TDD acender a barra VERDE!
 */
public class TelaCaoticaLegada extends JFrame {

    private JTextField txtRemetente;
    private JTextField txtMensagem;
    private JTextField txtChaveCifra;
    private JButton btnDespacharCifrado;
    private JTextArea areaLog;

    // "Banco de dados" misturado diretamente dentro da janela!
    private final TransmissaoController controller = new TransmissaoController();

    public TelaCaoticaLegada() {
        super("SISTEMA LEGADO CORROMPIDO - STARLOG");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Remetente da Frota:"));
        txtRemetente = new JTextField(20);
        add(txtRemetente);

        add(new JLabel("Mensagem Secreta:"));
        txtMensagem = new JTextField(20);
        add(txtMensagem);

        add(new JLabel("Chave de Deslocamento (César 1 a 25):"));
        txtChaveCifra = new JTextField(5);
        add(txtChaveCifra);

        btnDespacharCifrado = new JButton("Cifrar e Transmitir");
        add(btnDespacharCifrado);

        areaLog = new JTextArea(10, 35);
        add(new JScrollPane(areaLog));

        // =========================================================================
        // O MONSTRO DO BOTAO: Mais de 60 linhas misturando tudo dentro do evento!
        // =========================================================================
        btnDespacharCifrado.addActionListener(e -> {

            try {

            String pacote = controller.processarTransmissao(
                    txtRemetente.getText(),
                    txtMensagem.getText(),
                    txtChaveCifra.getText()
            );

            areaLog.append(pacote + "\n");
            JOptionPane.showMessageDialog(null, "Transmissão efetuada com sucesso!");
            
            } 
            
            catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage());
            }

        });


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaCaoticaLegada().setVisible(true));
    }
}
