package interpreter;

import java.util.Scanner;

public class ExpressaoMatematica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Expressão: ");
            String expressao = scanner.nextLine();

            if (expressao.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o programa.");
                break;
            }

            try {
                double resultado = avaliarExpressao(expressao);
                System.out.println("Resultado: " + resultado);
            } catch (Exception e) {
                System.out.println("Erro na expressão: " + e.getMessage());
            }
        }
    }

    public static double avaliarExpressao(String expressao) {
        // Remova espaços em branco da expressão
        expressao = expressao.replaceAll("\\s+", "");

        // Crie um analisador de expressão simples
        Scanner scanner = new Scanner(expressao);
        scanner.useDelimiter("[+\\-*/]");

        double resultado = scanner.nextDouble();
        char operador = ' ';

        while (scanner.hasNext()) {
            operador = expressao.charAt(scanner.match().start());
            double proximoNumero = scanner.nextDouble();

            switch (operador) {
                case '+':
                    resultado += proximoNumero;
                    break;
                case '-':
                    resultado -= proximoNumero;
                    break;
                case '*':
                    resultado *= proximoNumero;
                    break;
                case '/':
                    resultado /= proximoNumero;
                    break;
                default:
                    throw new IllegalArgumentException("Operador inválido: " + operador);
            }
        }

        return resultado;
    }
}
