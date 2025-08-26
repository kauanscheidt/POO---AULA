package vetor.matriz04;

import java.util.Scanner;
import java.util.Arrays;

public class atividade09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = input.nextLine();

        char[] vetorDeCaracteres = texto.toCharArray();

        System.out.println("O texto em um vetor de caracteres é: " + Arrays.toString(vetorDeCaracteres));

        System.out.println("Cada caractere em uma posição do vetor:");
        for (int i = 0; i < vetorDeCaracteres.length; i++) {
            System.out.println("Posição " + i + ": " + vetorDeCaracteres[i]);
        }

        input.close();
    }
}