package estruturas.repeticao03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class atividade26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Informe o preço do pão:");
        double precoPao = input.nextDouble();


        System.out.println("\nPanificadora Pão de Ontem - Tabela de preços");

        for (int i = 1; i <= 50; i++) {
            double valorTotal = i * precoPao;

            System.out.println(i + " - R$ " + df.format(valorTotal));
        }

        input.close();
    }
}