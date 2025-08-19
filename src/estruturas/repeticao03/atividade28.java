package estruturas.repeticao03;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println("Informe a quantidade de temperaturas que deseja calcular:");
        double qntTemp = input.nextDouble();

        double maior = -99999;
        double menor = 99999;
        double soma = 0;

        for (int i = 1; i <= qntTemp; i++ ) {
            System.out.println("Informe a "+i+"º temperatura:");
            double temp = input.nextDouble();

            if (temp > maior) {
                maior = temp;
            }
            if (temp < menor) {
                menor = temp;
            }
            soma = soma + temp;
        }

        double media = soma / qntTemp;

        System.out.println("Maior temperatura: " + df.format(maior)+"ºC");
        System.out.println("Menor temperatura: " + df.format(menor)+"ºC");
        System.out.println("Media das temperaturas: " + df.format(media)+"ºC");

        input.close();
    }
}
