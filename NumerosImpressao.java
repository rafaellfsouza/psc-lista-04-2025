public class NumerosImpressao {

    public static void main(String[] args) {
        // Imprime os números de 1 a 20, um abaixo do outro
        System.out.println("Números de 1 a 20 (um abaixo do outro):");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i); // Imprime cada número em uma nova linha
        }

        // Imprime os números de 1 a 20, um ao lado do outro
        System.out.print("\nNúmeros de 1 a 20 (um ao lado do outro): ");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " "); // Imprime cada número na mesma linha, separado por espaço
        }
        System.out.println(); // Pula uma linha no final para melhorar a formatação
    }
}