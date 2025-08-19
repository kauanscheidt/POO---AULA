package estruturas.repeticao03;

import java.util.Scanner;

public class atividade22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o número total de votantes:");
        int totalVotantes = input.nextInt();

        if (totalVotantes <= 0) {
            System.out.println("O número de votantes deve ser maior que zero. Programa encerrado.");
            input.close();
            return;
        }

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosInvalidos = 0;

        for (int i = 1; i <= totalVotantes; i++) {
            System.out.println("Votante " + i + ":");
            System.out.println("Escolha seu candidato (1, 2 ou 3):");
            int voto = input.nextInt();

            if (voto == 1) {
                votosCandidato1++;
            } else if (voto == 2) {
                votosCandidato2++;
            } else if (voto == 3) {
                votosCandidato3++;
            } else {
                System.out.println("Voto inválido!");
                votosInvalidos++;
            }
        }

        System.out.println("Total de votantes: " + totalVotantes);
        System.out.println("Votos para o Candidato 1: " + votosCandidato1);
        System.out.println("Votos para o Candidato 2: " + votosCandidato2);
        System.out.println("Votos para o Candidato 3: " + votosCandidato3);

        if (votosInvalidos > 0) {
            System.out.println("Votos inválidos: " + votosInvalidos);
        }

        input.close();
    }
}