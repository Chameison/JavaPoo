package br.com.projeto2.semana2.models;

public class  Diarista extends Pessoa {

    public Diarista() {
    }

    public Diarista(Long id, String nome, String telefone, String cpf, String endereco) {
        super(id, nome, telefone, cpf, endereco);
    }
    
    
}
//depois dos passsos em pessoa, crie Diarista, extends por ser uma classe que vai ter herança de pessoa