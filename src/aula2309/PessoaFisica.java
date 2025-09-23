package aula2309;

public class PessoaFisica extends Pessoa {

    private String CPF;

    public PessoaFisica(String nome) {
        super(nome);
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
            this.CPF = CPF;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PessoaFisica{");
        sb.append("CPF='").append(getCPF()).append('\'');
        sb.append(", nome='").append(getNome()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
