package br.com.projeto.semana2.classes;


public class Cliente extends Pessoa{
    // public String nome; Podemos apagar esses arquivos

    // public String telefone;

    // public String  endereco;
    public double saldo;
    public boolean ativo;
    public Cliente(String nome, String telefone, String endereco, double saldo){
        super(nome, telefone, endereco); //usamos esse metoddo para herdar o construtor
        this.saldo = saldo;
    }
  
}
