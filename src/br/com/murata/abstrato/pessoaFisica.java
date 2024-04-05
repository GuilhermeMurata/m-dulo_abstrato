package br.com.murata.abstrato;

public class pessoaFisica extends Pessoa{

    private long cpf;

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    @Override
    public long caracteristicas() {
        return cpf;
    }
}
