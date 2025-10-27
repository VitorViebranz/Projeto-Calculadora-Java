package Calculadora;

public class Potencia extends OperacaoSimples {
    public Potencia(double base, double expoente) {
        super(base, expoente);
        this.expressao = base + " ^ " + expoente;
    }

    @Override
    public double executar() {
        this.resultado = Math.pow(numA, numB);
        return resultado;
    }
}