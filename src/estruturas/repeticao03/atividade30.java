package estruturas.repeticao03;

import java.util.Scanner;

public class atividade30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cod, codAlto = 0, codBaixo = 0, codGordo = 0, codMagro = 0;
        double alt, pes;
        double alto = -9999, baixo = 9999, gordo = -9999, magro = 9999;
        double somaAlt = 0, somaPes = 0;
        int cont = 0;

        while (true) {
            System.out.print("Digite o código (0 encerra): ");
            cod = input.nextInt();
            if (cod == 0) break;

            System.out.print("Altura: ");
            alt = input.nextDouble();
            System.out.print("Peso: ");
            pes = input.nextDouble();

            if (alt > alto) { alto = alt; codAlto = cod; }
            if (alt < baixo) { baixo = alt; codBaixo = cod; }
            if (pes > gordo) { gordo = pes; codGordo = cod; }
            if (pes < magro) { magro = pes; codMagro = cod; }

            somaAlt += alt;
            somaPes += pes;
            cont++;
        }

        if (cont > 0) {
            System.out.println("\nMais alto: código " + codAlto + " com " + alto + "m");
            System.out.println("Mais baixo: código " + codBaixo + " com " + baixo + "m");
            System.out.println("Mais gordo: código " + codGordo + " com " + gordo + "kg");
            System.out.println("Mais magro: código " + codMagro + " com " + magro + "kg");
            System.out.println("Média alturas: " + (somaAlt / cont));
            System.out.println("Média pesos: " + (somaPes / cont));
        } else {
            System.out.println("Nenhum cliente registrado.");
        }

        input.close();
    }
}
