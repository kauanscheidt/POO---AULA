package vetor.matriz04;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        final int TAM = 4;
        double soma = 0;
        double notas[] = new double[TAM];

        System.out.println("Informe 4 notas para calcularmos a média");
            for (int i = 0; i < TAM; i++) {
                System.out.println("Nota " + (i + 1) + ": ");
                notas[i] = input.nextDouble();
                soma += notas[i];
            }

        System.out.println("As 4 notas informadas foram:");
            for (int i = 0; i < TAM; i++) {
                System.out.println(notas[i]);
            }

        double media = soma / TAM;

        System.out.println("A média é: "+df.format(media));

        input.close();
    }
}
