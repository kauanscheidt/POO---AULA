package estruturas.repeticao03;

import java.util.Scanner;

public class atividade17 {
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        int num = input.nextInt();


        boolean primo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo) {
            System.out.println("O número "+num+ " é primo!");
        } else {
            System.out.println("O número "+num+ " não primo!");
        }

        input.close();
    }
}
