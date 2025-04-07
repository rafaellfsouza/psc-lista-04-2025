ublic class NumerosImpares {

    public static void main(String[] args) {
        System.out.println("Números ímpares entre 1 e 50:");

        // Loop para percorrer os números de 1 a 50
        for (int i = 1; i <= 50; i++) {
            // Verifica se o número é ímpar
            if (i % 2 != 0) {
                System.out.println(i); // Imprime o número ímpar
            }
        }
    }
}