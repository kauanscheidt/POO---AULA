package aula2309;

public class PessoaMain {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Kauan", "Rio do Sul");
        System.out.println(p);

        PessoaFisica pf = new PessoaFisica("Kauan");
        pf.setEndereco("Rio do Sul");
        pf.setCPF("066.703.759-48");
        System.out.println(pf);

        PessoaJuridica pj = new PessoaJuridica();
        pf.setEndereco("Rio do Sul");
        pj.setCnpj("09.346.601/0001-25");
        System.out.println(pj);
    }
}
