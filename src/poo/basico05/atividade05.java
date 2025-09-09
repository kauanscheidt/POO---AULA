package poo.basico05;

public class atividade05 {

    public double getPreco(int codigo) {
        switch (codigo) {
            case 100:
                return 1.20;
            case 101:
                return 1.30;
            case 102:
                return 1.50;
            case 103:
                return 1.20;
            case 104:
                return 1.30;
            case 105:
                return 1.00;
            default:
                return 0.0;
        }
    }
}