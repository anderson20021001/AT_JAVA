package ex4.simuladorEmprestimo;

import java.util.Scanner;

public class SimuladorEmprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();


        System.out.print("Digite o valor do empréstimo: R$ ");
        double valorEmprestimo = scanner.nextDouble();


        int parcelas;
        do {
            System.out.print("Digite o número de parcelas (mínimo 6, máximo 48): ");
            parcelas = scanner.nextInt();
            if (parcelas < 6 || parcelas > 48) {
                System.out.println("Número de parcelas inválido! Escolha entre 6 e 48.");
            }
        } while (parcelas < 6 || parcelas > 48);


        double taxaJuros = 0.03;


        double valorTotal = valorEmprestimo * Math.pow(1 + taxaJuros, parcelas);
        double valorParcela = valorTotal / parcelas;


        System.out.println("\nSimulação de Empréstimo para " + nome);
        System.out.printf("Valor do Empréstimo: R$ %.2f%n", valorEmprestimo);
        System.out.printf("Número de Parcelas: %d%n", parcelas);
        System.out.printf("Valor Total a Pagar: R$ %.2f%n", valorTotal);
        System.out.printf("Valor da Parcela Mensal: R$ %.2f%n", valorParcela);

        scanner.close();
    }
}
