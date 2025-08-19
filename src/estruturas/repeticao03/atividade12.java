package estruturas.repeticao03;

import java.util.Scanner;

public class atividade12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe qual termo da Série de Fibonacci você deseja calcular:");
        int n = input.nextInt();

        if (n == 1) {
            System.out.println("O " + n + "º termo da série de Fibonacci é: 0");
        } else if (n == 2) {
            System.out.println("O " + n + "º termo da série de Fibonacci é: 1");
        } else {
            int aux1 = 0;
            int aux2 = 1;
            int num = 0;

            for (int i = 3; i <= n; i++) {
                num = aux1 + aux2;
                aux1 = aux2;
                aux2 = num;
            }

            System.out.println("O " + n + "º termo da série de Fibonacci é: " + num);
        }

        input.close();
    }
}