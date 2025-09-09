package poo.basico05;

import java.util.Scanner;

public class atividade05_Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            atividade05 cardapio = new atividade05(); // Cria o objeto que sabe os preços

            double totalGeral = 0.0;

            System.out.println("(Digite o código 0 para finalizar o pedido)");

            while (true) {
                System.out.print("Digite o código do produto: ");
                int codigo = input.nextInt();
                if (codigo == 0) {
                    break;
                }

                double precoUnitario = cardapio.getPreco(codigo);

                if (precoUnitario > 0) {
                    System.out.print("Digite a quantidade: ");
                    int quantidade = input.nextInt();

                    double subtotal = precoUnitario * quantidade;
                    System.out.println("Subtotal do item: R$"+ subtotal);
                    totalGeral += subtotal;

                } else {
                    System.out.println("Código de produto inválido. Tente novamente.");
                }
            }



            System.out.println("VALOR TOTAL A PAGAR: R$ "+ totalGeral);

            input.close();
        }
    }
