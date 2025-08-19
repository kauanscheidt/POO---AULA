package estruturas.repeticao03;

import java.util.Scanner;

public class atividade11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contadorPar = 0;
        int contadorImpar = 0;

        for (int i = 1; i <= 10; i++){
            System.out.println("Informe um número inteiro:");
            int num = input.nextInt();
                if (num % 2 == 0) {
                    contadorPar++;
                } else {
                    contadorImpar++;
                }
        }

        System.out.println("A quantidade de números pares foi: " + contadorPar);
        System.out.println("A quantidade de números impares foi: " + contadorImpar);

        input.close();
    }
}
