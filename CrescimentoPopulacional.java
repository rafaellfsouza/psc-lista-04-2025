public class CrescimentoPopulacional {

    public static void main(String[] args) {
        // População inicial dos países A e B
        double populacaoA = 80000;
        double populacaoB = 200000;

        // Taxas de crescimento anual
        double taxaCrescimentoA = 0.03; // 3%
        double taxaCrescimentoB = 0.015; // 1.5%

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
        System.out.println("Serão necessários " + anos + " anos para que a população do país A");
        System.out.println("ultrapasse ou iguale a população do país B.");
        System.out.printf("População de A: %.0f\n", populacaoA);
        System.out.printf("População de B: %.0f\n", populacaoB);
    }
}