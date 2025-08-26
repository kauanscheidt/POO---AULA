package vetor.matriz04;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        final int TAM = 10;
        Double[] media = new Double[TAM];
        boolean[] verificador = new boolean[TAM];
        double[] soma = new double[TAM];
        int contador = 0;

        System.out.println("Informe 4 notas de 10 alunos:");
            for (int i = 0; i < TAM; i++) {
                for (int j = 1; j <= 4; j++) {
                    System.out.print((i+1)+"º Aluno, Nota " + (j) + ": ");
                    double nota = input.nextDouble();
                    soma[i] += nota;
                }

                media[i] = soma[i] / 4;

                if (media[i] >= 7){
                    verificador[i] = true;
                    contador++;
                }
            }

        System.out.println("As médias foram:");
           for (int i = 0; i < TAM; i++) {
               System.out.print("["+df.format(media[i])+"] ");
           }

       System.out.println();

        System.out.println("O total de alunos com média maior ou igual a sete foram: "+contador+"!");
            for (int i = 0; i < TAM; i++) {
                if( verificador[i] ){
                    System.out.println("O "+(i+1)+"º aluno tem média maior ou igual a sete com: "+df.format(media[i])+".");
                }
            }

        input.close();
    }
}
