package br.com.murata.abstrato;

public class Programa {

    public static void main(String []args){
        pessoaFisica pessoaFisica = new pessoaFisica();
        pessoaFisica.setNome("Batista");
        pessoaFisica.setIdade("18");
        pessoaFisica.setCpf(123123123L);

        pessoaJuridica pessoaJuridica = new pessoaJuridica();
        pessoaJuridica.setNome("Itau");
        pessoaJuridica.setIdade("50");
        pessoaJuridica.setCnpj(1412412421L);


        System.out.println(pessoaFisica.getNome() + " " + pessoaFisica.getCpf());
        System.out.println(pessoaJuridica.getNome() + " " + pessoaJuridica.getCnpj());
    }
}
