package Calculadora;

public abstract class OperacaoSimples extends OperacaoBase {
    protected double numA;
    protected double numB;

    public OperacaoSimples (double numA, double numB) {
        super();
        this.numA = numA;
        this.numB = numB;
    }
}

