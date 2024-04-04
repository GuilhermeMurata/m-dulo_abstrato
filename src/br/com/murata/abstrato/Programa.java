package br.com.murata.abstrato;

public class Programa {

    public static void main(String []args){
        pessoaFisica pessoa = new pessoaFisica();
        pessoa.setNome("Batista");
        pessoa.setIdade("18");
        System.out.println(pessoa.getNome() + " " + pessoa.getIdade());
    }
}
