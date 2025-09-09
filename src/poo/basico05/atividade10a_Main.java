package poo.basico05;

import java.util.Scanner;

public class atividade10a_Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        atividade10a bomba = new atividade10a("Gasolina Comum", 5.25, 1000.0);

        int opcao;

        do {
            System.out.println("Combustível: " + bomba.getTipoCombustivel());
            System.out.println("Preço por Litro: R$"+ bomba.getValorLitro());
            System.out.println("Quantidade na Bomba: litros"+ bomba.getQuantidadeCombustivel());
            System.out.println("1 - Abastecer por Valor (R$)");
            System.out.println("2 - Abastecer por Litro");
            System.out.println("3 - Alterar Valor do Litro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser abastecido: R$ ");
                    double valor = input.nextDouble();
                    bomba.abastecerPorValor(valor);
                    System.out.println("Abastecimento realizado.");
                    break;
                case 2:
                    System.out.print("Digite a quantidade em litros: ");
                    double litros = input.nextDouble();
                    double valorAPagar = litros * bomba.getValorLitro();
                    bomba.abastecerPorLitro(litros);
                    System.out.println("Total a pagar: R$ "+ valorAPagar);
                    break;
                case 3:
                    System.out.print("Digite o novo valor por litro: R$ ");
                    double novoValor = input.nextDouble();
                    bomba.setValorLitro(novoValor);
                    System.out.println("Valor alterado.");
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);

        input.close();
    }
}