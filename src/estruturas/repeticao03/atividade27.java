package estruturas.repeticao03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class atividade27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        while (true) {
            System.out.println("\nLojas Tabajara");
            double totalCompra = 0;
            int contadorProdutos = 1;
            double precoProduto = -1;

            while (precoProduto != 0) {
                System.out.println("Produto " + contadorProdutos + ":");
                precoProduto = input.nextDouble();

                if (precoProduto < 0) {
                    System.out.println("Preço inválido. Digite um valor positivo.");
                    continue;
                }

                if (precoProduto != 0) {
                    totalCompra += precoProduto;
                    contadorProdutos++;
                }
            }


            if (totalCompra == 0) {
                System.out.println("Compra finalizada. Nenhum produto registrado.");
            } else {
                System.out.println("Total: R$ " + df.format(totalCompra));

                System.out.println("Dinheiro: R$ ");
                double valorDinheiro = input.nextDouble();

                double troco = valorDinheiro - totalCompra;

                System.out.println("Troco: R$ " + df.format(troco));
            }
        }

    }
}