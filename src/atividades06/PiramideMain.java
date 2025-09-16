package atividades06;

public class PiramideMain {

    public static void main(String[] args) {

        System.out.println("--- Exemplo 1 ---");
        Piramide p1 = new Piramide(13.89, 41.87, 3);
        System.out.println(p1);

        System.out.println("\n--- Exemplo 2 ---");
        Piramide p2 = new Piramide(3.56, 23.18, 1);
        System.out.println(p2);

        System.out.println("\n--- Exemplo 3 ---");
        Piramide p3 = new Piramide(85.34, 56.09, 2);
        System.out.println(p3);

        System.out.println("\n--- Exemplo 4 ---");
        Piramide p4 = new Piramide(1, 2, 1);
        System.out.println(p4);
    }
}