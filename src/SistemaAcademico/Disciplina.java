package SistemaAcademico;

import java.util.List;

public class Disciplina {

    private String nome;
    private List<Frequencia> frequencias;
    private List<Avaliacao> avaliacoes;
    private List<Professor> professores;
    private List<Aluno> alunos;

    public Disciplina(String nome, List<Frequencia> frequencias, List<Avaliacao> avaliacoes, List<Professor> professores, List<Aluno> alunos){
        this.nome = nome;
        this.frequencias = frequencias;
        this.avaliacoes = avaliacoes;
        this.professores = professores;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Frequencia> getFrequencias() {
        return frequencias;
    }

    public void setFrequencias(List<Frequencia> frequencias) {
        this.frequencias = frequencias;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Disciplina [nome= ");
        builder.append(this.nome);
        builder.append(", frequencia= ");
        builder.append(this.frequencias);
        builder.append(", avaliacoes= ");
        builder.append(this.avaliacoes);
        builder.append(", professores= ");
        builder.append(this.professores);
        builder.append(", alunos= ");
        builder.append(this.alunos);
        builder.append("]");
        return builder.toString();
    }
}
