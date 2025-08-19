package estruturas.repeticao03;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosCandidato4 = 0;
        int votosNulos = 0;
        int votosBranco = 0;
        int totalVotos = 0;

        System.out.println("--- Eleição Presidencial ---");
        System.out.println("Candidatos:");
        System.out.println("1 - Baiano");
        System.out.println("2 - Carioca");
        System.out.println("3 - Mineiro");
        System.out.println("4 - Paulista");
        System.out.println("5 - Voto Nulo");
        System.out.println("6 - Voto em Branco");
        System.out.println("\nPara finalizar a votação, digite 0.");

        int voto = -1;

        while (voto != 0) {
            System.out.print("Informe seu voto: ");
            voto = input.nextInt();

            switch (voto) {
                case 1:
                    votosCandidato1++;
                    totalVotos++;
                    break;
                case 2:
                    votosCandidato2++;
                    totalVotos++;
                    break;
                case 3:
                    votosCandidato3++;
                    totalVotos++;
                    break;
                case 4:
                    votosCandidato4++;
                    totalVotos++;
                    break;
                case 5:
                    votosNulos++;
                    totalVotos++;
                    break;
                case 6:
                    votosBranco++;
                    totalVotos++;
                    break;
                case 0:
                    System.out.println("Votação encerrada.");
                    break;
                default:
                    System.out.println("Voto inválido. Tente novamente.");
                    break;
            }
        }

        double percentualNulos = 0;
        double percentualBranco = 0;

        if (totalVotos > 0) {
            percentualNulos = ((double) votosNulos / totalVotos) * 100;
            percentualBranco = ((double) votosBranco / totalVotos) * 100;
        }


        System.out.println("Total de votos para Baiano: " + votosCandidato1);
        System.out.println("Total de votos para Carioca: " + votosCandidato2);
        System.out.println("Total de votos para Mineiro: " + votosCandidato3);
        System.out.println("Total de votos para paulista: " + votosCandidato4);
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosBranco);

        System.out.println("Total de votos (válidos, nulos e brancos): " + totalVotos);

        System.out.println("Percentagem de votos nulos sobre o total: " + df.format(percentualNulos) + "%");
        System.out.println("Percentagem de votos em branco sobre o total: " + df.format(percentualBranco) + "%");

        input.close();
    }
}