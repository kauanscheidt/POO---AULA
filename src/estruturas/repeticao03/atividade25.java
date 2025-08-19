package estruturas.repeticao03;

import java.text.DecimalFormat;

public class atividade25 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        final double preco_item = 1.99;

        System.out.println("Lojas Quase Dois - Tabela de preços");

        for (int i = 1; i <= 50; i++) {

            double valorTotal = i * preco_item;

            System.out.println(i + " - R$ " + df.format(valorTotal));
        }
    }
}