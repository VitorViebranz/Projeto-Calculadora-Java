import Calculadora.Calculadora;
import java.util.Scanner;

public class Main {
    private static Calculadora calculadora;
    private static Scanner scanner;

    public static void main(String[] args) {
        calculadora = new Calculadora();
        scanner = new Scanner(System.in);

        System.out.println("--- Calculadora Orientada a Objetos ---");
        String comando;
        do {
            exibirMenu();
            comando = scanner.next().toUpperCase();
            processarComando(comando);
        } while (!comando.equals("SAIR"));

        System.out.println("Calculadora encerrada. Até logo!");
    }

    private static void exibirMenu() {
        System.out.println("\nSelecione a operação:");
        System.out.println("+ (Calculadora.Soma), - (Subtração), * (Multiplicação), / (Divisão)");
        System.out.println("^ (Potência), R2 (Raiz Quadrada)");
        System.out.println("HISTORICO, SAIR");
        System.out.print("Comando: ");
    }

    private static void processarComando(String comando) {
        if (comando == null || comando.isEmpty()) {
            System.out.println("Comando vazio ou nulo.");
            return;
        }

        if (comando.equalsIgnoreCase("HISTORICO")) {
            calculadora.exibirHistorico();
            return;
        } else if (comando.equalsIgnoreCase("SAIR")) {
            return;
        }

        if (comando.equalsIgnoreCase("R2") || comando.equalsIgnoreCase("RAIZ")) {
            Double op1 = lerOperandoSeguro("Primeiro operando (para R2, é o único): ");
            if (op1 == null) {
                System.err.println("Operando inválido. Operação cancelada.");
                return;
            }

            double resultado = calculadora.realizarOperacao("R2", op1);
            exibirResultado(resultado);
        } else {
            Double op1 = lerOperandoSeguro("Primeiro operando: ");
            if (op1 == null) {
                System.err.println("Operando inválido. Operação cancelada.");
                return;
            }

            Double op2 = lerOperandoSeguro("Segundo operando: ");
            if (op2 == null) {
                System.err.println("Operando inválido. Operação cancelada.");
                return;
            }

            double resultado = calculadora.realizarOperacao(comando, op1, op2);
            exibirResultado(resultado);
        }
    }

    private static Double lerOperandoSeguro(String mensagem) {
        System.out.print(mensagem);
        if (!scanner.hasNextDouble()) {
            scanner.next();
            return null;
        }
        return scanner.nextDouble();
    }

    private static double lerOperando(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    private static void exibirResultado(double resultado) {
        if (!Double.isNaN(resultado)) {
            System.out.printf("Resultado: %.2f\n", resultado);
        }
    }

}