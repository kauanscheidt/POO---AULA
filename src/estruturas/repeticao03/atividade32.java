package estruturas.repeticao03;

import java.util.Scanner;
import java.text.DecimalFormat;

public class atividade32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double codigoMaiorIndice = 0;
        double maiorIndiceAcidentes = -999999;

        double codigoMenorIndice = 0;
        double menorIndiceAcidentes = 999999;

        double somaVeiculos = 0;

        double somaAcidentesCidadesPequenas = 0;
        double contadorCidadesPequenas = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("--- Dados da Cidade " + i + " ---");
            System.out.println("Informe o código da cidade:");
            double codigoCidade = input.nextDouble();

            System.out.println("Informe o número de veículos de passeio:");
            double numVeiculos = input.nextDouble();

            System.out.println("Informe o número de acidentes com vítimas:");
            double numAcidentes = input.nextDouble();

            double indiceAcidentes = numAcidentes / numVeiculos;

            if (indiceAcidentes > maiorIndiceAcidentes) {
                maiorIndiceAcidentes = indiceAcidentes;
                codigoMaiorIndice = codigoCidade;
            }

            if (indiceAcidentes < menorIndiceAcidentes) {
                menorIndiceAcidentes = indiceAcidentes;
                codigoMenorIndice = codigoCidade;
            }

            somaVeiculos += numVeiculos;

            if (numVeiculos < 2000) {
                somaAcidentesCidadesPequenas += numAcidentes;
                contadorCidadesPequenas++;
            }
        }

        if (codigoMaiorIndice != 0) {
            System.out.println("O maior índice de acidentes é da cidade " + codigoMaiorIndice + ": " + df.format(maiorIndiceAcidentes));
            System.out.println("O menor índice de acidentes é da cidade " + codigoMenorIndice + ": " + df.format(menorIndiceAcidentes));
        } else {
            System.out.println("Nenhum dado válido foi inserido.");
        }

        double mediaVeiculos = somaVeiculos / 5;
        System.out.printf("A média de veículos nas cinco cidades é: %.2f%n", mediaVeiculos);

        if (contadorCidadesPequenas > 0) {
            double mediaAcidentesCidadesPequenas = somaAcidentesCidadesPequenas / contadorCidadesPequenas;
            System.out.printf("A média de acidentes nas cidades com menos de 2.000 veículos é: %.2f%n", mediaAcidentesCidadesPequenas);
        } else {
            System.out.println("Não há cidades com menos de 2.000 veículos.");
        }

        input.close();
    }
}