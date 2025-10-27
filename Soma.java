package Calculadora;

public class Soma extends OperacaoSimples {
    public Soma (double numA, double NumB) {
        super(numA, NumB);
        this.expressao = numA + " + " + numB;
    }

    @Override
    public double executar() {
        this.resultado = numA + numB;
        return resultado;
    }
}
