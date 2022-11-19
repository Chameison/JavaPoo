package br.com.projeto.semana2.classes;

public abstract class Pessoa { //DEIXANDO ABSTRATA, usamos abstract
      
    private String nome; //paara serem atributos publicos

    private String telefone;

    private String endereco; //como usar a herança ?

    public Pessoa(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone; //vamos reaproveitar esse construtor
        this.endereco = endereco;
    }

    public String getNome(){ //metodo geters 
        return nome;
    }
    public void setNome(String nome) { //metodo seters
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    

}
