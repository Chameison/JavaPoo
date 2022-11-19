package br.com.projeto.semana2;

import br.com.projeto.semana2.classes.Atendimento;
import br.com.projeto.semana2.classes.Cliente;
import br.com.projeto.semana2.classes.Diarista; //aqui a importação

public class App {
    public static void main(String[] args) {
    //Passo #02
        //constructor nada mais é do que um metodo para construir objeto e gerar instancia do objeto
    var diarista = new Diarista("Chameison Lima", "(68) 99950-5446", "MOntanhes, 1517", "1qas2e23e2e2we2e"); //classe diariista esta em outro local, vamos importar
    // joao.nome = "Chameison Araujo";
    // joao.telefone = "(68) 99950-5446";
    // joao.endereco = "Montanhes 1517";
 

    System.out.println("Nome: " + diarista.getNome());
    System.out.println("Telefone: " + diarista.getTelefone());
    System.out.println("Endereço: " + diarista.getEndereco());
    System.out.println("Chave pix: " + diarista.getChavePix());

    diarista.atender("Joaozinho"); //chamada do metodo atender

    var cliente = new Cliente("Leonidas", "(68) 99999999", "TRAVESSA", 2000);
    System.out.println("Nome: " + cliente.getNome());
    System.out.println("Telefone: " + cliente.getTelefone());
    System.out.println("Endereço: " + cliente.getEndereco());
    System.out.println("Saldo: " + cliente.getSaldo());

        //poderiamos fazer isso aqui. por isso classes abstratas. 
    // var pessoa = new Pessoa(null, null, null); //apos alteramos para abstrato, deu erro nessa linha, pois ela é abstrata e pode ser aplicada somente atraves das subclasses

    // joao.atender("Joaozinho"); //chamada do metodo atender

    var atendimento = new Atendimento(); //depende das regras do negocio
    atendimento.setHoras(10);
    System.out.println(atendimento.getHoras());



    }
}
//Ala 04 herença - -usamos quando queremos reaproveitar o codigo em diferentes classes
//nao posso ter mais de uma classe publica
//aula 05 encapsulamento - nada mais é do que uma forma de eu definir o nivel de acesso dos meus atributos, dos metodos para as classes
//temos oo public que da acesso a todos 
//temos o private que apenas dentro da classse temos acesso
//protetced somente as classes ou subclasses terao acesso a esses atributos

// Pojo, pplain old java object -- Objeto java antigo +_ ; é ,mais ou menos uma padronização de como deveria ser uma classe
//ela diz que todos os atributos devem ser privados ou protegidos, usando metodos geters e seters, get, set


    // var maria = new Diarista("Maria Araujo", "(68) 99920-5446","Tancredo 1517" ); //classe diariista esta em outro local, vamos importar
    // // maria.nome = "Maria Araujo";
    // // maria.telefone = "(68) 99920-5446";
    // // maria.endereco = "Tancredo 1517";

    // // var jose = new Diarista("JOSE");
    // System.out.println("Nome: " + maria.nome);
    // System.out.println("Telefone: " + maria.telefone);
    // System.out.println("Endereço: " + maria.endereco);

    // System.out.println("Nome: " + jose.nome);
    // System.out.println("Telefone: " + jose.telefone);
    // System.out.println("Endereço: " + jose.endereco);
