package vetor.matriz04;

import java.util.Scanner;

public class atividade04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int TAM = 10;
        String letra[] = new String [TAM];
        boolean[] consoante = new boolean[TAM];
        int contador = 0;

        System.out.println("Informe 10 caracteres, vou dizer quantos são consoantes!");
            for (int i = 0; i < TAM; i++) {
                System.out.println(i+1+"º caracter:");
                letra[i] = input.next();
                    if (letra[i].equalsIgnoreCase("A") || letra[i].equalsIgnoreCase("E") || letra[i].equalsIgnoreCase("I") || letra[i].equalsIgnoreCase("O")  || letra[i].equalsIgnoreCase("U")) {
                        consoante[i] = false;
                    } else {
                        consoante[i] = true;
                        contador++;
                    }
            }

        System.out.println("Foram inseridos "+contador+" consoantes!");
            for (int i = 0; i < TAM; i++) {
                if (consoante[i]){
                    System.out.println(letra[i]+" é consoante!");
                }
            }


        input.close();
    }
}
