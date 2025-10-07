package SistemaAcademico;

import java.util.List;

public class Fase {

    private int numero;
    private List<Disciplina> disciplinas;

    public Fase (int numero, List<Disciplina> disciplinas) {
        this.numero = numero;
        this.disciplinas = disciplinas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Fase [numero=");
        builder.append(this.numero);
        builder.append(", disciplinas=");
        builder.append(this.disciplinas);
        builder.append("]");
        return builder.toString();
    }
}
