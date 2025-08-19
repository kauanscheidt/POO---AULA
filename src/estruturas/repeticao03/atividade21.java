package estruturas.repeticao03;

import java.util.Scanner;

public class atividade21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o número de pessoas na turma:");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("O número de pessoas deve ser maior que zero. Programa encerrado.");
            input.close();
            return;
        }

        int somaIdades = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Informe a idade da pessoa " + i + ":");
            int idade = input.nextInt();
            somaIdades += idade;
        }

        double mediaIdade = (double) somaIdades / n;

        System.out.printf("A média de idade da turma é: %.2f%n", mediaIdade);

        if (mediaIdade >= 0 && mediaIdade <= 25) {
            System.out.println("A turma é JOVEM.");
        } else if (mediaIdade >= 26 && mediaIdade <= 60) {
            System.out.println("A turma é ADULTA.");
        } else {
            System.out.println("A turma é IDOSA.");
        }

        input.close();
    }
}