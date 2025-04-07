import java.util.Scanner;

public class CrescimentoPopulacionalDinamico {

    public static void main(String[] args) {
        // Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            // Solicita e valida a população inicial do país A
            double populacaoA = 0;
            while (true) {
                System.out.print("Digite a população inicial do país A (deve ser positiva): ");
                populacaoA = scanner.nextDouble();
                if (populacaoA > 0) {
                    break;
                } else {
                    System.out.println("Erro: A população deve ser maior que zero. Tente novamente.");
                }
            }

            // Solicita e valida a taxa de crescimento do país A
            double taxaCrescimentoA = 0;
            while (true) {
                System.out.print("Digite a taxa de crescimento anual do país A (em %, ex: 3 para 3%): ");
                String inputTaxaA = scanner.next().replace("%", ""); // Remove o símbolo %
                try {
                    taxaCrescimentoA = Double.parseDouble(inputTaxaA); // Converte para número
                    if (taxaCrescimentoA > 0) {
                        taxaCrescimentoA /= 100; // Converte para decimal
                        break;
                    } else {
                        System.out.println("Erro: A taxa de crescimento deve ser maior que zero. Tente novamente.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Erro: Entrada inválida. Insira apenas números (ex: 3 para 3%).");
                }
            }

            // Solicita e valida a população inicial do país B
            double populacaoB = 0;
            while (true) {
                System.out.print("Digite a população inicial do país B (deve ser maior que a de A): ");
                populacaoB = scanner.nextDouble();
                if (populacaoB > populacaoA) {
                    break;
                } else {
                    System.out.println("Erro: A população de B deve ser maior que a de A. Tente novamente.");
                }
            }

            // Solicita e valida a taxa de crescimento do país B
            double taxaCrescimentoB = 0;
            while (true) {
                System.out.print("Digite a taxa de crescimento anual do país B (em %, ex: 1.5 para 1.5%): ");
                String inputTaxaB = scanner.next().replace("%", ""); // Remove o símbolo %
                try {
                    taxaCrescimentoB = Double.parseDouble(inputTaxaB); // Converte para número
                    if (taxaCrescimentoB > 0) {
                        taxaCrescimentoB /= 100; // Converte para decimal
                        break;
                    } else {
                        System.out.println("Erro: A taxa de crescimento deve ser maior que zero. Tente novamente.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Erro: Entrada inválida. Insira apenas números (ex: 1.5 para 1.5%).");
                }
            }

            // Contador de anos
            int anos = 0;

            // Loop para calcular o crescimento populacional até que A >= B
            while (populacaoA < populacaoB) {
                // Atualiza as populações com base nas taxas de crescimento
                populacaoA += populacaoA * taxaCrescimentoA;
                populacaoB += populacaoB * taxaCrescimentoB;

                // Incrementa o contador de anos
                anos++;
            }

            // Exibe o resultado
            System.out.println("\n--- Resultado ---");
            System.out.println("Serão necessários " + anos + " anos para que a população do país A");
            System.out.println("ultrapasse ou iguale a população do país B.");
            System.out.printf("População final de A: %.0f\n", populacaoA);
            System.out.printf("População final de B: %.0f\n", populacaoB);

            // Pergunta se o usuário deseja repetir a operação
            System.out.print("\nDeseja repetir a operação? (s/n): ");
            String resposta = scanner.next().toLowerCase();
            if (!resposta.equals("s")) {
                continuar = false;
            }

            // Limpa o buffer do teclado
            scanner.nextLine();
        }

        // Fecha o Scanner
        scanner.close();
    }
}