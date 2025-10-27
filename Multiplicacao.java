package Calculadora;

public class Multiplicacao extends OperacaoSimples {
    public Multiplicacao(double numA, double numB) {
        super(numA, numB);
        this.expressao = numA + " * " + numB;
    }

    @Override
    public double executar() {
        this.resultado = numA * numB;
        return resultado;
    }
}