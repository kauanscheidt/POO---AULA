package estruturas.repeticao03;

import java.util.Scanner;

public class atividade23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o número de turmas:");
        int numeroTurmas = input.nextInt();

        if (numeroTurmas <= 0) {
            System.out.println("O número de turmas deve ser maior que zero. Programa encerrado.");
            input.close();
            return;
        }

        double somaAlunos = 0;

        for (int i = 1; i <= numeroTurmas; i++) {
            int alunosNaTurma = 0;
            boolean entradaValida = false;

            while (!entradaValida) {
                System.out.println("Informe o número de alunos para a turma " + i + ":");
                alunosNaTurma = input.nextInt();

                if (alunosNaTurma > 40) {
                    System.out.println("Uma turma não pode ter mais de 40 alunos. Por favor, tente novamente.");
                } else if (alunosNaTurma < 0) {
                    System.out.println("O número de alunos não pode ser negativo. Por favor, tente novamente.");
                } else {
                    entradaValida = true;
                }
            }
            somaAlunos += alunosNaTurma;
        }

        double mediaAlunos = somaAlunos / numeroTurmas;


        System.out.println("Total de turmas: " + numeroTurmas);
        System.out.println("Total de alunos: " + somaAlunos);
        System.out.printf("A média de alunos por turma é: %.2f%n", mediaAlunos);

        input.close();
    }
}