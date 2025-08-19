package estruturas.repeticao03;

import java.util.Scanner;

public class atividade29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe qual número deseja fazer a tabuada:");
            int num = input.nextInt();
        System.out.println("Informe o número inicial da tabuada (maior ou igual a 0):");
            int inicial = input.nextInt();
        System.out.println("Informe o número final da tabuada (maior ou igual a 0):");
            int ultimo = input.nextInt();

        if (ultimo < inicial) {
            System.out.println("O número final da tabuada é menor que o inicial, então serão invertidos.");
                int aux = ultimo;
                ultimo = inicial;
                inicial = aux;
        }

        System.out.println("Vou montar a tabuada de "+num+" começando em "+inicial+" e terminando em "+ultimo+":");
        for (int i = inicial; i <= ultimo; i++) {
            System.out.println(num+" x "+i+" = "+num * i);
        }

        input.close();
    }
}
