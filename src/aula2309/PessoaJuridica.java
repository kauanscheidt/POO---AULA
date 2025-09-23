package aula2309;

public class PessoaJuridica extends Pessoa {

    private String Cnpj;

    public PessoaJuridica(String nome, String endereco) {
        super(nome);
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String cnpj) {
        Cnpj = cnpj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PessoaJuridica{");
        sb.append("nome='").append(getNome()).append('\'');
        sb.append(", Cnpj='").append(getCnpj()).append('\'');
        sb.append(", cnpj='").append(getCnpj()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
