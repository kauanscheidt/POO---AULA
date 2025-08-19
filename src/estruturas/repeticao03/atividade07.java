package estruturas.repeticao03;

import java.util.Scanner;

public class atividade07 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Informe um número inteiro:");
        int num1 = input.nextInt();
        System.out.println("Informe outro número inteiro:");
        int num2 = input.nextInt();

        if (num1<num2){
            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = num2; i <= num1; i++) {
                System.out.println(i);
            }
        }
    }
}
