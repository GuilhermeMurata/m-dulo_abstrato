package br.com.murata.abstrato;

public class pessoaJuridica extends Pessoa{

    private long cnpj;

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public long caracteristicas() {
        return cnpj;
    }
}
