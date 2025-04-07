import java.util.Scanner;

public class ValidarNota {

    public static void main(String[] args) {
        // Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        double nota;

        // Loop para garantir que a nota esteja no intervalo válido
        while (true) {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextDouble();

            // Verifica se a nota está no intervalo válido
            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota válida: " + nota);
                break; // Sai do loop quando a nota for válida
            } else {
                System.out.println("Valor inválido! A nota deve estar entre 0 e 10. Tente novamente.");
            }
        }

        // Fecha o Scanner
        scanner.close();
    }
}