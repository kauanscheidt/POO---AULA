package estruturas.repeticao03;

import java.util.Scanner;

public class atividade18 {
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        int num = input.nextInt();

        int contador = 0;
        boolean primo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                System.out.println("O número" +num+ " é divisível por: "+i);
                contador++;
            }
        }

        int totalContador = contador + 2;

        if (primo) {
            System.out.println("O número "+num+ " é primo!");
            System.out.println("o número "+num+" é divísível somente por 1 e por ele mesmo!");
            System.out.println("o número "+num+ " é divisível por "+totalContador+ " números!");
        } else {
            System.out.println("O número "+num+ " não é primo!");
            System.out.println("O número "+num+" é divisível por mais números além de 1 e ele mesmo!");
            System.out.println("o número "+num+ " é divisível por "+totalContador+ " números!");
        }

        input.close();
    }
}
