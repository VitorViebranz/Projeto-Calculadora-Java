package Calculadora;

public abstract class OperacaoBase implements Operacao {
    protected double resultado;
    protected String expressao;

    public OperacaoBase () {
        this.resultado = 0.0;
        this.expressao = "";
    }

    @Override
    public String getExpressao() {
        return expressao;
    }

    @Override
    public abstract double executar();
}