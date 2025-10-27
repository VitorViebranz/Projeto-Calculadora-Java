package Calculadora;

public class Calculadora {
    private HistoricoOperacoes historico;
    private FabricaOperacoes fabrica;

    public Calculadora() {
        this.historico = new HistoricoOperacoes();
        this.fabrica = new FabricaOperacoes();
    }

    public double realizarOperacao(String tipo, double... operandos) {
        Operacao novaOperacao = fabrica.criarOperacao(tipo, operandos);

        if (novaOperacao == null) {
            System.err.println("Operação inválida ou não criada.");
            return Double.NaN;
        }

        double resultado = novaOperacao.executar();
        historico.adicionarOperacao(novaOperacao);

        return resultado;
    }

    public void exibirHistorico() {
        historico.exibirHistorico();
    }
}
