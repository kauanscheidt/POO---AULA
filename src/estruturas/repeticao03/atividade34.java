package estruturas.repeticao03;

import java.util.Scanner;

public class atividade34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cont0_25 = 0;
        int cont26_50 = 0;
        int cont51_75 = 0;
        int cont76_100 = 0;

        int numero;

        System.out.println("Informe números positivos (digite um número negativo para terminar):");

        while (true) {
            numero = input.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero <= 25) {
                cont0_25++;
            } else if (numero <= 50) {
                cont26_50++;
            } else if (numero <= 75) {
                cont51_75++;
            } else if (numero <= 100) {
                cont76_100++;
            }

        }

        System.out.println("Números no intervalo [0-25]: " + cont0_25);
        System.out.println("Números no intervalo [26-50]: " + cont26_50);
        System.out.println("Números no intervalo [51-75]: " + cont51_75);
        System.out.println("Números no intervalo [76-100]: " + cont76_100);

        input.close();
    }
}