package estruturas.repeticao03;

import java.util.Scanner;
import java.util.ArrayList;

public class atividade19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> listaPrimos = new ArrayList<>();

        System.out.println("Informe até que número deseja calcular números primos (min. 1):");
        int num = input.nextInt();


        int contador = 0;


            for (int i = 2; i <= num; i++){
                boolean ehPrimo = true;
                    for (int j = 2; j * j <= i; j++){
                        contador++;
                        if (i % j == 0){
                            ehPrimo = false;
                            break;
                }
            }

            if (ehPrimo){
                listaPrimos.add(i);
            }
        }

        System.out.println("Os números primos entre 1 e " + num + " são: " + listaPrimos);
        System.out.println("Total de divisões executadas: " + contador);

        input.close();
    }
}