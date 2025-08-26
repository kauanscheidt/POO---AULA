package vetor.matriz04;

import java.util.Scanner;

public class atividade11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe palavras separadas por (;) (ex:curvello;rodrigo;) ");
        String palavras = input.nextLine();
        String[] separador = palavras.split(";");

        for (int i = 0; i < separador.length; i++)
        {
            System.out.print(separador[i] + " ");
        }

        input.close();
    }
}
