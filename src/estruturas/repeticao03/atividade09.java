package estruturas.repeticao03;

import java.util.Scanner;

public class atividade09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o número que deseja imprimir a tabuada:");
        int num = input.nextInt();

        System.out.println("Tabuada de "+num);

        for (int i = 1; i <= 10; i++) {
            System.out.println(num+ " x " + i + " = " +num*i);
        }
    }
}
