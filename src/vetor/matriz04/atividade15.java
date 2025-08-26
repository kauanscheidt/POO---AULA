package vetor.matriz04;

import java.util.Scanner;

public class atividade15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int N = 5;

        int[] valores = new int[N];

        System.out.println("Digite " + N + " valores para gerar o gráfico ");
        System.out.println("Atenção: Somente valores entre 0 e 20 (inclusive) serão aceitos.");

        for (int i = 0; i < N; i++) {
            int numeroDigitado;

            do {
                System.out.print("Digite o valor " + (i + 1) + ": ");
                numeroDigitado = input.nextInt();

                if (numeroDigitado < 0 || numeroDigitado > 20) {
                    System.out.println("--> Valor inválido! Tente novamente.");
                }

            } while (numeroDigitado < 0 || numeroDigitado > 20);

            valores[i] = numeroDigitado;
        }

        System.out.println("\n--- Gráfico de Valores ---");

        for (int valor : valores) {
            System.out.print(valor + ": ");
            for (int j = 0; j < valor; j++) {
                System.out.print("#");
            }

            System.out.println();
        }

        input.close();
    }
}