package poo.basico05;

import java.util.Scanner;

public class atividade01_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        atividade01 p = new atividade01();

        System.out.println("Informe seu primeiro nome:");
        p.setNome(input.nextLine());

        System.out.println("Informe seu Sobrenome:");
        p.setSobrenome(input.nextLine());

        input.close();

        System.out.println("Seu nome completo é: " + p.getNome() + " " + p.getSobrenome());
    }
}
