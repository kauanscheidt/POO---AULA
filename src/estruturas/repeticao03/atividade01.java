package estruturas.repeticao03;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double nota;

        do {
            System.out.println("Informe uma nota de 0 a 10:");
            nota = input.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("ERRO: Informe uma nota válida");
                }
        } while (nota < 0 || nota > 10);

        System.out.println("A nota informada foi "+ df.format(nota));

        input.close();
    }
}
