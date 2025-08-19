package estruturas.repeticao03;

import java.util.Scanner;

public class atividade13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número inteiro para calcular seu fatorial:");
        int num = input.nextInt();
        int resultado = num;

        for (int i = 1; i < num; i++) {
            resultado = resultado * i;
        }

        System.out.println("O resultado de "+num+" fatorial é: "+resultado);

        input.close();
    }
}
