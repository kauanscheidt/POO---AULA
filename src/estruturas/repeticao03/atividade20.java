package estruturas.repeticao03;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double media = 0;
        int num;
        boolean verifica;
        do {
            verifica = true;
            System.out.println("Informe quantas notas você deseja cacular a média:");
            num = input.nextInt();

            if (num <= 1) {
                System.out.println("Media impossível! Informe um valor maior que 1!");
                verifica = false;
            }
        } while (!verifica);

        for (int i = 1; i <= num; i++){
            System.out.println("Informe a "+i+"ª nota:");
            double nota = input.nextDouble();
            media = media + nota;
        }

        media = media / num;
        System.out.println("Media final: " + df.format(media));

        input.close();
    }
}
