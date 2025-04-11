package ex10.simulacaoLoteria;

import java.util.Random;

public class SimulacaoLoteria {
    public int[] gerarNumeros() {
        Random rand = new Random();
        int[] numerosSorteados = new int[6];

        for (int i = 0; i < 6; i++) {
            int numero;
            do {
                numero = rand.nextInt(60) + 1;
            } while (jaFoiSorteado(numerosSorteados, numero));

            numerosSorteados[i] = numero;
        }

        return numerosSorteados;
    }

    // Verifica se o número já foi sorteado
    private boolean jaFoiSorteado(int[] sorteados, int numero) {
        for (int sorteado : sorteados) {
            if (sorteado == numero) {
                return true;
            }
        }
        return false;
    }

    // Método para comparar os números do usuário com os sorteados
    public int compararNumeros(int[] numerosSorteados, int[] numerosUsuario) {
        int acertos = 0;

        for (int numeroUsuario : numerosUsuario) {
            for (int numeroSorteado : numerosSorteados) {
                if (numeroUsuario == numeroSorteado) {
                    acertos++;
                }
            }
        }

        return acertos;
    }
}
