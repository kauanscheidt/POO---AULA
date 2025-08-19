package estruturas.repeticao03;

import java.util.Scanner;

public class atividade31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int alunoMaisAlto = 0;
        int alunoMaisBaixo = 0;
        double maiorAltura = -99999;
        double menorAltura = 99999;

        for (int i = 1; i <= 10; i++) {
            System.out.println("\n--- Aluno " + i + " ---");
            System.out.println("Informe o número do aluno:");
            int numAluno = input.nextInt();

            System.out.println("Informe a altura em centímetros:");
            double altura = input.nextDouble();


            if (altura > maiorAltura) {
                maiorAltura = altura;
                alunoMaisAlto = numAluno;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
                alunoMaisBaixo = numAluno;
            }
        }


        System.out.println("Aluno mais alto: ");
        System.out.println("Número do aluno: " + alunoMaisAlto);
        System.out.println("Altura: " + maiorAltura + " cm");

        System.out.println("Aluno mais baixo: ");
        System.out.println("Número do aluno: " + alunoMaisBaixo);
        System.out.println("Altura: " + menorAltura + " cm");

        input.close();
    }
}