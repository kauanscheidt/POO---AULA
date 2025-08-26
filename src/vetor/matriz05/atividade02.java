package vetor.matriz05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {

        final int NUM_PRODUTOS = 5;
        final int NUM_SUPERMERCADOS = 5;
        Scanner scanner = new Scanner(System.in);

        double[][] precos = new double[NUM_PRODUTOS][NUM_SUPERMERCADOS];

        System.out.println("Insira os preços dos produtos.");
        for (int i = 0; i < NUM_PRODUTOS; i++) {
            for (int j = 0; j < NUM_SUPERMERCADOS; j++) {
                System.out.print("Preco do Produto " + (i + 1) + " no Supermercado " + (j + 1) + ": ");
                String precoStr = scanner.nextLine();
                precoStr = precoStr.replace(',', '.');
                precos[i][j] = Double.parseDouble(precoStr);
            }
            System.out.println();
        }

        System.out.println("\n1. Tabela de Preços (Produto x Supermercado)");
        for (int i = 0; i < NUM_PRODUTOS; i++) {
            System.out.print("Produto " + (i + 1) + ":\t");
            for (int j = 0; j < NUM_SUPERMERCADOS; j++) {
                System.out.printf("R$ %.2f\t", precos[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n2. Média de preço por produto");
        for (int i = 0; i < NUM_PRODUTOS; i++) {
            double somaProduto = 0;
            for (int j = 0; j < NUM_SUPERMERCADOS; j++) {
                somaProduto += precos[i][j];
            }
            double mediaProduto = somaProduto / NUM_SUPERMERCADOS;
            System.out.printf("Produto %d: R$ %.2f\n", (i + 1), mediaProduto);
        }

        System.out.println("\n3. Soma de preços por supermercado");
        double[] somaPorSupermercado = new double[NUM_SUPERMERCADOS];
        for (int j = 0; j < NUM_SUPERMERCADOS; j++) {
            double somaSupermercado = 0;
            for (int i = 0; i < NUM_PRODUTOS; i++) {
                somaSupermercado += precos[i][j];
            }
            somaPorSupermercado[j] = somaSupermercado;
            System.out.printf("Supermercado %d: R$ %.2f\n", (j + 1), somaSupermercado);
        }

        System.out.println("\n4. Valor total no supermercado mais barato e no mais caro");
        double maisBarato = somaPorSupermercado[0];
        double maisCaro = somaPorSupermercado[0];
        for (int j = 1; j < NUM_SUPERMERCADOS; j++) {
            if (somaPorSupermercado[j] < maisBarato) {
                maisBarato = somaPorSupermercado[j];
            }
            if (somaPorSupermercado[j] > maisCaro) {
                maisCaro = somaPorSupermercado[j];
            }
        }
        System.out.printf("Custo total no supermercado mais barato: R$ %.2f\n", maisBarato);
        System.out.printf("Custo total no supermercado mais caro: R$ %.2f\n", maisCaro);

        // Gravar dados em arquivo
        try (PrintWriter saida = new PrintWriter(new FileWriter("precos_supermercados.txt"))) {
            for (int i = 0; i < NUM_PRODUTOS; i++) {
                for (int j = 0; j < NUM_SUPERMERCADOS; j++) {
                    saida.print(precos[i][j] + " ");
                }
                saida.println();
            }
            System.out.println("\nDados gravados com sucesso em 'precos_supermercados.txt'");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao gravar o arquivo.");
            e.printStackTrace();
        }

        // Exemplo de como ler os dados do arquivo
        try (Scanner leitorArquivo = new Scanner(new File("precos_supermercados.txt"))) {
            System.out.println("\nDemonstração de leitura do arquivo...");
            // Apenas para confirmar que o arquivo pode ser lido.
            // O código para processar os dados lidos seria similar ao acima.
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo 'precos_supermercados.txt' nao encontrado para leitura.");
        }

        scanner.close();
    }
}