package poo.basico05;

import java.util.Scanner;

public class atividade10b_Main {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            atividade10b bomba = new atividade10b("Gasolina", 5.79, 1000.0);
            int opcao;

            do {
                System.out.println("Bomba com  - R$  - Restam  L" + bomba.getTipoCombustivel()+ bomba.getValorLitro()+ bomba.getQuantidadeCombustivel());
                System.out.println("1 - Abastecer por Valor");
                System.out.println("2 - Abastecer por Litro");
                System.out.println("3 - Alterar Valor do Litro");
                System.out.println("4 - Alterar Tipo de Combustível");
                System.out.println("5 - Reabastecer Bomba");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");
                opcao = input.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o valor (R$): ");
                        double valor = input.nextDouble();
                        bomba.abastecerPorValor(valor);
                        break;
                    case 2:
                        System.out.print("Digite a quantidade (Litros): ");
                        double litros = input.nextDouble();
                        bomba.abastecerPorLitro(litros);
                        break;
                    case 3:
                        System.out.print("Digite o novo valor do litro: ");
                        double novoValor = input.nextDouble();
                        bomba.alterarValor(novoValor);
                        break;
                    case 4:
                        System.out.print("Digite o novo tipo de combustível: ");
                        input.nextLine();
                        String novoTipo = input.nextLine();
                        bomba.alterarCombustivel(novoTipo);
                        break;
                    case 5:
                        System.out.print("Digite a nova quantidade total da bomba: ");
                        double novaQtde = input.nextDouble();
                        bomba.alterarQuantidadeCombustivel(novaQtde);
                        break;
                    case 0:
                        System.out.println("Encerrando...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } while (opcao != 0);

            input.close();
        }
    }
