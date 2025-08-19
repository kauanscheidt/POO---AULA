package estruturas.repeticao03;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double totalGeral = 0;
        int codigoItem = -1;

        System.out.println("Cardápio:");
        System.out.println("Cachorro Quente (100): R$ 1,20");
        System.out.println("Bauru Simples (101): R$ 1,30");
        System.out.println("Bauru com Ovo (102): R$ 1,50");
        System.out.println("Hambúrguer (103): R$ 1,20");
        System.out.println("Cheeseburguer (104): R$ 1,30");
        System.out.println("Refrigerante (105): R$ 1,00");
        System.out.println("\nDigite o código do item (ou 0 para encerrar o pedido).");

        while (codigoItem != 0) {
            System.out.print("\nCódigo do item: ");
            codigoItem = input.nextInt();

            if (codigoItem == 0) {
                break;
            }

            double precoUnitario = 0;
            String nomeItem = "";

            switch (codigoItem) {
                case 100:
                    precoUnitario = 1.20;
                    nomeItem = "Cachorro Quente";
                    break;
                case 101:
                    precoUnitario = 1.30;
                    nomeItem = "Bauru Simples";
                    break;
                case 102:
                    precoUnitario = 1.50;
                    nomeItem = "Bauru com Ovo";
                    break;
                case 103:
                    precoUnitario = 1.20;
                    nomeItem = "Hambúrguer";
                    break;
                case 104:
                    precoUnitario = 1.30;
                    nomeItem = "Cheeseburguer";
                    break;
                case 105:
                    precoUnitario = 1.00;
                    nomeItem = "Refrigerante";
                    break;
                default:
                    System.out.println("Código inválido. Tente novamente.");
                    continue;
            }

            System.out.print("Quantidade desejada: ");
            int quantidade = input.nextInt();

            if (quantidade <= 0) {
                System.out.println("Quantidade inválida. Tente novamente.");
                continue;
            }


            double valorItem = precoUnitario * quantidade;
            totalGeral += valorItem;


            System.out.println("Valor a pagar por " + nomeItem + ": R$ " + df.format(valorItem));
        }


        System.out.println("\n--- Resumo do Pedido ---");
        System.out.println("Total Geral: R$ " + df.format(totalGeral));

        input.close();
    }
}