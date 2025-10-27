package Calculadora;

public class Subtracao extends OperacaoSimples{
    public Subtracao ( double numA, double numB) {
        super(numA, numB);
        this.expressao = numA + " - " + numB;
    }

    @Override
    public double executar () {
        this.resultado = numA - numB;
        return resultado;
    }
}
