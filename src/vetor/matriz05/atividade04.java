package vetor.matriz05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class atividade04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nomeArquivo = "saltos_atletas.txt";
        final int NUM_SALTOS = 5;

        System.out.print("Deseja carregar dados do arquivo '" + nomeArquivo + "'? (s/n): ");
        String resposta = in.nextLine();

        int numAtletas;
        String[] nomes;
        double[][] saltos;

        if (resposta.equalsIgnoreCase("s")) {
            try (Scanner leitorArquivo = new Scanner(new File(nomeArquivo))) {
                numAtletas = Integer.parseInt(leitorArquivo.nextLine());
                nomes = new String[numAtletas];
                saltos = new double[numAtletas][NUM_SALTOS];

                for(int i = 0; i < numAtletas; i++) {
                    nomes[i] = leitorArquivo.nextLine();
                    String[] saltosStr = leitorArquivo.nextLine().split(" ");
                    for(int j = 0; j < NUM_SALTOS; j++) {
                        saltos[i][j] = Double.parseDouble(saltosStr[j]);
                    }
                }
                System.out.println("Dados de " + numAtletas + " atletas carregados do arquivo.");

            } catch (FileNotFoundException e) {
                System.out.println("Arquivo nao encontrado. O programa sera encerrado.");
                in.close();
                return;
            }
        } else {
            System.out.print("\nInforme o numero de atletas na competicao: ");
            numAtletas = Integer.parseInt(in.nextLine());

            nomes = new String[numAtletas];
            saltos = new double[numAtletas][NUM_SALTOS];

            for (int i = 0; i < numAtletas; i++) {
                System.out.print("\nNome do Atleta " + (i + 1) + ": ");
                nomes[i] = in.nextLine();

                double somaSaltos = 0;
                double piorSalto = Double.MAX_VALUE;

                System.out.println("Digite os 5 saltos para " + nomes[i] + ":");
                for (int j = 0; j < NUM_SALTOS; j++) {
                    System.out.print("Salto " + (j + 1) + ": ");
                    saltos[i][j] = Double.parseDouble(in.nextLine().replace(',', '.'));
                    somaSaltos += saltos[i][j];
                    if (saltos[i][j] < piorSalto) {
                        piorSalto = saltos[i][j];
                    }
                }

                double mediaAjustada = (somaSaltos - piorSalto) / (NUM_SALTOS - 1);
                System.out.printf(" >> Media do atleta %s (descartando pior salto): %.2f\n", nomes[i], mediaAjustada);
            }

            // Salva os dados que foram digitados
            try (PrintWriter saida = new PrintWriter(new FileWriter(nomeArquivo))) {
                saida.println(numAtletas);
                for (int i = 0; i < numAtletas; i++) {
                    saida.println(nomes[i]);
                    for (int j = 0; j < NUM_SALTOS; j++) {
                        saida.print(saltos[i][j] + " ");
                    }
                    saida.println();
                }
                System.out.println("\nDados dos atletas foram salvos em '" + nomeArquivo + "'");
            } catch (IOException e) {
                System.out.println("Erro ao salvar o arquivo.");
            }
        }



        double[] mediasFinais = new double[numAtletas];


        for (int i = 0; i < numAtletas; i++) {
            double somaSaltos = 0;
            double piorSalto = saltos[i][0];
            for (int j = 0; j < NUM_SALTOS; j++) {
                somaSaltos += saltos[i][j];
                if (saltos[i][j] < piorSalto) {
                    piorSalto = saltos[i][j];
                }
            }
            mediasFinais[i] = (somaSaltos - piorSalto) / (NUM_SALTOS - 1);
        }


        int indiceCampeao = 0;
        int indiceUltimo = 0;
        for (int i = 1; i < numAtletas; i++) {
            if (mediasFinais[i] > mediasFinais[indiceCampeao]) {
                indiceCampeao = i;
            }
            if (mediasFinais[i] < mediasFinais[indiceUltimo]) {
                indiceUltimo = i;
            }
        }


        for (int i = 0; i < numAtletas; i++) {
            System.out.print("Atleta: " + nomes[i] + "\nSaltos: ");
            for(int j = 0; j < NUM_SALTOS; j++) {
                System.out.printf("%.2f m; ", saltos[i][j]);
            }
            System.out.printf("\nMedia Final: %.2f\n\n", mediasFinais[i]);
        }

        System.out.printf("Campeao: %s (Media: %.2f)\n", nomes[indiceCampeao], mediasFinais[indiceCampeao]);
        System.out.printf("Ultimo Lugar: %s (Media: %.2f)\n", nomes[indiceUltimo], mediasFinais[indiceUltimo]);

        in.close();
    }
}