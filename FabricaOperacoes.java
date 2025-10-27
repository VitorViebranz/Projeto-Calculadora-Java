package Calculadora;

public class FabricaOperacoes {
    public Operacao criarOperacao(String tipo, double... operandos) {
        if (operandos == null || operandos.length < 1) {
            System.err.println("Erro: é necessário pelo menos um operando.");
            return null;
        }

        if (tipo == null || tipo.isEmpty()) {
            System.err.println("Erro: tipo de operação não informado.");
            return null;
        }

        switch (tipo.toUpperCase()) {
            case "+":
            case "SOMA":
                if (operandos.length < 2) {
                    System.err.println("Erro: a operação de soma requer dois operandos.");
                    return null;
                }
                return new Soma(operandos[0], operandos[1]);

            case "-":
            case "SUBTRACAO":
                if (operandos.length < 2) {
                    System.err.println("Erro: a operação de subtração requer dois operandos.");
                    return null;
                }
                return new Subtracao(operandos[0], operandos[1]);

            case "*":
            case "MULTIPLICACAO":
                if (operandos.length < 2) {
                    System.err.println("Erro: a operação de multiplicação requer dois operandos.");
                    return null;
                }
                return new Multiplicacao(operandos[0], operandos[1]);

            case "/":
            case "DIVISAO":
                if (operandos.length < 2) {
                    System.err.println("Erro: a operação de divisão requer dois operandos.");
                    return null;
                }
                return new Divisao(operandos[0], operandos[1]);

            case "^":
            case "POTENCIA":
                if (operandos.length < 2) {
                    System.err.println("Erro: a operação de potência requer dois operandos.");
                    return null;
                }
                return new Potencia(operandos[0], operandos[1]);

            case "R2":
            case "RAIZ":
                return new RaizQuadrada(operandos[0]);

            default:
                System.err.println("Erro: operação '" + tipo + "' desconhecida.");
                return null;
        }
    }
}
