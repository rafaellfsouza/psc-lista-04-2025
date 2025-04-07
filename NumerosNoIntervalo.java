import java.util.Scanner;

public class NumerosNoIntervalo {

    public static void main(String[] args) {
        // Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira os dois números inteiros
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        // Determina o menor e o maior número
        int menor = Math.min(numero1, numero2);
        int maior = Math.max(numero1, numero2);

        // Imprime os números no intervalo (excluindo os próprios números)
        System.out.println("Números no intervalo entre " + menor + " e " + maior + ":");
        for (int i = menor + 1; i < maior; i++) {
            System.out.println(i);
        }

        // Fecha o Scanner
        scanner.close();
    }
}