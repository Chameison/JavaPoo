package br.com.projeto.semana2.classes;

import br.com.projeto.semana2.interfaces.ISaldo;

public abstract class Pessoa implements ISaldo { //DEIXANDO ABSTRATA, usamos abstract
      //com o implements ISAldo implementamos a interface
      //classes abstratas não sao obraigaas a fazer a implemetnacao dos metodos 
    private String nome; //paara serem atributos publicos

    private String telefone;

    private String endereco; //como usar a herança ?

    //para implementar a interface em Cliente e Diarista:
    private double saldo;

    public Pessoa(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone; //vamos reaproveitar esse construtor
        this.endereco = endereco;
        this.saldo = 0.0;
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
    
    public double getSaldo() {
        return saldo;
    }
    
    protected void setSaldo(double saldo) { //definimos o protected porque queremos que somente as classes que herdam de pessoas tenham acesso
        this.saldo = saldo;
    }
    

}
