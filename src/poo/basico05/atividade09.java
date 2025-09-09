package poo.basico05;

public class atividade09 {

    private int canalAtual;
    private int volume;
    private boolean ligada;

    private static final int VOLUME_MAXIMO = 100;
    private static final int VOLUME_MINIMO = 0;
    private static final int CANAL_MAXIMO = 999;
    private static final int CANAL_MINIMO = 1;

    public atividade09() {
        this.canalAtual = CANAL_MINIMO;
        this.volume = 20;
        this.ligada = false;
    }

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void aumentarVolume() {
        if (ligada && this.volume < VOLUME_MAXIMO) {
            this.volume++;
        }
    }

    public void diminuirVolume() {
        if (ligada && this.volume > VOLUME_MINIMO) {
            this.volume--;
        }
    }

    public void setCanal(int novoCanal) {
        if (ligada && novoCanal >= CANAL_MINIMO && novoCanal <= CANAL_MAXIMO) {
            this.canalAtual = novoCanal;
        }
    }

    public String getStatus() {
        if (!ligada) {
            return "TV está desligada.";
        } else {
            return "TV Ligada | Canal: " + this.canalAtual + " | Volume: " + this.volume;
        }
    }

    public boolean isLigada() {
        return ligada;
    }
}