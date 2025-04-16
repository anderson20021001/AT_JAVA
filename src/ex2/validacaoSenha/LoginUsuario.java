package ex2.validacaoSenha;

import java.util.Scanner;

public class LoginUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        String senha;
        do {
            System.out.print("Digite sua senha: ");
            senha = scanner.nextLine();
            String erro = validarSenha(senha);

            if (erro != null) {
                System.out.println("Erro: " + erro);
            } else {
                System.out.println("Senha válida! Cadastro concluído.");
                break;
            }
        } while (true);

        scanner.close();
    }

    public static String validarSenha(String senha) {
        if (senha.length() < 8) return "A senha deve ter pelo menos 8 caracteres.";
        if (!senha.matches(".*[A-Z].*")) return "A senha deve conter pelo menos uma letra maiúscula.";
        if (!senha.matches(".*[0-9].*")) return "A senha deve conter pelo menos um número.";
        if (!senha.matches(".*[@#$%^&+=].*")) return "A senha deve conter pelo menos um caractere especial (@, #, $, etc.).";
        return null; // Senha válida
    }
}
