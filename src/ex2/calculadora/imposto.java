package ex2.calculadora;
import java.util.Scanner;

public class imposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu salário mensal: ");
        double salarioMensal = scanner.nextDouble();


        double salarioAnual = salarioMensal * 12;


        double imposto = calcularImposto(salarioAnual);
        double salarioLiquido = salarioAnual - imposto;


        System.out.println("\nNome: " + nome);
        System.out.printf("Salário Anual: R$ %.2f%n", salarioAnual);
        System.out.printf("Imposto a pagar: R$ %.2f%n", imposto);
        System.out.printf("Salário Líquido Anual: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }

    public static double calcularImposto(double salarioAnual) {
        if (salarioAnual <= 22847.76) return 0;
        if (salarioAnual <= 33919.80) return (salarioAnual - 22847.76) * 0.075;
        if (salarioAnual <= 45012.60) return (salarioAnual - 33919.80) * 0.15 + (33919.80 - 22847.76) * 0.075;
        return (salarioAnual - 45012.60) * 0.275 + (45012.60 - 33919.80) * 0.15 + (33919.80 - 22847.76) * 0.075;
    }
}
