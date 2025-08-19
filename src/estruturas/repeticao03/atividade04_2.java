package estruturas.repeticao03;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade04_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0");


        boolean continuar = true;

        do {
            System.out.println("Informe a população da cidade A:");
                double popA = input.nextDouble();
            System.out.println("Informe a taxa de crescimento da cidade A (%):");
                double taxaA = input.nextDouble();
                taxaA = taxaA / 100;
            System.out.println("Informe a população da cidade B:");
                double popB = input.nextDouble();
            System.out.println("Informe a taxa de crescimento da cidade B (%):");
                double taxaB = input.nextDouble();
                taxaB = taxaB / 100;

            int ano = 0;

            //Se os dados forem inválidos
            if (popA > popB) {
                if (taxaA > taxaB) {
                    System.out.println("A população e a taxa de crescimento da cidade A é maior que a cidade B, a cidade B nunca vai ter uma população maiior!");
                }
            } else if (popB > popA) {
                if (taxaB > taxaA) {
                    System.out.println("A população e a taxa de crescimento da cidade B é maior que a cidade A, a cidade A nunca vai ter uma população maiior!");
                }
            }

            if (popA > popB) {
                if (taxaB > taxaA) {
                    while (popB < popA) {
                        popA = popA + (popA * taxaA);
                        popB = popB + (popB * taxaB);
                        ano++;
                    }
                    System.out.println("A quantidade de anos necessários para a população B, passar a população A foi: " + ano + " anos.");
                    System.out.println("A população final da cidade A é: " + df.format(popA) + " pessoas.");
                    System.out.println("A população final da cidade B é: " + df.format(popB) + " pessoas.");
                }
            } else if (popB > popA) {
                if (taxaA > taxaB) {
                    while (popA < popB) {
                        popA = popA + (popA * taxaA);
                        popB = popB + (popB * taxaB);
                        ano++;
                    }
                    System.out.println("A quantidade de anos necessários para a população A, passar a população B foi: " + ano + " anos.");
                    System.out.println("A população final da cidade A é: " + df.format(popA) + " pessoas.");
                    System.out.println("A população final da cidade B é: " + df.format(popB) + " pessoas.");
                }
            }

            System.out.println("Deseja informar novos dados? (S/N):");
                String verificador = input.next();
                    if (verificador.equalsIgnoreCase("s") || verificador.equalsIgnoreCase("sim")) {
                        System.out.println("Informe novos dados!");
                    } else if (verificador.equalsIgnoreCase("n") || verificador.equalsIgnoreCase("não")) {
                        System.out.println("Programa encerrado!");
                        continuar = false;
                    }
        } while (continuar);

        input.close();

    }
}
