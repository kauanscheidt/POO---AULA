package atividades06;

public class CuboMain {

    public static void main(String[] args) {

        System.out.println("--- Exemplo 1 ---");
        Cubo cubo1 = new Cubo(4.0, 2.0, 1);
        System.out.println(cubo1);


        System.out.println("\n--- Exemplo 2 ---");
        Cubo cubo2 = new Cubo(13.56, 1.5, 3);
        System.out.println(cubo2);


        System.out.println("\n--- Exemplo 3 ---");
        Cubo cubo3 = new Cubo(107.45, 12.5, 2);
        System.out.println(cubo3);
    }
}