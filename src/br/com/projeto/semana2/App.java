package br.com.projeto.semana2;

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


    System.out.println("Nome: " + diarista.nome);
    System.out.println("Telefone: " + diarista.telefone);
    System.out.println("Endereço: " + diarista.endereco);
    System.out.println("Chave pix: " + diarista.chavePix);

    diarista.atender("Joaozinho"); //chamada do metodo atender

    var cliente = new Cliente("Leonidas", "(68) 99999999", "TRAVESSA", 2000);
    System.out.println("Nome: " + cliente.nome);
    System.out.println("Telefone: " + cliente.telefone);
    System.out.println("Endereço: " + cliente.endereco);
    System.out.println("Saldo: " + cliente.saldo);



    // joao.atender("Joaozinho"); //chamada do metodo atender



    }
}
//Ala 04 herença - -usamos quando queremos reaproveitar o codigo em diferentes classes
//nao posso ter mais de uma classe publica




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
