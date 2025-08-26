package vetor.matriz05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class atividade05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String nomeArquivo = "cartelas_loteria.txt";

        final int NUMEROS_POR_CARTELA = 6;
        final int VALOR_MAXIMO = 60;

        int[] numerosSorteados = {7, 13, 22, 34, 45, 58};
        Arrays.sort(numerosSorteados);

        int quantCartelas;
        int[][] cartelas;

        System.out.print("Deseja carregar cartelas do arquivo '" + nomeArquivo + "'? (s/n): ");
        String resposta = input.nextLine();

        if (resposta.equalsIgnoreCase("s")) {
            try (Scanner leitorArquivo = new Scanner(new File(nomeArquivo))) {
                quantCartelas = Integer.parseInt(leitorArquivo.nextLine());
                cartelas = new int[quantCartelas][NUMEROS_POR_CARTELA];

                for(int i = 0; i < quantCartelas; i++) {
                    String[] numerosStr = leitorArquivo.nextLine().split(" ");
                    for(int j = 0; j < NUMEROS_POR_CARTELA; j++) {
                        cartelas[i][j] = Integer.parseInt(numerosStr[j]);
                    }
                }
                System.out.println(quantCartelas + " cartelas carregadas do arquivo com sucesso.");

            } catch (FileNotFoundException e) {
                System.out.println("Arquivo nao encontrado. O programa sera encerrado.");
                input.close();
                return;
            }
        } else {
            System.out.print("\nQuantas cartelas deseja preencher? ");
            quantCartelas = Integer.parseInt(input.nextLine());
            cartelas = new int[quantCartelas][NUMEROS_POR_CARTELA];

            for (int i = 0; i < quantCartelas; i++) {
                int numerosGerados = 0;
                while (numerosGerados < NUMEROS_POR_CARTELA) {
                    int novoNumero = random.nextInt(VALOR_MAXIMO) + 1; // Gera número de 1 a 60

                    boolean repetido = false;
                    for (int j = 0; j < numerosGerados; j++) {
                        if (cartelas[i][j] == novoNumero) {
                            repetido = true;
                            break;
                        }
                    }

                    if (!repetido) {
                        cartelas[i][numerosGerados] = novoNumero;
                        numerosGerados++;
                    }
                }

                Arrays.sort(cartelas[i]);
            }
            System.out.println(quantCartelas + " cartelas geradas aleatoriamente.");


            try (PrintWriter saida = new PrintWriter(new FileWriter(nomeArquivo))) {
                saida.println(quantCartelas);
                for (int i = 0; i < quantCartelas; i++) {
                    for (int j = 0; j < NUMEROS_POR_CARTELA; j++) {
                        saida.print(cartelas[i][j] + " ");
                    }
                    saida.println();
                }
                System.out.println("Cartelas salvas com sucesso em '" + nomeArquivo + "'");
            } catch (IOException e) {
                System.out.println("Erro ao salvar o arquivo.");
            }
        }


        System.out.println("Numeros Sorteados: " + Arrays.toString(numerosSorteados));
        System.out.println();

        for (int i = 0; i < quantCartelas; i++) {
            int acertos = 0;

            for (int j = 0; j < NUMEROS_POR_CARTELA; j++) {
                for (int k = 0; k < NUMEROS_POR_CARTELA; k++) {
                    if (cartelas[i][j] == numerosSorteados[k]) {
                        acertos++;
                        break;
                    }
                }
            }
            System.out.println("Cartela " + (i + 1) + ": " + Arrays.toString(cartelas[i]) + " -> " + acertos + " acertos");
        }

        input.close();
    }
}