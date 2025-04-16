package ex11.simulacaoLoteria;

import java.util.Scanner;

public class LoteriaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimulacaoLoteria loteria = new SimulacaoLoteria();


        int[] numerosSorteados = loteria.gerarNumeros();

        System.out.println("Números sorteados pela loteria (você não os verá): ");
        for (int numero : numerosSorteados) {
            System.out.print(numero + " ");
        }
        System.out.println("\n");


        int[] numerosUsuario = new int[6];
        System.out.println("Digite seus 6 números (entre 1 e 60):");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numerosUsuario[i] = scanner.nextInt();
        }


        int acertos = loteria.compararNumeros(numerosSorteados, numerosUsuario);
        System.out.println("\nVocê acertou " + acertos + " número(s)!");

        scanner.close();
    }
}
