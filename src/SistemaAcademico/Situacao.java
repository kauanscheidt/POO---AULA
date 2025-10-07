package SistemaAcademico;

import java.util.List;

public class Situacao {

    private List<Aluno> alunos;
    private List<Disciplina> disciplinas;

    public Situacao(List<Aluno> alunos, List<Disciplina> disciplinas) {
        this.alunos = alunos;
        this.disciplinas = disciplinas;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Situacao [alunos=");
        builder.append(this.alunos);
        builder.append(", disciplinas=");
        builder.append(this.disciplinas);
        builder.append("]");
        return builder.toString();
    }
}
