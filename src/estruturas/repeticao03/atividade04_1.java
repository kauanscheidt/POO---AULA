package estruturas.repeticao03;

import java.text.DecimalFormat;

public class atividade04_1 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0");

        double popA = 80000;
        double popB = 200000;
        double taxaA = 0.03;
        double taxaB = 0.015;
        int ano = 0;

        while (popA < popB){
            popA = popA + (popA * taxaA);
            popB = popB + (popB * taxaB);
            ano ++;
        }

    System.out.println("A quantidade de anos necessários para a população A, passar a população B foi: "+ano +" anos.");
    System.out.println("A população final da cidade A é: "+df.format(popA) + " pessoas.");
    System.out.println("A população final da cidade B é: "+df.format(popB) + " pessoas.");

    }
}
