import java.util.Scanner;

public class ValidarUsuarioSenha {

    public static void main(String[] args) {
        // Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        String usuario, senha;

        // Loop para garantir que a senha seja diferente do nome de usuário
        while (true) {
            // Solicita o nome de usuário
            System.out.print("Digite o nome de usuário: ");
            usuario = scanner.nextLine();

            // Solicita a senha
            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();

            // Verifica se a senha é igual ao nome de usuário
            if (senha.equals(usuario)) {
                System.out.println("Erro: A senha não pode ser igual ao nome de usuário. Tente novamente.\n");
            } else {
                System.out.println("Cadastro realizado com sucesso!");
                break; // Sai do loop quando a senha for válida
            }
        }

        // Fecha o Scanner
        scanner.close();
    }
}