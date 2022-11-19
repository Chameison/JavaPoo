package br.com.projeto.semana2.interfaces;

public interface ISaldo { 
    //vamos definir quais sao os metodos que as classes que utilizam devem implementar
    //devem ter dois metodos?: sacar e depositar
    //nao é necessario definir como public, pois todos os metodos definidos em inteface sao por padrao public
    void sacar(double valor);
    void depositar(double valor);
}
