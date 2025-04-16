package ex12.ChatSimples;

import java.util.Scanner;

public class ChatSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o nome do primeiro usuário: ");
        String usuario1 = scanner.nextLine();

        System.out.print("Digite o nome do segundo usuário: ");
        String usuario2 = scanner.nextLine();


        String[] mensagens = new String[10];

        int contador = 0;


        while (contador < 10) {
            if (contador % 2 == 0) {
                System.out.print(usuario1 + ", digite sua mensagem: ");
                mensagens[contador] = scanner.nextLine();
            } else {  // Usuário 2 envia
                System.out.print(usuario2 + ", digite sua mensagem: ");
                mensagens[contador] = scanner.nextLine();
            }
            contador++;
        }


        System.out.println("\n===== Histórico de Mensagens =====");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(usuario1 + ": " + mensagens[i]);
            } else {
                System.out.println(usuario2 + ": " + mensagens[i]);
            }
        }


        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês! 🚀");

        scanner.close();
    }
}
