package poo.basico05;

import java.util.Scanner;

public class atividade02_Main {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                atividade02 meuIntervalo = new atividade02();

                System.out.print("Informe o primeiro número do intervalo: ");
                meuIntervalo.setNumero1(input.nextInt());

                System.out.print("Informe o segundo número do intervalo: ");
                meuIntervalo.setNumero2(input.nextInt());

                input.close();

                String resultadoFinal = meuIntervalo.Intervalo();

                System.out.println(resultadoFinal);

    }
}
