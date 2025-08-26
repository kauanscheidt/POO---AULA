package vetor.matriz04;

import java.util.Scanner;

public class atividade12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int TAM = 5;
        String[] nome = new String[TAM];
        Integer[] idade = new Integer[TAM];
        Double[] altura = new Double[TAM];

        double somaIdade = 0;
        double somaAltura = 0;

        System.out.println("Informe os dados de 5 pessoas:");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Nome da pessoa " + (i + 1) + ": ");
            nome[i] = input.nextLine();

            System.out.print("Idade de " + nome[i] + " (em anos): ");
            idade[i] = Integer.parseInt(input.nextLine());

            System.out.print("Altura de " + nome[i] + " (em metros, ex: 1.75): ");
            altura[i] = Double.parseDouble(input.nextLine());
            System.out.println();

            somaIdade += idade[i];
            somaAltura += altura[i];
        }

        for (int i = TAM - 1; i >= 0; i--) {
            System.out.println("Nome: " + nome[i] + ", Idade: " + idade[i] + " anos, Altura: " + altura[i] + "m");
        }

        int indiceVelho = 0;
        int indiceNovo = 0;
        int indiceAlto = 0;
        int indiceBaixo = 0;

        for (int i = 1; i < TAM; i++) {
            if (idade[i] > idade[indiceVelho]) {
                indiceVelho = i;
            }
            if (idade[i] < idade[indiceNovo]) {
                indiceNovo = i;
            }
            if (altura[i] > altura[indiceAlto]) {
                indiceAlto = i;
            }
            if (altura[i] < altura[indiceBaixo]) {
                indiceBaixo = i;
            }
        }

        System.out.println("Mais velho: " + nome[indiceVelho] + " com " + idade[indiceVelho] + " anos e " + altura[indiceVelho] + "m de altura.");
        System.out.println("Mais novo: " + nome[indiceNovo] + " com " + idade[indiceNovo] + " anos e " + altura[indiceNovo] + "m de altura.");
        System.out.println("Mais alto: " + nome[indiceAlto] + " com " + idade[indiceAlto] + " anos e " + altura[indiceAlto] + "m de altura.");
        System.out.println("Mais baixo: " + nome[indiceBaixo] + " com " + idade[indiceBaixo] + " anos e " + altura[indiceBaixo] + "m de altura.");

        double mediaIdade = somaIdade / TAM;
        double mediaAltura = somaAltura / TAM;

        System.out.println("\n--- Análise das Médias ---");
        System.out.printf("Média de Idade: %.1f anos\n", mediaIdade);
        System.out.printf("Média de Altura: %.2f m\n", mediaAltura);

        System.out.println("\nPessoas com idade ACIMA da média:");
        for (int i = 0; i < TAM; i++) {
            if (idade[i] > mediaIdade) {
                System.out.println("- " + nome[i] + " (" + idade[i] + " anos)");
            }
        }

        System.out.println("\nPessoas com idade ABAIXO da média:");
        for (int i = 0; i < TAM; i++) {
            if (idade[i] < mediaIdade) {
                System.out.println("- " + nome[i] + " (" + idade[i] + " anos)");
            }
        }

        System.out.println("\nPessoas com altura ACIMA da média:");
        for (int i = 0; i < TAM; i++) {
            if (altura[i] > mediaAltura) {
                System.out.println("- " + nome[i] + " (" + altura[i] + "m)");
            }
        }

        System.out.println("\nPessoas com altura ABAIXO da média:");
        for (int i = 0; i < TAM; i++) {
            if (altura[i] < mediaAltura) {
                System.out.println("- " + nome[i] + " (" + altura[i] + "m)");
            }
        }

        input.close();
    }
}