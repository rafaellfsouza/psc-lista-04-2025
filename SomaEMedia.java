import java.util.Scanner;

public class SomaEMedia {

    public static void main(String[] args) {
        // Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar a soma e a média
        int soma = 0;
        double media;

        System.out.println("Digite 5 números:");

        // Loop para ler os 5 números
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            // Adiciona o número à soma
            soma += numero;
        }

        // Calcula a média
        media = (double) soma / 5;

        // Exibe a soma e a média
        System.out.println("A soma dos números é: " + soma);
        System.out.printf("A média dos números é: %.2f\n", media);

        // Fecha o Scanner
        scanner.close();
    }
}