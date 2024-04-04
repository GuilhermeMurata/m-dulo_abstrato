package br.com.murata.abstrato;

public class pessoaFisica extends Pessoa{

    private long cpf;

    @Override
    public long caracteristicas() {
        return cpf;
    }
}
