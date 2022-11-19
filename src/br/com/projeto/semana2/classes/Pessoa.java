package br.com.projeto.semana2.classes;

public class Pessoa {
      
    public String nome; //paara serem atributos publicos

    public String telefone;

    public String endereco; //como usar a herança ?

    public Pessoa(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone; //vamos reaproveitar esse construtor
        this.endereco = endereco;
    }

}
