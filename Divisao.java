package Calculadora;

public class Divisao extends OperacaoSimples {
    public Divisao(double numA, double numB) {
        super(numA, numB);
        this.expressao = numA + " / " + numB;
    }

    @Override
    public double executar() {
        if (numB == 0) {
            System.out.println("Divisão por zero não permitida!");
            return Double.NaN;
        }
        this.resultado = numA / numB;
        return resultado;
    }
}