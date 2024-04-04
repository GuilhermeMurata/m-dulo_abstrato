package br.com.murata.abstrato;

public class pessoaJuridica extends Pessoa{

    public long cnpj;

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
