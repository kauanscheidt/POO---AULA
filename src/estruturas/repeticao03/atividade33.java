package estruturas.repeticao03;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Informe o valor inicial da dívida:");
        double valorDividaInicial = input.nextDouble();

        System.out.println("\nValor da Dívida\t\tValor dos Juros\t\tQtd. de Parcelas\tValor da Parcela");
        System.out.println("----------------------------------------------------------------------------------");

        int quantidadeParcelas;
        double taxaJuros;

        for (int i = 0; i < 5; i++) {

            if (i == 0) {
                quantidadeParcelas = 1;
                taxaJuros = 0;
            } else if (i == 1) {
                quantidadeParcelas = 3;
                taxaJuros = 10;
            } else if (i == 2) {
                quantidadeParcelas = 6;
                taxaJuros = 15;
            } else if (i == 3) {
                quantidadeParcelas = 9;
                taxaJuros = 20;
            } else { // i == 4
                quantidadeParcelas = 12;
                taxaJuros = 25;
            }

            double valorJuros = valorDividaInicial * (taxaJuros / 100);
            double valorTotalDivida = valorDividaInicial + valorJuros;
            double valorParcela = valorTotalDivida / quantidadeParcelas;

            System.out.println("R$ " + df.format(valorTotalDivida) + "\t\tR$ " + df.format(valorJuros) + "\t\t" + quantidadeParcelas + "\t\t\t\t\tR$ " + df.format(valorParcela));;
            System.out.println();
        }

        input.close();
    }
}