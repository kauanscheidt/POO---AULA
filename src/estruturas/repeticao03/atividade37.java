package estruturas.repeticao03;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int totalAlunos = 0;
        int maiorNota = -1;
        int menorNota = 11;
        double somaNotas = 0;

        char continuar = 'S';

        while (continuar == 'S' || continuar == 's') {
            totalAlunos++;
            int notaAluno = 0;

            System.out.println("\n--- Aluno " + totalAlunos + " ---");
            System.out.println("Por favor, informe suas respostas (A, B, C, D, E).");

            for (int i = 1; i <= 10; i++) {
                System.out.print("Questão " + i + ": ");
                char resposta = input.next().toUpperCase().charAt(0);

                if (i == 1 && resposta == 'A') {
                    notaAluno++;
                } else if (i == 2 && resposta == 'B') {
                    notaAluno++;
                } else if (i == 3 && resposta == 'C') {
                    notaAluno++;
                } else if (i == 4 && resposta == 'D') {
                    notaAluno++;
                } else if (i == 5 && resposta == 'E') {
                    notaAluno++;
                } else if (i == 6 && resposta == 'E') {
                    notaAluno++;
                } else if (i == 7 && resposta == 'D') {
                    notaAluno++;
                } else if (i == 8 && resposta == 'C') {
                    notaAluno++;
                } else if (i == 9 && resposta == 'B') {
                    notaAluno++;
                } else if (i == 10 && resposta == 'A') {
                    notaAluno++;
                }
            }

            System.out.println("Sua nota foi: " + notaAluno + " acertos.");

            somaNotas += notaAluno;

            if (notaAluno > maiorNota) {
                maiorNota = notaAluno;
            }
            if (notaAluno < menorNota) {
                menorNota = notaAluno;
            }

            System.out.print("\nOutro aluno vai utilizar o sistema? (S/N): ");
            continuar = input.next().charAt(0);
        }

        System.out.println("Total de alunos: " + totalAlunos);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);

        if (totalAlunos > 0) {
            double mediaNotas = somaNotas / totalAlunos;
            System.out.println("Média das notas: " + df.format(mediaNotas));
        } else {
            System.out.println("Nenhum aluno utilizou o sistema.");
        }

        input.close();
    }
}