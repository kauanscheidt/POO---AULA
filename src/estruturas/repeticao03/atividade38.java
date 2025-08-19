package estruturas.repeticao03;

import java.util.Scanner;

public class atividade38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número inteiro positivo:");
        int numero = input.nextInt();

        if (numero < 0) {
            System.out.println("O número deve ser positivo.");
        } else {
            System.out.print("O número invertido é: ");

            int digito;
            while (numero > 0) {
                digito = numero % 10;
                System.out.print(digito);
                numero = numero / 10;
            }
            System.out.println();
        }

        input.close();
    }
}