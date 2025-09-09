package poo.basico05;

import java.util.Scanner;

public class atividade09_Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        atividade09 minhaTV = new atividade09();

        int opcao;

        do {
            System.out.println(minhaTV.getStatus());
            System.out.println("1 - Ligar / Desligar TV");
            System.out.println("2 - Aumentar Volume");
            System.out.println("3 - Diminuir Volume");
            System.out.println("4 - Mudar de Canal");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    if (minhaTV.isLigada()) {
                        minhaTV.desligar();
                    } else {
                        minhaTV.ligar();
                    }
                    break;
                case 2:
                    minhaTV.aumentarVolume();
                    break;
                case 3:
                    minhaTV.diminuirVolume();
                    break;
                case 4:
                    System.out.print("Digite o número do canal: ");
                    int novoCanal = input.nextInt();
                    minhaTV.setCanal(novoCanal);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);

        input.close();
    }
}