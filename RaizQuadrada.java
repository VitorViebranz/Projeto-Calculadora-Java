package Calculadora;

public class RaizQuadrada extends OperacaoBase {
    private double operando;

    public RaizQuadrada(double operando) {
        super();
        if (operando < 0) {
            System.out.println("Raiz quadrada de número negativo não permitida!");
        } else {
            this.operando = operando;
            this.expressao = "sqrt(" + operando + ")";
        }
    }

    @Override
    public double executar() {
        this.resultado = Math.sqrt(operando);
        return resultado;
    }
}