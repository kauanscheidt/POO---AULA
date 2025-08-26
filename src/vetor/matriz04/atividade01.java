package vetor.matriz04;

import java.util.Scanner;

public class atividade01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Informe o "+ (i+1) +"º número:");
            num[i] = input.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        input.close();
    }
}
