import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        // Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Variável para armazenar o maior número
        int maior = Integer.MIN_VALUE; // Inicializa com o menor valor possível

        System.out.println("Digite 5 números:");

        // Loop para ler os 5 números
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            // Verifica se o número é maior que o atual maior
            if (numero > maior) {
                maior = numero;
            }
        }

        // Exibe o maior número
        System.out.println("O maior número digitado foi: " + maior);

        // Fecha o Scanner
        scanner.close();
    }
}