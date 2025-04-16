package ex10.registroCompras;

import java.io.*;
import java.util.Scanner;

public class ComprasApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeArquivo = "compras.txt";


        File arquivo = new File(nomeArquivo);


        RegistroCompras[] compras = new RegistroCompras[3];


        for (int i = 0; i < 3; i++) {
            System.out.println("Cadastro da compra " + (i + 1));

            System.out.print("Produto: ");
            String produto = scanner.nextLine();

            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();

            System.out.print("Preço unitário: R$ ");
            double precoUnitario = scanner.nextDouble();
            scanner.nextLine();

            compras[i] = new RegistroCompras(produto, quantidade, precoUnitario);
        }


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, false))) {
            for (RegistroCompras compra : compras) {
                writer.write(compra.salvarCompra());
                writer.newLine();
            }
            System.out.println("Compras cadastradas com sucesso no arquivo!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar no arquivo: " + e.getMessage());
        }


        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            System.out.println("\nCompras registradas:");

            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                String produto = dados[0];
                int quantidade = Integer.parseInt(dados[1]);
                double precoUnitario = Double.parseDouble(dados[2]);

                RegistroCompras compra = new RegistroCompras(produto, quantidade, precoUnitario);
                System.out.println(compra.exibirCompra());
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        scanner.close();
    }
}
