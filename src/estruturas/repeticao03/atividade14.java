package estruturas.repeticao03;

import java.util.Scanner;

public class atividade14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o número de séries que deseja (n/m):");
        int n = input.nextInt();
        int m = 1;

        for (int i = 1; i <= n; i++){
            System.out.println(i+"/"+m);
            m = m + 2;
        }

        input.close();
    }
}
