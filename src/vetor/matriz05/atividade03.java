package vetor.matriz05;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class atividade03 {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o número de alunos na escola: ");
        final int TAM = Integer.parseInt(input.nextLine());

        String[] nome = new String[TAM];
        float[][] nota = new float[TAM][2];
        float[] media = new float[TAM];
        int Lmaior = 0;
        int Cmaior = 0;
        int Lmenor = 0;
        int Cmenor = 0;
        int maiorMedIdx = 0;
        int menorMedIdx = 0;
        float medGeral = 0;
        float somaTotalNotas = 0;

        for (int linha = 0; linha < TAM; linha++) {
            System.out.println("Insira o nome do aluno "+(linha+1)+": ");
            nome[linha] = input.nextLine();

            System.out.println("Entre com a nota 1: ");
            nota[linha][0] = Float.parseFloat(input.nextLine().replace(',', '.'));

            System.out.println("Entre com a nota 2: ");
            nota[linha][1] = Float.parseFloat(input.nextLine().replace(',', '.'));

            media[linha] = (nota[linha][0] + nota[linha][1]) / 2.0f;
        }

        for (int linha = 0; linha < TAM; linha++) {
            somaTotalNotas += nota[linha][0] + nota[linha][1];


            if (nota[linha][0] > nota[Lmaior][Cmaior]) { Lmaior = linha; Cmaior = 0; }
            if (nota[linha][1] > nota[Lmaior][Cmaior]) { Lmaior = linha; Cmaior = 1; }
            if (nota[linha][0] < nota[Lmenor][Cmenor]) { Lmenor = linha; Cmenor = 0; }
            if (nota[linha][1] < nota[Lmenor][Cmenor]) { Lmenor = linha; Cmenor = 1; }

            if (media[linha] > media[maiorMedIdx]) { maiorMedIdx = linha; }
            if (media[linha] < media[menorMedIdx]) { menorMedIdx = linha; }
        }

        medGeral = somaTotalNotas / (TAM * 2);

        for (int linha = 0; linha < TAM; linha++) {
            System.out.println("Aluno: "+nome[linha]);
            System.out.printf("Notas: %.1f e %.1f\n", nota[linha][0], nota[linha][1]);
            System.out.printf("Média: %.1f\n\n", media[linha]);
        }

        System.out.printf("Maior nota: %.1f (Aluno: %s)\n", nota[Lmaior][Cmaior], nome[Lmaior]);
        System.out.printf("Menor nota: %.1f (Aluno: %s)\n", nota[Lmenor][Cmenor], nome[Lmenor]);
        System.out.printf("Maior média: %.1f (Aluno: %s)\n", media[maiorMedIdx], nome[maiorMedIdx]);
        System.out.printf("Menor média: %.1f (Aluno: %s)\n", media[menorMedIdx], nome[menorMedIdx]);
        System.out.printf("Média geral da turma: %.1f\n\n", medGeral);

        for (int i = 0; i < TAM; i++) {
            if (media[i] > medGeral) {
                System.out.println(nome[i]+" esta acima da média geral.");
            } else if (media[i] < medGeral) {
                System.out.println(nome[i]+" esta abaixo da média geral.");
            } else {
                System.out.println(nome[i]+" esta exatamente na média geral.");
            }
        }

        input.close();

        try {
            PrintWriter saida = new PrintWriter( new FileWriter("Notas_Refinado.txt"));

            saida.println("Relatorio da Turma");
            for (int linha = 0; linha < TAM; linha++) {
                saida.println("\nAluno: "+nome[linha]);
                saida.printf("Notas: %.1f e %.1f\n", nota[linha][0], nota[linha][1]);
                saida.printf("Média: %.1f\n", media[linha]);
            }

            saida.println("\nResumo Geral");
            saida.printf("Maior nota: %.1f (Aluno: %s)\n", nota[Lmaior][Cmaior], nome[Lmaior]);
            saida.printf("Menor nota: %.1f (Aluno: %s)\n", nota[Lmenor][Cmenor], nome[Lmenor]);
            saida.printf("Maior média: %.1f (Aluno: %s)\n", media[maiorMedIdx], nome[maiorMedIdx]);
            saida.printf("Menor média: %.1f (Aluno: %s)\n", media[menorMedIdx], nome[menorMedIdx]);
            saida.printf("Média geral da turma: %.1f\n", medGeral);

            saida.println("\nDesempenho dos Alunos");
            for (int i = 0; i < TAM; i++) {
                if (media[i] > medGeral) {
                    saida.println(nome[i]+" esta acima da média geral.");
                } else if (media[i] < medGeral) {
                    saida.println(nome[i]+" esta abaixo da média geral.");
                } else {
                    saida.println(nome[i]+" esta exatamente na média geral.");
                }
            }

            saida.close();
            System.out.println("\nRelatorio salvo em 'Notas_Refinado.txt'");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}