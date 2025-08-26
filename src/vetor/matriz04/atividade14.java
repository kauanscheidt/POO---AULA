package vetor.matriz04;

import java.util.Scanner;

public class atividade14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int NUM_ALUNOS = 30;

        int[] idades = new int[NUM_ALUNOS];
        double[] alturas = new double[NUM_ALUNOS];
        double somaDasAlturas = 0.0;

        // --- 2. Coleta de Dados ---
        System.out.println("Insira a idade e a altura dos " + NUM_ALUNOS + " alunos:");
        for (int i = 0; i < NUM_ALUNOS; i++) {
            System.out.println("\n Aluno " + (i + 1) + ":");

            System.out.print("Digite a idade: ");
            idades[i] = input.nextInt();

            System.out.print("Digite a altura (em metros, ex: 1,75): ");
            alturas[i] = input.nextDouble();

            somaDasAlturas += alturas[i];
        }


        double mediaDeAltura = somaDasAlturas / NUM_ALUNOS;

        int contadorDeAlunos = 0;
        for (int i = 0; i < NUM_ALUNOS; i++) {
            if (idades[i] > 13 && alturas[i] < mediaDeAltura) {
                contadorDeAlunos++;
            }
        }


        System.out.printf("A média de altura da turma é: %.2f metros.\n", mediaDeAltura);
        System.out.println("Total de alunos com mais de 13 anos e altura inferior à média: " + contadorDeAlunos);

        input.close();
    }
}