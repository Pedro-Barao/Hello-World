package br.com.starlog.main;

import java.util.HashSet;
import java.util.Set;

import br.com.starlog.exception.CapacidadeExcedidaException;
import br.com.starlog.model.Carga;
import br.com.starlog.model.ModuloCarga;

public class Main {
    
    public static void main(String[] args)
    {

        // =========================================================================
        // PROTOCOLO DE TESTES DE ESTRESSE (CHAOS MONKEY - 4 ATAQUES)
        // =========================================================================
        // Lembrete: Importe java.util.Set, java.util.HashSet e as classes dos pacotes model e exception!
        // ATAQUE 1: Injeção de Carga com Dados Espúrios (Fail-Fast)
        try {
            Carga fantasma = new Carga("    ", "CRIOGENICA", 10.0, 500.0);
            System.out.println("❌ FALHA: Aceitou codigo vazio!");
        } catch (IllegalArgumentException e) {
            System.out.println("✅ SUCESSO ATAQUE 1 (Fail-Fast ativado): " + e.getMessage());
        }

        // ATAQUE 2: O Clone das Sombras (Teste de Integridade Hash)
        Set<Carga> esteiraTriagem = new HashSet<>();
        Carga c1 = new Carga("ORB-999", "ALIMENTOS", 10.0, 100.0);
        Carga c1Clone = new Carga("ORB-999", "DADOS_ALTERADOS", 999.0, 8000.0); // Mesmo ID, memoria diferente!

        esteiraTriagem.add(c1);
        esteiraTriagem.add(c1Clone); // O Set DEVE recusar a duplicata!

        if (esteiraTriagem.size() == 1) {
            System.out.println("✅ SUCESSO ATAQUE 2 (Hash imune a clones): Tamanho do Set = 1");
        } else {
            System.out.println("❌ FALHA: O clone furou a dispersão e entrou no Set! Tamanho = " + esteiraTriagem.size());
        }

        // ATAQUE 3: O Teste de Ruptura de Limite (Checked Exception)
        ModuloCarga moduloTeste = new ModuloCarga("MOD-TESTE", 2);
        try {
            moduloTeste.carregarCarga(new Carga("C-01", "GERAL", 5.0, 50.0));
            moduloTeste.carregarCarga(new Carga("C-02", "GERAL", 5.0, 50.0));
            // A 3ª carga DEVE explodir o alarme!
            moduloTeste.carregarCarga(new Carga("C-03", "GERAL", 5.0, 50.0));
            System.out.println("❌ FALHA: Deixou ultrapassar a capacidade fisica!");
        } catch (CapacidadeExcedidaException e) {
            System.out.println("✅ SUCESSO ATAQUE 3 (Trava de Limite operante): " + e.getMessage());
        }

        // ATAQUE 4: Processamento Analítico Funcional (Streams API)
        // O moduloTeste tem 2 cargas de R$ 50.00 cada = R$ 100.00
        double seguroCalculado = moduloTeste.calcularSeguroTotal();
        System.out.println("✅ SUCESSO ATAQUE 4 (Streams Calculado): R$ " + seguroCalculado);

    }

}
