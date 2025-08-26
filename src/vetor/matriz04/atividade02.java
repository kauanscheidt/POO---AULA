package vetor.matriz04;

import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int TAM = 10;
        double[] num = new double[TAM];

        for (int i = 0; i < TAM ; i++) {
            System.out.println("Informe o "+ (i+1) +"º número:");
            num[i] = input.nextDouble();
        }
        for (int i = TAM; i > 0;) {
            i--;
            System.out.println(num[i]);
        }
    }
}
