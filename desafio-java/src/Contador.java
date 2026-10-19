import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            int parametroUm = lerInteiro(terminal, "Digite o primeiro parâmetro:");
            int parametroDois = lerInteiro(terminal, "Digite o segundo parâmetro:");

            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

    private static int lerInteiro(Scanner terminal, String mensagem) {
        while (true) {
            System.out.println(mensagem);
            String entrada = terminal.nextLine().trim();

            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException exception) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
    }

    static void contar(int parametroUm, int parametroDois)
            throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException(
                    "O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
