package vetor.matriz05;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class atividade01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tam;

        do {
            System.out.println("Entre com um valor IMPAR entre 3 e 11 para o tamanho da matriz:");
            tam = input.nextInt();
        } while (tam < 3 || tam > 11 || tam % 2 == 0);

        int[][] matriz = new int[tam][tam];

        for (int linha = 0; linha < tam; linha++) {
            for (int coluna = 0; coluna < tam; coluna++) {
                System.out.println("Insira o valor para a linha " + (linha+1) + ", coluna " + (coluna+1) + ":");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        int somaElementos = 0;
        int maior = matriz[0][0];
        int menor = matriz[0][0];
        int contP = 0;
        int contI = 0;
        int somaDiagonalP = 0;
        int somaDiagonalS = 0;

        for (int linha = 0; linha < tam; linha++) {
            for (int coluna = 0; coluna < tam; coluna++) {
                int elemento = matriz[linha][coluna];

                somaElementos += elemento;

                if (elemento < menor) {
                    menor = elemento;
                }
                if (elemento > maior) {
                    maior = elemento;
                }

                if (elemento % 2 == 0) {
                    contP++;
                } else {
                    contI++;
                }
            }
            somaDiagonalP += matriz[linha][linha];
            somaDiagonalS += matriz[linha][tam - 1 - linha];
        }

        double medElementos = (double) somaElementos / (tam * tam);

        System.out.println("\nMatriz informada:");
        for (int linha = 0; linha < tam; linha++) {
            for (int coluna = 0; coluna < tam; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSoma dos elementos: " + somaElementos);
        System.out.printf("Média dos elementos: %.2f\n", medElementos);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Contador de pares: " + contP);
        System.out.println("Contador de ímpares: " + contI);
        System.out.println("Soma da diagonal principal: " + somaDiagonalP);
        System.out.println("Soma da diagonal secundária: " + somaDiagonalS);

        try {
            PrintWriter saida = new PrintWriter(new FileWriter("SaidaMatriz.txt"));

            saida.println("Matriz informada:");
            for (int linha = 0; linha < tam; linha++) {
                for (int coluna = 0; coluna < tam; coluna++) {
                    saida.print(matriz[linha][coluna] + "\t");
                }
                saida.println();
            }

            saida.println("\nSoma dos elementos: " + somaElementos);
            saida.printf("Média dos elementos: %.2f\n", medElementos);
            saida.println("Maior valor: " + maior);
            saida.println("Menor valor: " + menor);
            saida.println("Contador de pares: " + contP);
            saida.println("Contador de ímpares: " + contI);
            saida.println("Soma da diagonal principal: " + somaDiagonalP);
            saida.println("Soma da diagonal secundária: " + somaDiagonalS);

            saida.close();
            System.out.println("\nDados salvos em SaidaMatriz.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }

        input.close();
    }
}