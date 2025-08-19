package estruturas.repeticao03;

import java.util.Scanner;

public class atividade10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número inteiro base:");
        int base = input.nextInt();
        System.out.println("Informe o expoente:");
        int expoente = input.nextInt();

        int num = 1;

        for (int i = 1; i <= expoente; i++) {
            num = num * base;
        }
        System.out.println("O resultado da potência de base " +base+ " elavado em " +expoente+ " é: " + num);
    }
}
