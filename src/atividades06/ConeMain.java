package atividades06;

public class ConeMain {
    public static void main(String[] args) {

        System.out.println("--- Exemplo 1 ---");
        Cone cone1 = new Cone(6, 8, 1);
        System.out.println(cone1.toString());

        System.out.println("\n--- Exemplo 2 ---");
        Cone cone2 = new Cone(3.5, 9, 2);
        System.out.println(cone2.toString());

        System.out.println("\n--- Exemplo 3 ---");
        Cone cone3 = new Cone(20, 13.9, 2);
        System.out.println(cone3.toString());

        System.out.println("\n--- Exemplo 4 ---");
        Cone cone4 = new Cone(37.78, 16.53, 3);
        System.out.println(cone4.toString());
    }
}