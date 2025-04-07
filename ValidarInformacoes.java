import java.util.Scanner;

public class ValidarInformacoes {

    public static void main(String[] args) {
        // Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo, estadoCivil;

        // Validação do Nome
        while (true) {
            System.out.print("Digite o nome (maior que 3 caracteres): ");
            nome = scanner.nextLine();
            if (nome.length() > 3) {
                break;
            } else {
                System.out.println("Erro: O nome deve ter mais de 3 caracteres. Tente novamente.");
            }
        }

        // Validação da Idade
        while (true) {
            System.out.print("Digite a idade (entre 0 e 150): ");
            idade = scanner.nextInt();
            if (idade >= 0 && idade <= 150) {
                break;
            } else {
                System.out.println("Erro: A idade deve estar entre 0 e 150. Tente novamente.");
            }
        }

        // Validação do Salário
        while (true) {
            System.out.print("Digite o salário (maior que zero): ");
            salario = scanner.nextDouble();
            if (salario > 0) {
                break;
            } else {
                System.out.println("Erro: O salário deve ser maior que zero. Tente novamente.");
            }
        }

        // Limpar o buffer do teclado
        scanner.nextLine();

        // Validação do Sexo
        while (true) {
            System.out.print("Digite o sexo ('f' para feminino ou 'm' para masculino): ");
            sexo = scanner.nextLine().toLowerCase().charAt(0);
            if (sexo == 'f' || sexo == 'm') {
                break;
            } else {
                System.out.println("Erro: O sexo deve ser 'f' ou 'm'. Tente novamente.");
            }
        }

        // Validação do Estado Civil
        while (true) {
            System.out.print("Digite o estado civil ('s' para solteiro, 'c' para casado, 'v' para viúvo, 'd' para divorciado): ");
            estadoCivil = scanner.nextLine().toLowerCase().charAt(0);
            if (estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd') {
                break;
            } else {
                System.out.println("Erro: O estado civil deve ser 's', 'c', 'v' ou 'd'. Tente novamente.");
            }
        }

        // Exibição das informações válidas
        System.out.println("\n--- Informações Válidas ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        // Fecha o Scanner
        scanner.close();
    }
}