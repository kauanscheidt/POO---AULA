package estruturas.repeticao03;

import java.util.Scanner;

public class atividade24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o número total de CDs na sua coleção:");
        int numeroCDs = input.nextInt();

        if (numeroCDs <= 0) {
            System.out.println("O número de CDs deve ser maior que zero. Programa encerrado.");
            input.close();
            return;
        }

        double valorTotal = 0;

        for (int i = 1; i <= numeroCDs; i++) {
            System.out.println("Informe o valor do CD " + i + ":");
            double valorCD = input.nextDouble();

            if (valorCD < 0) {
                System.out.println("O valor de um CD não pode ser negativo. Por favor, digite um valor válido.");
                i--;
            } else {
                valorTotal += valorCD;
            }
        }

        double valorMedio = valorTotal/ numeroCDs;

        System.out.printf("Valor total investido na coleção de CDs: R$ %.2f%n", valorTotal);
        System.out.printf("Valor médio gasto por CD: R$ %.2f%n", valorMedio);

        input.close();
    }
}