package vetor.matriz04;

import java.util.Scanner;


public class atividade13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int TAM = 10;

        int[] vetorA = new int[TAM];
        int[] vetorB = new int[TAM];
        int[] vetorC = new int[TAM * 2];

        System.out.println("Digite os 10 elementos do primeiro vetor:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorA[i] = input.nextInt();
        }

        System.out.println("\nDigite os 10 elementos do segundo vetor:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorB[i] = input.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            vetorC[i * 2] = vetorA[i];
            vetorC[i * 2 + 1] = vetorB[i];
        }

        System.out.println("\nVetores Resultantes:");

        // Imprimindo Vetor A
        System.out.print("Vetor A: [");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i]);
            if (i < vetorA.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Imprimindo Vetor B
        System.out.print("Vetor B: [");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i]);
            if (i < vetorB.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Vetor C (intercalado): [");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i]);
            if (i < vetorC.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        input.close();
    }
}