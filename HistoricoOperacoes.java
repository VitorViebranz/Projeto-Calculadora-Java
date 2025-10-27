package Calculadora;

import java.util.ArrayList;
import java.util.List;

public class HistoricoOperacoes {
    private List<Operacao> operacoes;

    public HistoricoOperacoes() {
        this.operacoes = new ArrayList<>();
    }

    public void adicionarOperacao(Operacao operacao) {
        operacoes.add(operacao);
    }

    public void exibirHistorico() {
        if (operacoes.isEmpty()) {
            System.out.println("Histórico vazio.");
            return;
        }

        System.out.println("\n--- Histórico de Operações ---");
        for (int i = 0; i < operacoes.size(); i++) {
            Operacao op = operacoes.get(i);
            System.out.printf("%d. %s = %.2f\n", (i + 1), op.getExpressao(), op.executar());
        }
        System.out.println("-----------------------------\n");
    }
}