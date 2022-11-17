package br.com.projeto.semana2;

import br.com.projeto.semana2.classes.Diarista; //aqui a importação

public class App {
    public static void main(String[] args) {
    //Passo #02
        //constructor nada mais é do que um metodo para construir objeto e gerar instancia do objeto
    var joao = new Diarista(); //classe diariista esta em outro local, vamos importar
    joao.nome = "Chameison Araujo";
    joao.telefone = "(68) 99950-5446";
    joao.endereco = "Montanhes 1517";


    System.out.println("Nome: " + joao.nome);
    System.out.println("Telefone: " + joao.telefone);
    System.out.println("Endereço: " + joao.endereco);

    joao.atender("Joaozinho"); //chamada do metodo atender

    var maria = new Diarista(); //classe diariista esta em outro local, vamos importar
    maria.nome = "Maria Araujo";
    maria.telefone = "(68) 99920-5446";
    maria.endereco = "Tancredo 1517";


    System.out.println("Nome: " + maria.nome);
    System.out.println("Telefone: " + maria.telefone);
    System.out.println("Endereço: " + maria.endereco);



    }
}